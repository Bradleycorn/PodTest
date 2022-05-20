package android.util

/**
 * Mock the Android Log class so unit tests will do their thing...
 */
object Log {
    @JvmStatic
    fun d(tag: String, msg: String): Int {
        println("DEBUG: $tag: $msg")
        return 0
    }

    @JvmStatic
    fun i(tag: String, msg: String): Int {
        println("INFO: $tag: $msg")
        return 0
    }

    @JvmStatic
    fun w(tag: String, msg: String): Int {
        println("WARN: $tag: $msg")
        return 0
    }

    @JvmStatic
    fun e(tag: String, msg: String): Int {
        println("ERROR: $tag: $msg")
        return 0
    }

    @JvmStatic
    fun e(tag: String, msg: String, tr: Throwable): Int {
        println("ERROR: $tag: $msg")
        return 0
    }

    // add other methods if required...
}

