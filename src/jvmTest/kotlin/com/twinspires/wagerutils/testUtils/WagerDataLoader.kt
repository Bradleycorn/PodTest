package com.twinspires.wagerutils.testUtils

import com.twinspires.wagerutils.WagerCalculator

internal class JvmWagerDataLoader: WagerDataLoader {
    //TODO Implement loadWagerData() method to load wager data from a flat file.
    // for more info, see the base WagerDataLoader in commonTest
    /*
    override fun loadWagerData(filePath: String): Set<List<String>> {
        val stream = WagerCalculator::class.java.classLoader.getResourceAsStream(filePath)
        val lines = mutableSetOf<List<String>>()

        stream?.buffered()?.reader()?.forEachLine { line ->
            val wagerValues = parseLine(line)
            lines.add(wagerValues)
        }

        return lines
    }
    */
}

internal actual class WagerDataFactory {
    actual companion object {
        actual fun createLoader(): WagerDataLoader = JvmWagerDataLoader()
    }
}
