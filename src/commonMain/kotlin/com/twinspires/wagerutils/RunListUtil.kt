package com.twinspires.wagerutils

import com.twinspires.wagerutils.models.Wager
import com.twinspires.wagerutils.models.WagerModifiers
import kotlin.js.JsExport

/**
 * A utility class with methods for parsing and manipulating
 * lists of runners in a wager, as well as extracting
 * wager modifier information. It's constructor is internal,
 * as client's cannot create an instance. However, there
 * are some companion properties that clients can access.
 */
@JsExport
class RunListUtil internal constructor(){
    companion object {
        /**
         * Separator used to delimit runners in a list of selected runners
         */
        const val RUNNER_SEPARATOR = ","

        /**
         * Separator used to delimit legs/positions in a list of selected runners
         * for a multi-race or multi-position (exotic) wager.
         */
        const val LEG_SEPARATOR = ",WT,"

        /**
         * A regex pattern for matching a single runner in a longer list of runners
         */
        private const val runner = "[1-9][0-9]*"

        /**
         * A regex pattern for matching a list of runners in a longer runner list for exotics, multi-race wagers, etc.
         */
        private const val runners = "[1-9][0-9]*(?:,[1-9][0-9]*)*"

        /**
         * A pattern and RegEx to match ANY valid run list
         */
        private const val runList = """(?:(?:KY|BX|BN|WT|[1-9][0-9]*),)*(?:KY|BX|BN|WT|[1-9][0-9]*)"""
        internal val runListPattern = Regex(runList)

        /**
         * A pattern and RegEx to match a Box modifier run list
         */
        private const val box = """^BX,($runners)$"""
        private val boxPattern = Regex(box)

        /**
         * A pattern and RegEx to match a Key modifier run list
         */
        private const val key = """^KY,($runner),($runners)$"""
        private val keyPattern = Regex(key)

        /**
         * A pattern and RegEx to match a Key Box modifier run list
         */
        private const val keyBox = """^B[NX],($runners),WT,($runners)$"""
        private val keyBoxPattern = Regex(keyBox)

        /**
         * A pattern and RegEx to match a Straight modifier run list
         */
        private const val straight = """^(?<!(B[NX]|KY))$runner($runner|,|WT)+$"""
        private val straightPattern = Regex(straight)
    }

    /**
     * De-constructs a simple comma separated list of runners into a
     * proper List object, containing an item for each runner.
     *
     * @param runList - A comma separated list of runners
     * @return - A List<String> with each item being one runner.
     */
    internal fun getRunners(runList: String) = runList.split(RUNNER_SEPARATOR)

    /**
     * Calculates the number of runners in a simple comma separated runner list.
     *
     * @param runList - A comma separated list of runners
     * @return - The number of runners in the list.
     */
    internal fun getNumberOfRunners(runList: String) = getRunners(runList).size

    /**
     * Removes any "key" runners from the list of "with" runners,
     * and returns the updated list of "with" runners.
     *
     * @param key - A comma separated list of key runners (or a single key runner).
     * @param with - A comma separated list of "with" runners.
     *
     * @return - A List of "with" runners, with any "key" runners removed.
     */
    internal fun getNonKeyRunners(key: String, with: String): List<String> {
        return getNonKeyRunners(listOf(key), with)
    }

    /**
     * Removes any "key" runners from the list of "with" runners,
     * and returns the updated list of "with" runners.
     *
     * @param key - A List of key runners.
     * @param with - A comma separated list of "with" runners.
     *
     * @return - A List of "with" runners, with any "key" runners removed.
     */
    internal fun getNonKeyRunners(keys: List<String>, with: String): List<String> {
        return getRunners(with).toMutableList().apply { removeAll(keys) }
    }

    /**
     * Converts a properly formatted KeyBox runner list string into
     * a properly formatted "straight" runner list string.
     * The "key" runner(s) will be in the first position/leg, and
     * the "box" runners will be repeated in addition positions/legs such
     * that the final runList will contain numPositions positions/legs.
     *
     * @param key - A comma separated list of key runners (or a single key runner)
     * @param box - A comma separated list of additional runners.
     * @param numPositions - the total number of positions/legs desired in the resulting "straight" runList
     *
     * @return - A "Straight" formatted runList with numPositions positions/legs.
     */
    internal fun keyBoxToStraight(key: String, box: String, numPositions: Int): String {
        val position = box.prependIndent(LEG_SEPARATOR)
        return "$key${position.repeat(numPositions - 1)}"
    }

    /**
     * Determines the appropriate modifier for a given runList.
     *
     * @param runList - a properly formatted runList.
     *
     * @return - A Pair containing the [WagerModifiers] modifier parsed from the runList,
     *           and the matching groups that were parsed from the regex. If no modifier could
     *           be determined, returns a null [WagerModifiers] and a single item List
     *           with the original runList as it's only item.
     */
    internal fun getModifier(runList: String): Pair<WagerModifiers?, List<String>> {

        // Match up our regexes to the modifiers they go with
        val patterns = listOf(
            Pair(boxPattern, WagerModifiers.BOX),
            Pair(keyPattern, WagerModifiers.KEY),
            Pair(keyBoxPattern, WagerModifiers.KEYBOX),
            Pair(straightPattern, WagerModifiers.STRAIGHT)
        )

        // try each regex one by one, and when we find a match, return.
        for (pattern in patterns) {
            when (val result = pattern.first.matchEntire(runList)) {
                is MatchResult -> return Pair(pattern.second, result.groupValues)
            }
        }

        // No match ....
        return Pair(null, listOf(runList))
    }

    /**
     * Splits a runList into a List of positions/legs,
     * with each position/leg containing a List of runners.
     *
     * @param runList - A formatted list of runners.
     *
     * @return - A List of positions/legs, each one containing a Set of runners.
     */
    internal fun getRunnerLegs(runList: String): List<Set<String>> {
        val legs = runList.split(LEG_SEPARATOR)
        return legs.map {
            it.split(RUNNER_SEPARATOR).toSet()
        }
    }

    /**
     * Splits a runList into a List of positions/legs,
     * and calculates the total possible number of combinations of runners,
     * discarding any combos with duplicate runners.
     *
     * For example, given a runList of 1,2,WT,2,4,WT,5 the total possible combinations are:
     * 1,2,5
     * 1,4,5  2,4,5
     *
     * @param runList - a formatted list of runners
     * @return The total number of combinations that can be produced from the runner list.
     */
    internal fun calculateLegCombos(runList: String): Int {
        val legs = when {
            runList.isEmpty() -> emptyList()
            else -> getRunnerLegs(runList)
        }
        return calculateLegCombos(legs.map { it.toList() }, listOf())
    }

    /**
    * Calculates the total possible number of combinations of runners from a list of legs/positions, discarding
    * any combinations that would have duplicate runners.
    * For example, given a list of legs that includes: [1,2] [2,4] and [5] the total possible combinations are:
    * 1,2,5
    * 1,4,5  2,4,5
    *
    * @param matrix - A list of legs, with each leg containing a list of runners.
    * @param currentCombo - Callers should pass in an empty list. This is used internally for recursion.
    * @return The total number of combinations that can be produced from the runner list.
    */
    internal fun calculateLegCombos(matrix: List<List<String>>, currentCombo: List<String>): Int {
        return when (matrix.size) {
            0 -> 0
            1 -> matrix.map { it.toList() }.size
            else -> {
                var combosFound = 0

                // By using the currentCombo.size() as the index into matrix, we're getting the NEXT
                // leg's runners.
                // For example, if we've already built the first two legs, currentCombo.size() returns
                // 2, in the index of the third leg's runners.
                val leg = matrix[currentCombo.size]

                // for each runner in the currently-evaluating leg
                for (runner in leg) {
                    // If the runner number already exists in the combo, short
                    // circuit.  Otherwise, process it recursively.
                    if (!currentCombo.contains(runner)) {
                        // If the current combo has one less element than the
                        // matrix has rows, we're working on the last element in
                        // this combo.  Increment the number of combos found.
                        // For example, if we're calculating a trifecta (3 legs)
                        // and our current combo is [1, 2], our matrix size is 3
                        // and our currentCombo size is 2. Since 2 == (3 - 1) we
                        // know we're on the last leg and so add a combination for
                        // each runner in the last leg of the matrix.
                        if (currentCombo.size == matrix.size - 1) {
                            combosFound++
                        } else {
                            val newCombo = mutableListOf<String>()
                            newCombo.addAll(currentCombo)
                            newCombo.add(runner)

                            combosFound += calculateLegCombos(matrix, newCombo)
                        }// If more elements remain to fill the combo, find them recursively.  Add current
                        // element to temporary combo and pass to next iteration of determineWagerCombos().
                    }
                }
                combosFound
            }
        }
    }



    /**
     * Calculates the total possible number of combinations of runners for a quinella/Omni-Swinger wager.
     *
     * For example, given a list of legs that includes: [1,10,12] and [1,10,12] the total possible combinations are:
     * 1,10
     * 1,12
     * 10,12
     *
     * @param firstPosition - A list of runners in the first position
     * @param secondPostion - A list of runners in the second position
     *
     * @return The total number of combinations that can be produced from the runner list.
     */
    internal fun calculateQuinellaCombos(firstPosition: Set<String>, secondPostion: Set<String>): Int {
        val combos = firstPosition.fold(mutableSetOf<String>()) { acc, firstRunner ->
            secondPostion.forEach { secondRunner ->
                val comparison = firstRunner.compareTo(secondRunner)
                when {
                    comparison < 0 -> acc.add("$firstRunner,$secondRunner")
                    comparison > 0 -> acc.add("$secondRunner,$firstRunner")
                }
            }
            acc
        }
        return combos.size
    }
}
