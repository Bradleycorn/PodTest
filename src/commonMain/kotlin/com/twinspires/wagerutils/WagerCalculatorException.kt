package com.twinspires.wagerutils

import com.twinspires.wagerutils.enums.WagerCalculatorErrors
import kotlin.js.JsExport

/**
 * Exception thrown by the wager calculator that allows us use the error on the frontend
 * @param error - The kind of error being thrown
 * @param errorMessage - The error message for the exception
 * @param errorCause - Contains information about the cause of the error
 */
@JsExport
class WagerCalculatorException(val error: WagerCalculatorErrors, errorMessage: String? = null , errorCause: Throwable? = null) : Exception(errorMessage, errorCause)