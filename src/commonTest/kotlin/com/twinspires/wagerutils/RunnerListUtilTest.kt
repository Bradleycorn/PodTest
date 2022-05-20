package com.twinspires.wagerutils

import com.twinspires.wagerutils.enums.WagerTypes
import com.twinspires.wagerutils.models.Wager
import com.twinspires.wagerutils.models.WagerModifiers
import kotlin.test.*

class RunnerListUtilTest {
    private val runListUtil: RunListUtil = RunListUtil()

    @Test
    fun basicRunnerList() {
        val runners = listOf("1","2","3","4","5","6")
        val runList = runners.joinToString(",")
        assertEquals(runners, runListUtil.getRunners(runList))
    }

    @Test
    fun numberOfRunners() {
        val runList = "1,2,3,4,5,6"
        assertEquals(6, runListUtil.getNumberOfRunners(runList))
    }

    @Test
    fun nonKeyRunners() {
        val key = "1"
        var with = "1,2,3"

        assertEquals(listOf("2","3"), runListUtil.getNonKeyRunners(key, with))

        val keys = listOf("1","2","3")
        with = "2,3,4,5,6"
        assertEquals(listOf("4","5","6"), runListUtil.getNonKeyRunners(keys, with))
    }

    @Test
    fun convertKeyBoxToStraight() {
        val key = "1,2,3"
        val box = "4,5,6"
        var positions = 2

        assertEquals("1,2,3,WT,4,5,6", runListUtil.keyBoxToStraight(key, box, positions), "2 legs")

        positions = 3
        assertEquals("1,2,3,WT,4,5,6,WT,4,5,6", runListUtil.keyBoxToStraight(key, box, positions), "3 legs")
    }

    @Test
    fun exoticModifiers() {
        var runList = "BX,1,2,3"
        val (boxModifier, boxGroups) = runListUtil.getModifier(runList)
        assertEquals(WagerModifiers.BOX, boxModifier, "box modifier")
        assertEquals(2, boxGroups.size, "Box matches size")
        assertEquals("1,2,3", boxGroups[1], "Box runners")

        runList = "KY,1,2,3,4"
        val (keyModifier, keyGroups) = runListUtil.getModifier(runList)
        assertEquals(WagerModifiers.KEY, keyModifier, "key modifier")
        assertEquals(3, keyGroups.size, "key matches size")
        assertEquals("1", keyGroups[1], "key runner")
        assertEquals("2,3,4", keyGroups[2], "key with runners")

        runList = "BX,1,WT,2,3,4"
        val (keyBoxModifier, keyBoxGroups) = runListUtil.getModifier(runList)
        assertEquals(WagerModifiers.KEYBOX, keyBoxModifier, "key box modifier")
        assertEquals(3, keyBoxGroups.size, "key box matches size")
        assertEquals("1", keyBoxGroups[1], "key box runner")
        assertEquals("2,3,4", keyBoxGroups[2], "key box with runners")

        runList = "BN,1,WT,2,3,4"
        val (keyBNModifier, keyBNGroups) = runListUtil.getModifier(runList)
        assertEquals(WagerModifiers.KEYBOX, keyBNModifier, "key BN modifier")
        assertEquals(3, keyBNGroups.size, "key BN matches size")
        assertEquals("1", keyBNGroups[1], "key BN runner")
        assertEquals("2,3,4", keyBNGroups[2], "key BN with runners")

        runList = "BX,1,2,WT,3,4,5"
        val (multiKeyBoxModifier, multiKeyBoxGroups) = runListUtil.getModifier(runList)
        assertEquals(WagerModifiers.KEYBOX, multiKeyBoxModifier, "multi key box modifier")
        assertEquals(3, multiKeyBoxGroups.size, "multi key box matches size")
        assertEquals("1,2", multiKeyBoxGroups[1], "multi key box runner")
        assertEquals("3,4,5", multiKeyBoxGroups[2], "multi key box with runners")

        runList = "1,2,3,WT,4,5,6,WT,7,8,9"
        val (straightModifier, _) = runListUtil.getModifier(runList)
        assertEquals(WagerModifiers.STRAIGHT, straightModifier, "straight modifier")

        runList = "BX,1,2,3,WT,4,5,6,WT,7,8,9"
        val (invalidModifier, _) = runListUtil.getModifier(runList)
        assertNull(invalidModifier, "invalid modifier")
    }


    @Test
    fun splitLegs() {
        val runList = "1,2,3,WT,4,5,5,6,WT,7,8,9"
        val legs = runListUtil.getRunnerLegs(runList)

        assertEquals(3, legs.size)
        assertEquals(setOf("1","2","3"), legs[0])
        assertEquals(setOf("4","5","6"), legs[1])
        assertEquals(setOf("7","8","9"), legs[2])
    }

    @Test
    fun straightCombos() {
        var size = runListUtil.calculateLegCombos("")
        assertEquals(0, size, "empty list")

        size = runListUtil.calculateLegCombos("1,2,3")
        assertEquals(1, size, "single leg")


        var runList = "1,2,3,WT,4,5,6,WT,7,8,9"
        size = runListUtil.calculateLegCombos(runList)
        assertEquals(27, size, "3 legs, all unique runners")


        runList = "1,2,3,WT,2,4,WT,3,7,8"
        /*
            This runner list should generate 13 combos when duplicate
            runners are NOT allowed within a single combo:
            1,2,3   2,4,3   3,2,7
            1,2,7   2,4,7   3,2,8
            1,2,8   2,4,8   3,4,7
            1,4,3           3,4,8
            1,4,7
            1,4,8
         */
        size = runListUtil.calculateLegCombos(runList)
        assertEquals(13, size, "3 legs, eliminate duplicates")
    }

    @Test
    fun quinellaCombos() {
        var size = runListUtil.calculateQuinellaCombos(setOf(), setOf())
        assertEquals(0, size, "empty runners")

        size = runListUtil.calculateQuinellaCombos(setOf(), setOf("1"))
        assertEquals(0, size, "empty first position")

        size = runListUtil.calculateQuinellaCombos(setOf("1"), setOf())
        assertEquals(0, size, "empty second position")

        size = runListUtil.calculateQuinellaCombos(setOf("1"), setOf("1"))
        assertEquals(0, size, "single same position")

        size = runListUtil.calculateQuinellaCombos(setOf("1"), setOf("2"))
        assertEquals(1, size, "2 runners")

        size = runListUtil.calculateQuinellaCombos(setOf("1","2"), setOf("3","4"))
        assertEquals(4, size, "4 different runners")

        size = runListUtil.calculateQuinellaCombos(setOf("1","2","3"), setOf("1","2","3"))
        assertEquals(3, size, "same list, 3 runners")
    }

}
