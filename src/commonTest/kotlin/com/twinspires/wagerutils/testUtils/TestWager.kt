package com.twinspires.wagerutils.testUtils

data class TestWager(val baseAmount: Float, val wagerCode: String, val runList: String, val expectedTotal: Float) {
    companion object {
        fun create(data: List<String>): TestWager? {
            val amount = data[0].toFloatOrNull()
            val code = data[1]
            val runList = data[2]
            val expectedTotal = data[3].toFloatOrNull()

            return when {
                amount == null -> null
                expectedTotal == null -> null
                else -> TestWager(amount, code, runList, expectedTotal)
            }
        }
    }
}
