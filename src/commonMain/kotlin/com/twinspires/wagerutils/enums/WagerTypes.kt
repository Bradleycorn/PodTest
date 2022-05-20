package com.twinspires.wagerutils.enums

/**
 * An enumeration of the basic types of wagers that can be placed.
 */
enum class WagerTypes {
    /**
     * Basic wagers are single race wagers
     * with a single position and no modifiers:
     * Win, Win/Place/Show, etc
     */
    BASIC,

    /**
     * Exotic wagers are single race wagers with multiple
     * positions and modifiers:
     * Exacta, Trifecta, Quinella, Omni/Swinger, etc
     */
    EXOTIC,

    /**
     * Multi-race wagers are wagers with a single position
     * selected in multiple races, and no modifiers:
     * Daily Double, Pick 3, Pick 4 ... Pick 10
     */
    MULTIRACE
}
