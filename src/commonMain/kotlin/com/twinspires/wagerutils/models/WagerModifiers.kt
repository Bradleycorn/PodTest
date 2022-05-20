package com.twinspires.wagerutils.models

/**
 * A sealed class that contains the various modifiers that are available for wagers.
 *
 * All instances have the same set of basic properties that relate to all modifiers.
 */
enum class WagerModifiers(
    /**
     * The display name for the modifier
     */
    val displayName: String,

    /**
     * The modifier code, typical 2 characters.
     * i.e. BX for Box, or KY for Key
     */
    val code: String
) {

    STRAIGHT("Straight", "ST"),
    BOX("Box", "BX"),
    KEY("Key", "KY"),
    KEYBOX("Key Box", "BX"),
    WHEEL("Wheel", "WH")
}
