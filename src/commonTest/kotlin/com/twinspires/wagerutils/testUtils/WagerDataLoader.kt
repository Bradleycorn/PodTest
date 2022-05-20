package com.twinspires.wagerutils.testUtils

/**
 * An interface that each platform can implement to load a list of wager
 * data for testing.
 *
 * Ideally, wager data would be kept in flat files, and each platform
 * would override the loadWagerData() method to provide a method to
 * read and parse a flat file with wager data.
 * However, there is currently a defect with Kotlin Multiplatform projects
 * not properly using files in the resources/ dir.
 * As a result, loadWagerData() is implemented here and changed to load
 * wager data from a passed in List<String>. When the Kotlin defect
 * is fixed, we can change this functionality and store test wager
 * data in flat files.
 *
 * More info here:
 * https://youtrack.jetbrains.com/issue/KT-24463
 */
internal interface WagerDataLoader {

    fun loadWagerData(wagerList: List<String>): Set<List<String>> {
        val wagers = mutableSetOf<List<String>>()
        wagerList.forEach { line ->
            val list = parseLine(line)
            wagers.add(list)
        }

        return wagers
    }

    fun loadWagers(wagerList: List<String>): Set<TestWager> {
        val wagerData = loadWagerData(wagerList)
        val testWagers = mutableSetOf<TestWager>()
        wagerData.forEach {
            val amount = it[0].toFloatOrNull()
            val expectedTotal = it[3].toFloatOrNull()

            if (amount != null && expectedTotal != null) {
                testWagers.add(TestWager(amount, it[1], it[2], expectedTotal))
            }
        }

        return testWagers
    }

    fun parseLine(line: String, separator: Char = ',') : List<String> {
        val lineData = mutableListOf<String>()
        val builder = StringBuilder()
        var quotes = 0
        for (ch in line) {
            when {
                ch == '\"' -> {
                    quotes++
                }
                (ch == '\n') || (ch ==  '\r') -> {}
                (ch == separator) && (quotes % 2 == 0) -> {
                    lineData.add(builder.toString())
                    builder.clear()
                }
                else -> builder.append(ch)
            }
        }

        if (builder.isNotEmpty()) {
            lineData.add(builder.toString())
        }

        return lineData
    }
}

internal expect class WagerDataFactory {
    companion object {
        fun createLoader(): WagerDataLoader
    }
}
