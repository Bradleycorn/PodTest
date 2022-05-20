package com.twinspires.wagerutils

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class MathUtilTest {

    @Test
    fun factorials() {
        assertEquals(6, 3L.factorial)

        assertEquals(720, 6L.factorial)

        assertEquals(3_628_800, 10L.factorial)

        assertEquals(1, 0L.factorial)

        assertFailsWith(IllegalArgumentException::class) { 21L.factorial }
    }

    @Test
    fun binomials() {

        assertEquals(10, binomial(5,2), "5 and 2 binomal")
        assertEquals(35, binomial(7,3), "7 and 3 binomal")

        assertEquals(1, binomial(4,4), "equal numbers binomal")

        assertFailsWith(IllegalArgumentException::class, "negative n value binomial") { binomial(-1, 2)}
        assertFailsWith(IllegalArgumentException::class, "negative k value binomial") { binomial(2, -1)}
    }
}

