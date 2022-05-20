package com.twinspires.wagerutils

internal class IosLogger: Logger {
    private val TAG = "WagerUtils"

    override fun info(message: String) {
        //TODO log info for iOS
    }

    override fun warn(message: String) {
        //TODO log info for iOS
    }

    override fun debug(message: String) {
        //TODO log debug for iOS
    }

    override fun error(message: String, ex: Exception?) {
        //TODO log error for iOS
    }

}

internal actual class LoggerFactory {
    actual companion object {
        actual fun createLogger(): Logger {
            return IosLogger()
        }
    }
}