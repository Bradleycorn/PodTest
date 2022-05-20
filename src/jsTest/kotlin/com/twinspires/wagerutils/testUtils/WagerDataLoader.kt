package com.twinspires.wagerutils.testUtils

import com.twinspires.wagerutils.testUtils.WagerDataLoader

internal class JsWagerDataLoader: WagerDataLoader {
    //TODO Implement loadWagerData() method to load wager data from a flat file.
    // for more info, see the base WagerDataLoader in commonTest
}

internal actual class WagerDataFactory {
    actual companion object {
        actual fun createLoader(): WagerDataLoader = JsWagerDataLoader()
    }
}
