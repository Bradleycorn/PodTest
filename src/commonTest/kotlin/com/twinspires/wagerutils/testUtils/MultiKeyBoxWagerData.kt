package com.twinspires.wagerutils.testUtils

/**
 * A list of wager data suitable for testing wagers with a KEY BOX modifier and multiple KEY runners.
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
val multiKeyBoxWagers = listOf(
    "0.10,SU,\"BX,1,4,5,WT,3,4,5\",2.40",
    "0.10,TR,\"BX,1,2,3,4,5,6,7,8,9,10,11,WT,5,6,8\",16.20",
    "0.10,TR,\"BX,1,2,3,4,5,6,7,8,9,10,WT,1,2,9\",14.40",
    "0.20,EX,\"BX,6,13,WT,1,2,3,4,5,6,7,8,9,10,11,12,13,16\",10.40",
    "0.20,SU,\"BX,4,7,WT,2,4,6,7,9,10\",96.00",
    "0.20,TR,\"BX,1,3,6,WT,1,3,6\",3.60",
    "0.20,TR,\"BX,1,7,WT,2,3,4,5,6\",24.00",
    "0.20,TR,\"BX,3,4,WT,1,2,3,4,5,6,7,8,9\",67.20",
    "0.20,TR,\"BX,7,8,9,WT,1,2,3,4,5,6,7,8,9\",100.80",
    "0.50,TR,\"BX,1,5,WT,2,3,4\",18.00",
    "0.50,TR,\"BX,5,7,WT,2,5,6,7\",18.00",
    "0.60,EX,\"BX,2,4,9,WT,1,2,3,4,5,6,7,8,9,10,11\",36.00",
    "1,TR,\"BX,1,3,5,WT,3,5,7,9,11\",132.00",
    "1.00,EX,\"BX,1,2,3,4,5,6,7,8,9,WT,1,5,8\",48.00",
    "1.00,EX,\"BX,1,2,3,4,5,6,7,WT,4\",12.00",
    "1.00,EX,\"BX,1,5,6,7,WT,1,2,3,4,5,6,7\",48.00",
    "1.00,EX,\"BX,1,5,6,9,WT,1,5,6,9\",24.00",
    "1.00,EX,\"BX,1,5,WT,1,5,8\",8.00",
    "1.00,EX,\"BX,2,3,WT,1,2,3,4,5,6,7,8\",28.00",
    "1.00,EX,\"BX,2,4,5,WT,3,6\",12.00",
    "1.00,EX,\"BX,2,4,8,WT,1,2,3,4,5,6,7,8\",42.00",
    "1.00,EX,\"BX,2,4,WT,2,3,4\",8.00",
    "1.00,EX,\"BX,2,4,WT,2,4,5,9\",12.00",
    "1.00,EX,\"BX,2,7,10,WT,2,7,10\",12.00",
    "1.00,EX,\"BX,3,6,WT,1,2,5\",12.00",
    "1.00,EX,\"BX,3,7,WT,1,2,3,4,5,6,7,8\",28.00",
    "1.00,EX,\"BX,4,6,WT,3,4,6\",8.00",
    "1.00,EX,\"BX,5,7,WT,1,2,3,4,5,6,7,8\",28.00",
    "1.00,EX,\"BX,5,8,WT,1,3,4,5,6,7,8\",24.00",
    "1.00,EX,\"BX,6,7,WT,6,7\",4.00",
    "1.00,EX,\"BX,6,8,WT,1,4,9\",12.00",
    "1.00,TR,\"BX,1,4,WT,5,6\",12.00",
    "1.00,TR,\"BX,2,5,WT,1,3,4\",36.00",
    "1.00,TR,\"BX,3,5,10,WT,3,8\",12.00",
    "1.00,TR,\"BX,3,5,WT,2,4\",12.00",
    "1.00,TR,\"BX,3,5,WT,6,7\",12.00",
    "1.00,TR,\"BX,4,5,WT,3,7\",12.00",
    "1.00,TR,\"BX,4,6,WT,1,3,5\",36.00",
    "2.00,EX,\"BX,4,6,WT,2,6\",12.00",
    "3.00,EX,\"BX,4,7,WT,2,4,6,7,9,10\",60.00"
)
