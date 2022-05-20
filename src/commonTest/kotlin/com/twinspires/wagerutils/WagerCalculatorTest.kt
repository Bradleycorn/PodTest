package com.twinspires.wagerutils

import com.twinspires.wagerutils.enums.WagerCalculatorErrors
import com.twinspires.wagerutils.enums.WagerTypes
import com.twinspires.wagerutils.models.Wager
import com.twinspires.wagerutils.testUtils.*
import com.twinspires.wagerutils.testUtils.WagerDataFactory
import kotlin.test.*

class WagerCalculatorTest {

    private val wagerTypes = listOf(
        Wager("WN", "Win", WagerTypes.BASIC, 1, 1),
        Wager("PL", "Place", WagerTypes.BASIC, 1, 1),
        Wager("SH", "Show", WagerTypes.BASIC, 1, 1),
        Wager("WP", "Win/Place", WagerTypes.BASIC, 2, 1),
        Wager("WS", "Win/Show", WagerTypes.BASIC, 2, 1),
        Wager("PS", "Place/Show", WagerTypes.BASIC, 2, 1),
        Wager("WPS", "Win/Place/Show", WagerTypes.BASIC, 3, 1),
        Wager("EX", "Exacta", WagerTypes.EXOTIC, 1, 2),
        Wager("TR", "Trifecta", WagerTypes.EXOTIC, 1, 3),
        Wager("SU", "Superfecta", WagerTypes.EXOTIC, 1, 4),
        Wager("E5", "Super Hi5", WagerTypes.EXOTIC, 1, 5),
        Wager("QU", "Quinella", WagerTypes.EXOTIC, 1, 2),
        Wager("OMN", "Omni/Swinger", WagerTypes.EXOTIC, 1, 2),
        Wager("DB", "Double", WagerTypes.MULTIRACE, 1, 2),
        Wager("P3", "Pick 3", WagerTypes.MULTIRACE, 1, 3),
        Wager("P4", "Pick 4", WagerTypes.MULTIRACE, 1, 4),
        Wager("P5", "Pick 5", WagerTypes.MULTIRACE, 1, 5),
        Wager("P6", "Pick 6", WagerTypes.MULTIRACE, 1, 6),
        Wager("P9", "Pick 9", WagerTypes.MULTIRACE, 1, 9),
        // A basic wager with a 0 multiplier so we can properly test the rounding function when the total is 0.
        Wager("NIL", "NIL Wager", WagerTypes.BASIC, 0, 2)
    )

    private lateinit var runListUtil: RunListUtil
    private var logger: Logger? = null
    private lateinit var calculator: WagerCalculator

    @BeforeTest
    fun setupCalculator() {
        //TODO provide a proper mock for RunListUtil
        runListUtil = RunListUtil()
        logger = object: Logger {
            override fun debug(message: String) {}
            override fun error(message: String, ex: Exception?) {}
            override fun info(message: String) {}
            override fun warn(message: String) {}
        }
        calculator = WagerCalculator(wagerTypes, runListUtil, logger)
    }

    @Test
    fun createCalculator() {
        var calc = WagerCalculator.create(wagerTypes, false)
        assertNotNull(calc)

        calc = WagerCalculator.create(wagerTypes, true)
        assertNotNull(calc)

    }

    @Test
    fun validRunnerLists() {
        var runList = "1,2,3"
        assertTrue(calculator.isValidRunnerList(runList), "basic runner list")

        runList = "1,2,3,WT,1,2,3"
        assertTrue(calculator.isValidRunnerList(runList), "straight wager")

        runList = "1,2,3,WT,1,2,3,WT,1,2,3"
        assertTrue(calculator.isValidRunnerList(runList), "straight, more legs")

        runList = "KY,1,WT,1,2,3"
        assertTrue(calculator.isValidRunnerList(runList), "Invalid KY modifier")

        runList = "KY,1,2,3"
        assertTrue(calculator.isValidRunnerList(runList), "KY modifier")

        runList = "KY,1,2,3,WT,1,2,3"
        assertTrue(calculator.isValidRunnerList(runList), "KY modifier, multiple keys")

        runList = "BX,1,2,3"
        assertTrue(calculator.isValidRunnerList(runList), "BX modifier")

        runList = "BN,1,2,3,WT,4,5,6"
        assertTrue(calculator.isValidRunnerList(runList), "BN modifier")

        runList = "1,2,3F,2A"
        assertFalse(calculator.isValidRunnerList(runList), "invalid list")
    }

    @Test
    fun invalidWagers() {
        assertFailsWith(IllegalArgumentException::class, "bad base amount") { calculator.calculateWagerCost(-1F, "WN", "1,2") }
        assertFailsWith(IllegalArgumentException::class, "bad wager type") { calculator.calculateWagerCost(1F, "AA", "1,2") }
        assertFailsWith(IllegalArgumentException::class, "bad runner list") { calculator.calculateWagerCost(1F, "WN", "1A,13F") }
    }

    @Test
    fun basicWagers() {
        var cost = calculator.calculateWagerCost(2F, "WN", "3")
        assertEquals(2F, cost, "$2 win bet on the 3 horse")

        cost = calculator.calculateWagerCost(2F, "WN", "3,5")
        assertEquals(4F, cost, "$2 win bet on the 3 & 5 horses")

        cost = calculator.calculateWagerCost(2F, "WPS", "3,5")
        assertEquals(12F, cost, "$2 across the board on the 3 & 5 horses")
    }

    @Test
    fun multiRaceWagers() {
        var cost = calculator.calculateWagerCost(2F, "P3", "1,WT,2,WT,3")
        assertEquals(2F, cost, "$2 Pick 3 with 1 runner in each race")

        cost = calculator.calculateWagerCost(2F, "P3", "1,2,WT,2,3,4,WT,3,4,5,6")
        assertEquals(48F, cost, "$2 Pick 3 with 2, 3, and 4 runners in each race")

        assertFailsWith(IllegalArgumentException::class, "Pick 3 missing legs") {
            cost = calculator.calculateWagerCost(2F, "P3", "1,WT,3")
        }

        assertFailsWith(IllegalArgumentException::class, "Pick 3 missing runners in a leg") {
            cost = calculator.calculateWagerCost(2F, "P3", "1,WT,,WT,3")
        }

    }

    @Test
    fun bigRunList() {
        val runners = (1..24).fold("") { acc, i ->
            when (acc) {
                "" -> i.toString()
                else -> "$acc,$i"
            }
        }
        val runList = "$runners,WT,$runners,WT,$runners,WT,$runners,WT,$runners"


        val cost = calculator.calculateWagerCost(1F, "E5", runList)
        assertEquals(5100480F, cost, "HUGE Super High Five")
    }

    @Test
    fun straightExotics() {
        var cost = calculator.calculateWagerCost(1F, "TR", "1,WT,2,WT,3")
        assertEquals(1F, cost, "basic trifecta")

        cost = calculator.calculateWagerCost(1F, "TR", "2,3,WT,4,5,WT,6,7,8")
        assertEquals(12F, cost, "trifecta with multiple runners")

        cost = calculator.calculateWagerCost(1F, "TR", "2,3,WT,3,5,WT,1,3,5,8")
        /*
            Combos are:
            2,3,1   3,5,1
            2,3,5   3,5,8
            2,3,8
            2,5,1
            2,5,3
            2,5,8
         */
        assertEquals(8F, cost, "trifecta with multiple runners")

        assertFailsWith(IllegalArgumentException::class, "trifecta not enough runners") {
            cost = calculator.calculateWagerCost(1F, "TR", "1,WT,2")
        }

        assertFailsWith(IllegalArgumentException::class, "trifecta too many runners") {
            cost = calculator.calculateWagerCost(1F, "TR", "1,WT,2,WT,3,WT,4")
        }

        assertFailsWith(IllegalArgumentException::class, "superfecta not enough runners") {
            cost = calculator.calculateWagerCost(1F, "SU", "1,WT,2,WT3")
        }

        assertFailsWith(IllegalArgumentException::class, "superfecta too many runners") {
            cost = calculator.calculateWagerCost(1F, "SU", "1,WT,2,WT,3,WT,4,WT,5")
        }

        cost = calculator.calculateWagerCost(1F, "QU", runList="1,3,WT,2")
        assertEquals(2F, cost, "quinella")

        assertFailsWith(IllegalArgumentException::class, "quinella not enough runners") {
            cost = calculator.calculateWagerCost(1F, "QU", "1,2,3")
        }
    }

    @Test
    fun boxExotics() {
        var cost = calculator.calculateWagerCost(1F, "TR", "BX,1,2,3,4")
        assertEquals(24F, cost, "trifecta 4 runners")

        cost = calculator.calculateWagerCost(1F, "QU", "BX,1,2,3,4")
        assertEquals(6F, cost, "quinella 4 runners")

        cost = calculator.calculateWagerCost(0.2F, "EX", "BX,1,12,13,16")
        assertEquals(2.4F, cost, "quinella 4 runners")

        assertFailsWith(IllegalStateException::class, "no modifier") {
            cost = calculator.calculateWagerCost(1F, "TR", "BX,1,2,3,WT,4,5,6,WT,7,8,9")
        }

        assertFailsWith(IllegalArgumentException::class, "not enough runners") {
            cost = calculator.calculateWagerCost(1F, "TR", "BX,1,2")
        }

        assertFailsWith(WagerCalculatorException::class, "too many runners") {
            cost = calculator.calculateWagerCost(1F, "E5", "BX,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24")
        }.apply {
            assertEquals(WagerCalculatorErrors.TOO_MANY_RUNNERS, error)
        }
    }

    @Test
    fun keyExotics() {
        var cost = calculator.calculateWagerCost(1F, "TR", "KY,1,2,4")
        assertEquals(2F, cost, "trifecta key")

        cost = calculator.calculateWagerCost(1F, "TR", "KY,1,2,4,5,6")
        assertEquals(12F, cost, "trifecta key, more runners")

        assertFailsWith(WagerCalculatorException::class, "key too many runners") {
            cost = calculator.calculateWagerCost(1F, "TR", "KY,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25")
        }

        assertFailsWith(IllegalArgumentException::class, "not enough runners") {
            cost = calculator.calculateWagerCost(1F, "TR", "KY,1,2")
        }
    }

    @Test
    fun keyBoxExotics() {
        var cost = calculator.calculateWagerCost(1F, "TR", "BN,1,WT,2,4")
        assertEquals(6F, cost, "trifecta key box")

        cost = calculator.calculateWagerCost(1F, "TR", "BN,1,WT,2,4,6")
        assertEquals(18F, cost, "trifecta key box, more runners")

        cost = calculator.calculateWagerCost(1F, "TR", "BN,1,3,WT,2,4,6")
        assertEquals(36F, cost, "trifecta key box, multiple keys")

        assertFailsWith(WagerCalculatorException::class, "keybox too many runners") {
            cost = calculator.calculateWagerCost(1F, "TR", "BN,1,WT,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25")
        }

        assertFailsWith(IllegalArgumentException::class, "keybox not enouth runners") {
            cost = calculator.calculateWagerCost(1F, "TR", "BN,1,WT,2")
        }
    }

    @Test
    fun rounding() {
        var cost = calculator.calculateWagerCost(1.3745F, "TR", "BN,1,WT,2,4")
        assertEquals(8.25F, cost, "round weird numbers to dollars and cents")

        assertFailsWith(IllegalStateException::class, "rounding of 0 value") {
            calculator.calculateWagerCost(1F, "NIL", "1,2,3")
        }
    }

    @Test
    fun extensiveCalculatorTest() {
        val dataLoader = WagerDataFactory.createLoader()

        val allWagers = listOf(boxWagers, keyWagers, keyBoxWagers, multiKeyBoxWagers, quinellaWagers, straightWagers, pickNWagers)
        allWagers.forEach { wagerList ->
            val wagers = dataLoader.loadWagers(wagerList)
            wagers.forEach { wager ->
                  val cost = calculator.calculateWagerCost(wager.baseAmount, wager.wagerCode, wager.runList)
                assertEquals(wager.expectedTotal, cost, "Cost ($cost) not correct for wager: $wager")
            }
        }
    }
}
