package com.twinspires.wagerutils

import com.twinspires.wagerutils.enums.WagerCalculatorErrors
import com.twinspires.wagerutils.enums.WagerTypes
import com.twinspires.wagerutils.models.*
import kotlin.js.JsExport
import kotlin.js.JsName
import kotlin.jvm.JvmStatic
import kotlin.math.round

/**
 * This class can calculate total wager cost for wagers of all types, given a base wager amount,
 * a wager type, and a list of selected runners.
 *
 * Instances of this class cannot be created directly outside of the wagerutils library. Instead,
 * use the static [create] method.
 *
 * When creating the calculator, you must provide a list of wagerTypes that you support on your platform.
 * The calculator will use this list to perform calculations and will throw an exception if asked to
 * calculate a wager that does not exist in the list.
 *
 * The primary calculation function takes a "primitive" set of arugments (a simple string as the runner list,
 * and a string wager type). This is done to facilitate cross platform functionality. This class makes no
 * assumptions about the format and structure of the data models that are used in any platform that needs
 * to make wager calculations. However, the one consistency among all platforms is that they all must pass
 * wager information to the same backend service. As a result, the format for arguments to the calculator
 * mimics the format of that backend service. If you can build a request to submit a wager, you can use
 * those same arguments to call this calculator.
 *
 * It should be noted that this calculator will do some basic validation on the wager type and runner
 * list, and will throw exceptions if the wager is no valid. However, it only does enough validation to ensure
 * it has enough data to be able to do the proper math to calculate a wager total.
 * You should NOT rely on this calculator to do complete wager validation.
 */
@JsExport
class WagerCalculator internal constructor( //constructor is internal ... external consumers should use the static create() method.
    //A list of Wager objects that should be supported for wager calculations.
    private val wagerTypes: List<Wager>,

    //A RunListUtil object to aid in working with runList.
    private val runListUtil: RunListUtil,

    //A Logger object to log information about calculations.
    private val logger: Logger? = null) {

    @JsName("Companion")
    companion object {
        /**
         * Creates an instance of the [WagerCalculator] that will work with
         * the passed in list of [Wager] types. Optionally, will enable logging.
         *
         * @param wagerTypes A list of [Wager] types that the calculator should support.
         * @param enableLogging true to have messages about the calculations printed to the log
         *                      false for no logging.
         */
        @JvmStatic
        fun create(wagerTypes: List<Wager>, enableLogging: Boolean): WagerCalculator {

            val logger = when {
                enableLogging -> LoggerFactory.createLogger()
                else -> null
            }

            return WagerCalculator(wagerTypes, RunListUtil(), logger)
        }
    }


    /**
     * Does general validation on a runList to make sure it's valid.
     *
     * @param runList - The formatted list of runners
     * @return - True if the runList is valid and can be parsed, false otherwise.
     */
    fun isValidRunnerList(runList: String): Boolean = RunListUtil.runListPattern.matches(runList)

    /**
     * Calculate the total cost for a wager.
     *
     * RunList Formatting:
     *
     * - All Wagers: Runners in the run list should contain the runner number only.
     * Coupled (i.e. 2A, 3B, etc) and field (i.e. 12F, 13F, etc) indicators should not be inculded.
     * A valid list of runners looks like:
     * 1,2,3,5,8
     *
     * - Basic Wagers (Win, Win/Place/Show, etc):
     * The runList should be a comma separated list of numeric runners that are included in the wager.
     * For example:
     * 2,5,7
     *
     * - Multi-Race Wagers (Pick-3, Pick-5, etc):
     * The runList should contain a comma separated list of numeric runners for each leg, and each
     * leg separated with the separator string: ,WT,
     * For example, a Pick-3 runList would look like:
     * 1,2,3,WT,2,4,5,WT,3,5,6
     *
     * - Exotic Wagers (Trifecta, Quinella, Omni/Swinger, etc):
     * The runList for exotic wagers looks similar to that of Multi-Race wagers.
     * However, exotics can also contain a wager modifier (Box, Key, KeyBox). The
     * runList should contain a prefix to indicate the wager modifier. If no modifier
     * is passed, a "Straight" wager is assumed.
     *
     * - Exotic Straight (or Wheel):
     * The runList should contain a comma separated list of numeric runners for each position, and each
     * position separated with the separator string: ,WT,
     * Straight runLists look exactly like Multi-Race runLists.
     * For example, a Trifecta runList would look like:
     * 1,2,3,WT,4,5,WT,6,7,8
     *
     * - Exotic Box:
     * RunList Prefix: BX,
     * The runList should contain a comma separated list of numeric runners, with the prefix: BX,
     * For example:
     * BX,1,4,6
     *
     * - Exotic Key:
     * RunList Prefix: KY,
     * Position separator: ,WT,
     * The runList should contain the "KY," prefix, follwed by the key runner, followed by the position
     * separator ",WT,", followed by the list of "with" runners.
     * For example:
     * KY,1,WT,3,4,5
     *
     * - Exotic Key Box:
     * RunList Prefix: BN, or BX,
     * Position separator: ,WT,
     * The runList should contain the "BN," or "BX," prefix, follwed by the key runner(s), followed by the position
     * separator ",WT,", followed by the list of "box" runners.
     * Some examples:
     * BN,1,WT,3,4,5
     * BN,1,2,WT,3,4,5
     * BX,1,WT,3,4,5
     * BX,1,2,WT,3,4,5
     *
     * - Exotic Wheel:
     * The wheel modifier is functionally equivalent to a straight. For wheel bets, use
     * the Exotic Straight format.
     *
     * @param baseAmount This is the base wager cost. For example if the user wants a
     *  "$2 Trifecta box on the 3,5,7,8" ... Then the base amount is $2
     * @param wagerType The type of wager being placed (Win, Trifecta, etc).
     *  Pass in the [Wager.code] that corresponds to the correct wager
     *  in your list of supported wagerTypes.
     * @param runList The list of selected runners for the wager. See below for formatting rules for the runList.
     *
     * @return Float The total cost of the wager.
     * @throws IllegalArgumentException if any of the passed arguments is not valid, or a [Wager] cannot be found
     * @throws IllegalStateExepction if a modifier cannot be found for an exotic wager, or if the runList is modified
     *  internally to an invalid state
     */
    fun calculateWagerCost(baseAmount: Float, wagerType: String, runList: String): Float {
        logger?.debug("Calculating cost for wager '$baseAmount', '$wagerType', '$runList'")

        val wager: Wager? = wagerTypes.findWager(wagerType)

        when {
            baseAmount <= 0 -> handleError(IllegalArgumentException("Invalid base wager amount: $$baseAmount"))
            wager == null -> handleError(IllegalArgumentException("Invalid Wager Type $wagerType"))
            !isValidRunnerList(runList) -> handleError(IllegalArgumentException("Invalid Runner List: $runList"))
        }

        // We know wager is not null here, we just checked it above, and threw an error if necessary...
        return when (wager!!.wagerType){
            WagerTypes.BASIC -> calculateBasicWagerCost(baseAmount, wager, runList)
            WagerTypes.MULTIRACE -> calculateMultiRaceWagerCost(baseAmount, wager, runList)
            WagerTypes.EXOTIC -> calculateExoticWagerCost(baseAmount, wager, runList)
        }
    }

    /**
     * Calculates the total cost for a basic (Win, Win/Place/Show, etc) wager.
     *
     * @param baseAmount - The base wager amount
     * @param wager - The type of [Wager] being placed
     * @param runList - A comma separated list of runners.
     *
     * @return - The total calculated cost of the wager.
     */
    private fun calculateBasicWagerCost(baseAmount: Float, wager: Wager, runList: String): Float {
        logger?.debug("Calculating cost for ${wager.displayName} BASIC wager with a multiplier of ${wager.multiplier} -  '$baseAmount', '$runList'")

        val cost = baseAmount * wager.multiplier * runListUtil.getNumberOfRunners(runList)
        return validateAndRound(cost)
    }

    /**
     * Calculates the total cost for a Multi-Race (Pick-3, Pick-5, etc) wager.
     *
     * @param baseAmount - The base wager amount
     * @param wager - The type of [Wager] being placed
     * @param runList - A comma separated list of runners, with each leg separated by ',WT,'.
     *
     * @return - The total calculated cost of the wager
     * @throws IllegalArgumentException if there are not any runners in a leg, or if the run list contains the wrong number of legs.
     */
    private fun calculateMultiRaceWagerCost(baseAmount: Float, wager: Wager, runList: String): Float {
        logger?.debug("Calculating cost for ${wager.displayName} Multi-Race wager with ${wager.positions} legs -  '$baseAmount', '$runList'")

        val legs = runListUtil.getRunnerLegs(runList)

        if (legs.size != wager.positions) {
            handleError(IllegalArgumentException("wrong number of legs for ${wager.displayName} - $runList"))
        }

        val multiplier = legs.foldIndexed(1) { index, multiplier, runners ->
            if (runners.size < 1) {
                handleError(IllegalArgumentException("Leg ${index + 1} had no runners. ${wager.displayName}  wagers must have runners in each leg - $runList"))
            }
            multiplier * runners.size
        }


        val cost = baseAmount * multiplier
        return validateAndRound(cost)
    }

    /**
     * Calculates the total cost for an exotic (Exacta, Trifecta, etc) wager.
     * This method just figures out which modifier to use, and hands the calculation
     * off to the appropriate method to do the actual calculation.
     *
     * @param baseAmount - The base wager amount
     * @param wager - The type of [Wager] being placed
     * @param runList - A comma separated list of runners, optionally prefixed with a modifier indicator,
     *                  and optionally with multiple positions, separated by 'WT,'.
     *
     * @return - The total calculated cost of the wager.
     * @throws IllegalStateException if a modifier could not be found for the given wager/runList
     */
    private fun calculateExoticWagerCost(baseAmount: Float, wager: Wager, runList: String): Float {
        logger?.debug("EXOTIC wager found, parsing the modifier -  '$baseAmount', '$runList'")
        val (wagerModifier, groups) = runListUtil.getModifier(runList)
        return when (wagerModifier) {
            WagerModifiers.BOX -> calculateBox(baseAmount, wager, groups[1])
            WagerModifiers.KEY -> calculateKey(baseAmount, wager, groups[1], groups[2])
            WagerModifiers.KEYBOX -> calculateKeyBox(baseAmount, wager, groups[1], groups[2])
            WagerModifiers.STRAIGHT -> calculateStraight(baseAmount, wager, runList)
            else -> {
                handleError(IllegalStateException("Could not find a modifier for ${wager.displayName} with runners: $runList"))
                0F
            }
        }
    }

    /**
     * Calculates the total cost for a straight exotic wager.
     *
     * @param baseAmount - The base wager amount
     * @param wager - The type of [Wager] being placed
     * @param runList - A comma separated list of runners with multiple positions separated by 'WT,'.
     *
     * @return - The total calculated cost of the wager.
     * @throws - IllegalArgumentException if there are not enough runners passed for a Quinella
     */
    private fun calculateStraight(baseAmount: Float, wager: Wager, runList: String): Float {
        logger?.debug("Calculating cost for ${wager.displayName} STRAIGHT EXOTIC wager with ${wager.positions} positions -  '$baseAmount', '$runList'")
        val positions = runListUtil.getRunnerLegs(runList)

        if (positions.size != wager.positions) {
            handleError(IllegalArgumentException("wrong number of legs for ${wager.displayName} - $runList"))
        }

        val combos = when  {
            Wager.isOmniQuinella(wager) -> runListUtil.calculateQuinellaCombos(positions[0], positions[1])
            else -> runListUtil.calculateLegCombos(runList)
        }

        return validateAndRound(baseAmount * combos)
    }

    /**
     * Calculates the total cost for a box exotic wager.
     *
     * @param baseAmount - The base wager amount
     * @param wager - The type of [Wager] being placed
     * @param runList - A comma separated list of runners, prefixed with 'BX,'.
     *
     * @return - The total calculated cost of the wager.
     * @throws IllegalArgumentException if there are not enough runners to satisfy the selected wager type.
     * @throws WagerCalculatorException if the factorial fails because there is too many runners
     */
    private fun calculateBox(baseAmount: Float, wager: Wager, runList: String): Float {
        logger?.debug("Calculating cost for ${wager.displayName} BOX EXOTIC wager with ${wager.positions} positions -  '$baseAmount', '$runList'")

        val numRunners = runListUtil.getNumberOfRunners(runList)
        val positions = wager.positions

        if (numRunners < positions) {
            handleError(IllegalArgumentException("There are insufficient runners for this Box wager: $runList"))
        }

        val cost: Float
        try {
            cost = when {
                Wager.isOmniQuinella(wager) -> baseAmount * binomial(numRunners.toLong(), 2)
                else -> baseAmount * (numRunners.toLong().factorial / (numRunners - positions).toLong().factorial)
            }
        } catch (ex: NumberFormatException){
            throw WagerCalculatorException(WagerCalculatorErrors.TOO_MANY_RUNNERS, errorCause = ex.cause)
        }

        return validateAndRound(cost)
    }

    /**
     * Calculates the total cost for a key exotic wager.
     *
     * @param baseAmount - The base wager amount
     * @param wager - The type of [Wager] being placed
     * @param runList - The 'KY,' prefix, then the selected key runner,
     *                  then the ',WT,' separator, then the comma separated list of "with" runners.
     *
     * @return - The total calculated cost of the wager.
     * @throws IllegalArgumentException if there are not enough "with" runners to satisfy the selected wager type.
     * @throws WagerCalculatorException if the factorial fails because there is too many runners
     */
    private fun calculateKey(baseAmount: Float, wager: Wager, key: String, with: String): Float {
        logger?.debug("Calculating cost for ${wager.displayName} KEY EXOTIC wager with ${wager.positions} positions - $baseAmount, key the $key with $with")

        val withList = runListUtil.getNonKeyRunners(key, with)

        if (withList.size < wager.positions - 1) {
            handleError(IllegalArgumentException("Not enough runners provided for this KEY wager. Key: $key, With: $withList"))
        }

        val numRunners = withList.size.toLong()
        val numPositions = wager.positions

        val cost: Float
        try {
            cost = baseAmount * numRunners.factorial / (numRunners - numPositions + 1).factorial
        } catch (ex: NumberFormatException){
            throw WagerCalculatorException(WagerCalculatorErrors.TOO_MANY_RUNNERS, errorCause = ex.cause)
        }
        return validateAndRound(cost)
    }

    /**
     * Calculates the total cost for a key box exotic wager.
     *
     * @param baseAmount - The base wager amount
     * @param wager - The type of [Wager] being placed
     * @param runList - The 'BN,' or 'BX,' prefix, then the selected key runner or comma separated list of key runners,
     *                  then the ',WT,' separator, then the comma separated list of "box" runners.
     *
     * @return - The total calculated cost of the wager.
     * @throws IllegalStateException if an invalid straight runner list was generated for a multi-key box.
     * @throws IllegalArgumentException If no key runner or not enough box runners are provided.
     * @throws WagerCalculatorException if the factorial fails because there is too many runners
     */
    private fun calculateKeyBox(baseAmount: Float, wager: Wager, key: String, box: String): Float {
        logger?.debug("Calculating cost for ${wager.displayName} KEY BOX EXOTIC wager with ${wager.positions} positions - $baseAmount, key $key over $box")

        val keyRunners = runListUtil.getRunners(key)

        when (keyRunners.size) {
            1 -> {
                val boxRunners = runListUtil.getNonKeyRunners(keyRunners, box)
                val numRunners = boxRunners.size.toLong()
                val numPositions = wager.positions

                if (numRunners < (numPositions - 1)) {
                    handleError(IllegalArgumentException("Not enough runners provided for this Key Box wager. Key: $keyRunners, Box: $boxRunners"))
                }

                val combinations: Long
                try {
                    combinations = numPositions * (numRunners.factorial / (numRunners - numPositions + 1).factorial)
                } catch (ex: NumberFormatException){
                    throw WagerCalculatorException(WagerCalculatorErrors.TOO_MANY_RUNNERS, errorCause =  ex.cause)
                }
                return validateAndRound(baseAmount * combinations)
            }
            else -> {

                val runList = runListUtil.keyBoxToStraight(key, box, wager.positions)
                if (!isValidRunnerList(runList)) {
                    handleError(IllegalStateException( "Invalid runner list generated for ${wager.wagerType} key box wager: $runList"))
                }

                val baseCost = calculateStraight(baseAmount, wager, runList)
                return validateAndRound(baseCost * wager.positions)
            }
        }
    }

    /**
     *
     * The value needs to be rounded because of the behavior of floating point numbers
     * https://en.wikipedia.org/wiki/Floating-point_arithmetic#Accuracy_problems
     *
     * The rounded cost is tested to make sure it is greater than 0.
     *
     * @param cost Total cost of the wager
     * @return The cost rounded to the hundredths place.
     * @throws IllegalStateException if the rounded cost is less than or equal to 0.
     */
    private fun validateAndRound(cost: Float): Float {
        val rounded = (round(cost * 100.00) / 100.00).toFloat()

        if (rounded <= 0) {
            handleError(IllegalStateException("wager cost rounded to zero or less. '$cost' was rounded to '$rounded'"))
        }

        logger?.debug("Total wager cost is: $$rounded")
        return rounded
    }

    /**
     * A convenience method to both log and throw exceptions.
     * This method is "inlined" so that stack traces will contain the proper location
     * of the actual error, instead of always pointing to this method and line number.
     *
     * @param ex - The exception to log and throw
     */
    private inline fun handleError(ex: Exception) {
        logger?.error(ex.message ?: "An exception occurred while trying to calculate wager cost.", ex)
        throw ex
    }

}
