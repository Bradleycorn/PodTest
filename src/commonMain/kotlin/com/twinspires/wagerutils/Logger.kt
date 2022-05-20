package com.twinspires.wagerutils


internal interface Logger {

    fun info(message: String)
    fun warn(message: String)
    fun debug(message: String)
    fun error(message: String, ex: Exception? = null)
}

internal expect class LoggerFactory {
    companion object {
        fun createLogger(): Logger
    }
}
