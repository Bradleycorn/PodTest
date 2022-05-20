package com.twinspires.wagerutils

internal class JsLogger: Logger {
    private val TAG = "WagerUtils"

    override fun info(message: String) {
        console.info("[$TAG] $message")
    }

    override fun warn(message: String) {
        console.warn("[$TAG] $message")
    }

    override fun debug(message: String) {
        console.log("[$TAG] $message")
    }

    override fun error(message: String, ex: Exception?) {
        val logMessage = "$message - ${ex?.toString() ?: ""}"
        console.error("[$TAG] $logMessage")
    }

}

internal actual class LoggerFactory {
    actual companion object {
        actual fun createLogger(): Logger {
            return JsLogger()
        }
    }
}
