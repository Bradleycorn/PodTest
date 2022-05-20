package com.twinspires.wagerutils

import android.util.Log

internal class AndroidLogger: Logger {
    private val TAG = "WagerUtils"

    override fun info(message: String) {
        Log.i(TAG, message)
    }

    override fun warn(message: String) {
        Log.w(TAG, message)
    }

    override fun debug(message: String) {
        Log.d(TAG, message)
    }

    override fun error(message: String, ex: Exception?) {
        Log.e(TAG, message, ex)
    }

}

internal actual class LoggerFactory {
    actual companion object {
        actual fun createLogger(): Logger {
            return AndroidLogger()
        }
    }
}
