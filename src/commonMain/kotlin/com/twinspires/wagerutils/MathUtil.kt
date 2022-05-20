package com.twinspires.wagerutils

import kotlin.js.JsExport

/**
 * Calculates the factorial (n!) of a given
 * value.
 *
 * Note that 0! = 1 because math.
 * Also, we don't calculate factorials bigger than 20 because the result would
 * be too big to fit in a long.
 */
@JsExport
internal val Long.factorial: Long
    get() {
        return when {
            this == 0L -> 1
            this in 1..20 -> (1..this).reduce { acc, i -> acc * i }
            else -> throw NumberFormatException("Cannot perform factorial on $this")
        }
    }


/**
 * Calculates the binomial coefficient (n choose k) of 2 numbers.
 * That is, how many subsets of size k, and fit in a list of size n.
 *
 * For more information: http://mathworld.wolfram.com/BinomialCoefficient.html
 */
@JsExport
internal fun binomial(n: Long, k: Long): Long {
    return when {
        n < 0 || k < 0 -> throw IllegalArgumentException("negative numbers not allowed")
        n == k -> 1L
        else -> {
            var ans = 1L
            for (i in n - k + 1..n) ans *= i
            ans / k.factorial
        }
    }
}
