package com.twinspires.wagerutils.testUtils

/**
 * A list of wager data suitable for testing wagers with invalid data.
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

val failedWagers = listOf(
"0.1,SU,\"BX,3,WT,1,2,3,4,5,6,7,8,9\",201.6",
"0.2,EX,\"BX,1,WT,1,2,3,4,5,6,7,8,9,10,11,12,13,15\",5.6",
"0.2,EX,\"BX,11,WT,1,2,3,4,5,6,7,8,9,10,11,12,13,15\",5.6",
"0.2,EX,\"BX,12,WT,1,2,3,4,5,6,7,8,9,10,11,12,13,15\",5.6",
"0.2,TR,\"BX,1,WT,1,2,3,4,5\",12",
"0.2,TR,\"BX,2,WT,1,2,3,5,8\",12",
"0.2,TR,\"BX,4,WT,1,2,3,4,5\",12",
"0.5,TR,\"BX,1,WT,1,2,3,5\",18",
"0.5,TR,\"BX,2,WT,1,2,3,4,5,6,7,8\",84",
"0.5,TR,\"BX,2,WT,1,2,3,5,6,7\",45",
"0.5,TR,\"BX,2,WT,2,3,4,5,6,7\",45",
"1,EX,\"BX,1,WT,1,2,3,4,5,7,9,10,11\",18",
"1,EX,\"BX,1,WT,1,2,4,6\",8",
"1,EX,\"BX,2,WT,1,2,3,4,5,6,7\",14",
"1,EX,\"BX,2,WT,1,2,3,4,5,6,7,8,9\",18",
"1,EX,\"BX,2,WT,1,2,3,4,5,6,7,8,9,10\",20",
"1,EX,\"BX,2,WT,1,2,3,4,5,6,7,8,9,10,11,12\",24",
"1,EX,\"BX,2,WT,1,2,3,5,6,7\",12",
"1,EX,\"BX,2,WT,2,4,5,8\",8",
"1,EX,\"BX,3,WT,1,2,3,4,5,6\",12",
"1,EX,\"BX,3,WT,1,2,3,4,5,6,7,8,9,10\",20",
"1,EX,\"BX,3,WT,1,2,3,4,5,8,9\",12",
"1,EX,\"BX,4,WT,1,2,3,4,5,6\",12",
"1,EX,\"BX,4,WT,1,2,3,4,5,6,7\",12",
"1,EX,\"BX,4,WT,1,2,3,4,5,6,7\",14",
"1,EX,\"BX,5,WT,1,2,3,4,5,6,7\",12",
"1,EX,\"BX,5,WT,1,2,3,4,5,6,7,8,9\",18",
"1,EX,\"BX,5,WT,1,2,3,4,5,6,7,8,9,10\",20",
"1,EX,\"BX,5,WT,1,2,3,4,5,7\",10",
"1,EX,\"BX,5,WT,2,3,5,8\",8",
"1,EX,\"BX,6,WT,1,2,3,4,5,6,7\",14",
"1,EX,\"BX,6,WT,1,2,4,5,6,7\",12",
"1,EX,\"BX,7,WT,1,2,3,4,5,6,7\",14",
"1,EX,\"BX,7,WT,1,2,3,4,5,6,7,8\",14",
"1,EX,\"BX,7,WT,1,2,3,4,5,6,7,8,9\",16",
"1,EX,\"BX,7,WT,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16\",32",
"1,TR,\"BX,6,WT,1,2,3,4,5,6,7\",126",
"1,TR,\"BX,6,WT,1,4,5,6\",36",
"2,EX,\"BX,1,WT,1,2,3,4,5,6,7\",28",
"2,EX,\"BX,2,WT,1,2,3,4,5,6\",20",
"2,EX,\"BX,3,WT,1,2,3,4,5,8,9\",28",
"2,EX,\"BX,4,WT,1,2,3,4,5,6\",24",
"2,EX,\"BX,4,WT,1,2,3,4,5,7,8,9\",32",
"2,EX,\"BX,6,WT,1,2,3,4,5,6,7\",28",
"2,EX,\"BX,8,WT,1,3,4,5,6,7,8\",28",
"2,EX,\"BX,8,WT,2,3,4,5,6,7,8,9,10\",36",
"3,EX,\"BX,1,WT,1,2,3,4,5,6,7,8\",48",
"3,EX,\"BX,2,WT,1,2,3,4,5,6,7\",42",
"3,EX,\"BX,7,WT,1,3,5,6,7\",30",
"4,EX,\"BX,6,WT,3,4,6\",24",
"5,EX,\"BX,7,WT,1,2,3,4,5,6,7\",60"
)
