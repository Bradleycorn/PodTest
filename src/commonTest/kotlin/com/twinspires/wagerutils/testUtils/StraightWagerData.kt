package com.twinspires.wagerutils.testUtils


/**
 * A list of wager data suitable for testing STRAIGHT/BASIC wagers.
 *
 * Ideally, this data would be kept in a flat file in the resources dir.
 * However, there is currently a defect with Kotlin Multiplatform projects
 * not properly using files in the resources/ dir.
 *
 * More info here:
 * https://youtrack.jetbrains.com/issue/KT-24463
 *
 * Format of the data is:
 * base amount, wager type, runList, expected total
 */
val straightWagers = listOf(
    "1,WN,\"1,2\",2",
    "1,WN,\"6,7,12,14\",4",
    "1,WN,\"6\",1",
    "1,WP,\"1,2,3,4\",8",
    "1,WPS,\"1\",3",
    "2,WPS,\"1,2,3,4,5,6,7,8\",48",
    "1,PL,1,1",
    "1,PL,\"1,2,3,4\",4",
    "1,SH,1,1",
    "1,SH,\"1,2,3,4\",4",
    "1,WS,1,2",
    "1,WS,\"1,2,3,4\",8",
    "1,PS,1,2",
    "1,PS,\"1,2,3,4\",8",
    "1,TR,\"1,WT,2,WT,3\",1",
    "1,TR,\"1,WT,1,2,WT,1,2,3\",1",
    "1,TR,\"1,2,3,WT,1,2,3,WT,1,2,3\",6",
    "0.10,SU,\"1,2,WT,1,2,3,4,WT,1,2,3,4,WT,1,2,3,4\",1.20"
)
