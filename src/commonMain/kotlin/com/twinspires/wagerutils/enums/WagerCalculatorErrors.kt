package com.twinspires.wagerutils.enums

/**
 * enum for the types of errors when we throw a WagerCalculatorException
 */
enum class WagerCalculatorErrors {
    /**
     * Error for when a wager cannot be calculated
     * because there is too many runners
     */
    TOO_MANY_RUNNERS
}