package com.twinspires.wagerutils

import com.twinspires.wagerutils.enums.LogLevels

internal class JvmLogger: Logger {
    private val TAG = "WagerUtils"

    override fun info(message: String) {
       println("[${LogLevels.INFO}] [$TAG] $message")
    }

    override fun warn(message: String) {
        println("[${LogLevels.WARN}] [$TAG] $message")
    }

    override fun debug(message: String) {
        println("[${LogLevels.DEBUG}] [$TAG] $message")
    }

    override fun error(message: String, ex: Exception?) {
        val logMessage = "$message - ${ex?.toString() ?: ""}"
        println("[${LogLevels.ERROR}] [$TAG] $logMessage")
    }

}

internal actual class LoggerFactory {
    actual companion object {
        actual fun createLogger(): Logger {
            return JvmLogger()
        }
    }
}
