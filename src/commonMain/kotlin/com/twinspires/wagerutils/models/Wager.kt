package com.twinspires.wagerutils.models

import com.twinspires.wagerutils.enums.WagerTypes
import kotlin.js.JsExport


/**
 * An enumeration of the various types of wagers that can be placed.
 *
 * Each wager includes it's code (EX, WN, WPS, etc), display name, and a "multiplier"
 * value for calculating wager totals.
 */
@JsExport
data class Wager(
    /**
     * The wager code.
     */
    val code: String,


    /**
     * The name of the wager,
     * suitable for display to users
     */
    val displayName: String,

    /**
     * The [WagerTypes] value of the wager
     */
    val wagerType: WagerTypes,

    /**
     * A multiplier value that can be used
     * for calculating wager totals.
     * For example, a Win/Place/Show wager uses
     * a multiplier of 3.
     */
    val multiplier: Int,

    /**
     * The number of positions/legs that must be picked
     * for wagers of this type.
     * For basic wagers, this will be 1
     * For PickN wagers, this will be N
     * For Exotics, this will be the number of positions in a straight wager.
     */
     val positions: Int
) {

    companion object {
        private const val QUINELLA_CODE = "QU"
        private const val OMNI_CODE = "OMN"

        /**
         * See if a [Wager] is an Omni/Swinger or Quinella
         *
         * @param wager The [Wager] to check.
         *
         * @return true if it's an Omni/Swinger or Quinella, false otherwise.
         */
        fun isOmniQuinella(wager: Wager): Boolean {
            return wager.code == QUINELLA_CODE || wager.code == OMNI_CODE
        }
    }

}


/**
 * Given a List of [Wager], try to find a
 * [Wager] by it's wager code.
 *
 * @param wagerCode - The wager code of the desired [@see Wager}
 *
 * @return the [Wager] if it exists, null otherwise.
 */
fun List<Wager>.findWager(wagerCode: String): Wager? {
    return this.find { it.code == wagerCode.toUpperCase() }
}
