package com.twinspires.wagerutils.testUtils


/**
 * A list of wager data suitable for testing wagers with a KEY modifier.
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
val keyWagers = listOf(
    "0.1,SU,\"KY,1,2,3,4\",0.6",
    "0.1,SU,\"KY,1,2,3,4,5\",2.4",
    "0.1,SU,\"KY,1,2,3,5\",0.6",
    "0.1,SU,\"KY,1,2,3,5,6\",2.4",
    "0.1,SU,\"KY,1,2,3,5,7\",2.4",
    "0.1,SU,\"KY,1,2,3,5,9\",2.4",
    "0.1,SU,\"KY,1,2,3,6,7\",2.4",
    "0.1,SU,\"KY,1,2,3,7,8\",2.4",
    "0.1,SU,\"KY,1,2,3,7,9\",2.4",
    "0.1,SU,\"KY,1,2,3,9,10\",2.4",
    "0.1,SU,\"KY,1,2,4,10\",0.6",
    "0.1,SU,\"KY,1,2,4,6,7\",2.4",
    "0.1,SU,\"KY,1,2,4,7\",0.6",
    "0.1,SU,\"KY,1,2,4,7,10\",2.4",
    "0.1,SU,\"KY,1,2,5,6\",0.6",
    "0.1,SU,\"KY,1,2,5,6,7\",2.4",
    "0.1,SU,\"KY,1,2,5,7,8\",2.4",
    "0.1,SU,\"KY,1,2,5,9,12\",2.4",
    "0.1,SU,\"KY,1,2,9,10,11\",2.4",
    "0.1,SU,\"KY,1,3,4,5,7\",2.4",
    "0.1,SU,\"KY,1,3,4,5,8\",2.4",
    "0.1,SU,\"KY,1,3,4,6,7\",2.4",
    "0.1,SU,\"KY,1,3,5,6\",0.6",
    "0.1,SU,\"KY,1,3,5,6,7\",2.4",
    "0.1,SU,\"KY,1,3,5,6,9\",2.4",
    "0.1,SU,\"KY,1,3,5,7,9\",2.4",
    "0.1,SU,\"KY,1,3,7,9\",0.6",
    "0.1,SU,\"KY,1,4,5,6\",0.6",
    "0.1,SU,\"KY,1,4,5,6,7\",2.4",
    "0.1,SU,\"KY,1,4,5,7\",0.6",
    "0.1,SU,\"KY,1,5,6,7,9\",2.4",
    "0.1,SU,\"KY,1,7,9,11\",0.6",
    "0.1,SU,\"KY,10,1,2,3,9\",2.4",
    "0.1,SU,\"KY,10,1,2,5,7\",2.4",
    "0.1,SU,\"KY,10,3,5,8,9\",2.4",
    "0.1,SU,\"KY,10,7,8,11\",0.6",
    "0.1,SU,\"KY,11,1,2,7,9\",2.4",
    "0.1,SU,\"KY,11,2,3,7,8,9\",6",
    "0.1,SU,\"KY,11,2,7,9\",0.6",
    "0.1,SU,\"KY,2,1,10,11\",0.6",
    "0.1,SU,\"KY,2,1,3,4,5\",2.4",
    "0.1,SU,\"KY,2,1,3,4,5,6,7,8\",21",
    "0.1,SU,\"KY,2,1,3,4,5,7\",6",
    "0.1,SU,\"KY,2,1,3,4,8\",2.4",
    "0.1,SU,\"KY,2,1,3,5\",0.6",
    "0.1,SU,\"KY,2,1,3,5,8\",2.4",
    "0.1,SU,\"KY,2,1,3,6,7\",2.4",
    "0.1,SU,\"KY,2,1,3,6,8\",2.4",
    "0.1,SU,\"KY,2,1,3,7\",0.6",
    "0.1,SU,\"KY,2,1,3,9,10\",2.4",
    "0.1,SU,\"KY,2,1,4,5\",0.6",
    "0.1,SU,\"KY,2,1,4,5,7\",2.4",
    "0.1,SU,\"KY,2,1,4,5,9\",2.4",
    "0.1,SU,\"KY,2,1,4,6\",0.6",
    "0.1,SU,\"KY,2,1,4,6,7\",2.4",
    "0.1,SU,\"KY,2,1,4,6,7,10,11\",12",
    "0.1,SU,\"KY,2,1,4,6,7,8,9,10,11\",33.6",
    "0.1,SU,\"KY,2,1,4,6,9\",2.4",
    "0.1,SU,\"KY,2,1,4,7\",0.6",
    "0.1,SU,\"KY,2,1,4,8,9\",2.4",
    "0.1,SU,\"KY,2,1,4,9\",0.6",
    "0.1,SU,\"KY,2,1,4,9,11\",2.4",
    "0.1,SU,\"KY,2,1,5,6,7\",2.4",
    "0.1,SU,\"KY,2,1,5,7\",0.6",
    "0.1,SU,\"KY,2,1,5,8,9\",2.4",
    "0.1,SU,\"KY,2,1,7,8,11\",2.4",
    "0.1,SU,\"KY,2,1,7,9,10\",2.4",
    "0.1,SU,\"KY,2,1,9,10,11\",2.4",
    "0.1,SU,\"KY,2,3,4,5\",0.6",
    "0.1,SU,\"KY,2,3,4,6\",0.6",
    "0.1,SU,\"KY,2,3,4,8,10\",2.4",
    "0.1,SU,\"KY,2,3,5,7,8\",2.4",
    "0.1,SU,\"KY,2,3,6,7,8\",2.4",
    "0.1,SU,\"KY,2,4,7,10\",0.6",
    "0.1,SU,\"KY,2,5,6,8\",0.6",
    "0.1,SU,\"KY,2,6,7,10\",0.6",
    "0.1,SU,\"KY,2,6,7,8,9,10\",6",
    "0.1,SU,\"KY,2,6,8,10\",0.6",
    "0.1,SU,\"KY,2,6,9,10,13\",2.4",
    "0.1,SU,\"KY,3,1,2,4,5\",2.4",
    "0.1,SU,\"KY,3,1,2,4,5,6,7,8\",21",
    "0.1,SU,\"KY,3,1,2,4,6\",2.4",
    "0.1,SU,\"KY,3,1,2,4,8\",2.4",
    "0.1,SU,\"KY,3,1,2,4,9\",2.4",
    "0.1,SU,\"KY,3,1,2,5,10\",2.4",
    "0.1,SU,\"KY,3,1,2,5,6\",2.4",
    "0.1,SU,\"KY,3,1,2,5,8\",2.4",
    "0.1,SU,\"KY,3,1,2,6,8\",2.4",
    "0.1,SU,\"KY,3,1,2,7\",0.6",
    "0.1,SU,\"KY,3,1,4,5,6\",2.4",
    "0.1,SU,\"KY,3,1,4,5,7\",2.4",
    "0.1,SU,\"KY,3,1,4,5,8\",2.4",
    "0.1,SU,\"KY,3,1,4,6,7\",2.4",
    "0.1,SU,\"KY,3,1,5,6\",0.6",
    "0.1,SU,\"KY,3,1,5,7\",0.6",
    "0.1,SU,\"KY,3,1,6,7\",0.6",
    "0.1,SU,\"KY,3,2,4,5,6\",2.4",
    "0.1,SU,\"KY,3,2,4,5,6,7\",6",
    "0.1,SU,\"KY,3,2,4,6,7\",2.4",
    "0.1,SU,\"KY,3,2,5,6\",0.6",
    "0.1,SU,\"KY,3,2,5,6,7\",2.4",
    "0.1,SU,\"KY,3,2,6,7\",0.6",
    "0.1,SU,\"KY,3,2,6,8\",0.6",
    "0.1,SU,\"KY,3,4,5,6\",0.6",
    "0.1,SU,\"KY,3,5,8,9,10\",2.4",
    "0.1,SU,\"KY,4,1,2,3\",0.6",
    "0.1,SU,\"KY,4,1,2,3,7\",2.4",
    "0.1,SU,\"KY,4,1,2,5\",0.6",
    "0.1,SU,\"KY,4,1,2,5,7\",2.4",
    "0.1,SU,\"KY,4,1,2,6,9\",2.4",
    "0.1,SU,\"KY,4,1,3,5\",0.6",
    "0.1,SU,\"KY,4,1,3,5,7\",2.4",
    "0.1,SU,\"KY,4,1,3,5,8\",2.4",
    "0.1,SU,\"KY,4,1,3,6\",0.6",
    "0.1,SU,\"KY,4,1,3,6,7\",2.4",
    "0.1,SU,\"KY,4,1,5,6\",0.6",
    "0.1,SU,\"KY,4,2,3,5\",0.6",
    "0.1,SU,\"KY,5,1,2,3\",0.6",
    "0.1,SU,\"KY,5,1,2,3,10\",2.4",
    "0.1,SU,\"KY,5,1,2,3,4\",2.4",
    "0.1,SU,\"KY,5,1,2,3,6,7\",6",
    "0.1,SU,\"KY,5,1,2,3,7\",2.4",
    "0.1,SU,\"KY,5,1,2,3,9\",2.4",
    "0.1,SU,\"KY,5,1,2,4\",0.6",
    "0.1,SU,\"KY,5,1,2,4,7\",2.4",
    "0.1,SU,\"KY,5,1,2,6\",0.6",
    "0.1,SU,\"KY,5,1,2,7\",0.6",
    "0.1,SU,\"KY,5,1,2,7,8\",2.4",
    "0.1,SU,\"KY,5,1,3,4,6\",2.4",
    "0.1,SU,\"KY,5,1,3,4,6,7\",6",
    "0.1,SU,\"KY,5,1,3,4,7\",2.4",
    "0.1,SU,\"KY,5,1,3,4,8\",2.4",
    "0.1,SU,\"KY,5,1,3,6\",0.6",
    "0.1,SU,\"KY,5,1,3,7\",0.6",
    "0.1,SU,\"KY,5,1,3,7,9\",2.4",
    "0.1,SU,\"KY,5,1,4,7\",0.6",
    "0.1,SU,\"KY,5,1,6,7,8\",2.4",
    "0.1,SU,\"KY,5,1,6,7,9\",2.4",
    "0.1,SU,\"KY,5,1,7,8\",0.6",
    "0.1,SU,\"KY,5,2,3,6\",0.6",
    "0.1,SU,\"KY,5,2,4,6\",0.6",
    "0.1,SU,\"KY,5,3,8,9,10\",2.4",
    "0.1,SU,\"KY,5,6,10,11\",0.6",
    "0.1,SU,\"KY,5,6,7,8\",0.6",
    "0.1,SU,\"KY,6,1,2,3\",0.6",
    "0.1,SU,\"KY,6,1,2,3,5\",2.4",
    "0.1,SU,\"KY,6,1,2,4\",0.6",
    "0.1,SU,\"KY,6,1,2,4,5,7\",6",
    "0.1,SU,\"KY,6,1,2,4,9\",2.4",
    "0.1,SU,\"KY,6,1,3,4\",0.6",
    "0.1,SU,\"KY,6,1,3,5\",0.6",
    "0.1,SU,\"KY,6,1,3,5,7\",2.4",
    "0.1,SU,\"KY,6,1,3,5,9\",2.4",
    "0.1,SU,\"KY,6,1,4,5\",0.6",
    "0.1,SU,\"KY,6,2,4,7,8,9,10,11\",21",
    "0.1,SU,\"KY,6,2,4,8\",0.6",
    "0.1,SU,\"KY,6,2,7,8,9,10\",6",
    "0.1,SU,\"KY,6,3,4,5\",0.6",
    "0.1,SU,\"KY,6,3,4,7\",0.6",
    "0.1,SU,\"KY,6,3,4,7,8\",2.4",
    "0.1,SU,\"KY,6,4,7,8,9,10\",6",
    "0.1,SU,\"KY,7,1,2,3\",0.6",
    "0.1,SU,\"KY,7,1,2,3,5\",2.4",
    "0.1,SU,\"KY,7,1,2,3,5,8,10\",12",
    "0.1,SU,\"KY,7,1,2,3,6\",2.4",
    "0.1,SU,\"KY,7,1,2,8,11\",2.4",
    "0.1,SU,\"KY,7,1,3,4,6\",2.4",
    "0.1,SU,\"KY,7,1,3,5\",0.6",
    "0.1,SU,\"KY,7,1,3,6\",0.6",
    "0.1,SU,\"KY,7,1,4,5\",0.6",
    "0.1,SU,\"KY,7,1,4,5,6\",2.4",
    "0.1,SU,\"KY,7,1,5,8\",0.6",
    "0.1,SU,\"KY,7,2,3,6,8\",2.4",
    "0.1,SU,\"KY,7,2,4,11\",0.6",
    "0.1,SU,\"KY,7,2,5,6\",0.6",
    "0.1,SU,\"KY,7,2,9,10,11\",2.4",
    "0.1,SU,\"KY,7,3,4,5\",0.6",
    "0.1,SU,\"KY,8,1,2,3,5,7\",6",
    "0.1,SU,\"KY,8,1,2,3,6\",2.4",
    "0.1,SU,\"KY,8,1,2,4,9\",2.4",
    "0.1,SU,\"KY,8,2,3,4,6\",2.4",
    "0.1,SU,\"KY,8,2,3,6,7\",2.4",
    "0.1,SU,\"KY,8,3,4,5,7,9,10\",12",
    "0.1,SU,\"KY,9,1,2,3,7\",2.4",
    "0.1,SU,\"KY,9,1,2,4,6\",2.4",
    "0.1,SU,\"KY,9,1,3,5,6\",2.4",
    "0.1,TR,\"KY,14,2,7,8\",0.6",
    "0.1,TR,\"KY,2,7,8,14\",0.6",
    "0.1,TR,\"KY,3,1,4,5\",0.6",
    "0.1,TR,\"KY,6,1,2,4,9\",1.2",
    "0.2,E5,\"KY,2,1,3,5,6\",4.8",
    "0.2,E5,\"KY,2,1,4,5,6\",4.8",
    "0.2,E5,\"KY,3,1,4,5,7\",4.8",
    "0.2,E5,\"KY,3,2,6,7,8\",4.8",
    "0.2,E5,\"KY,5,1,4,6,7\",4.8",
    "0.2,E5,\"KY,6,1,3,7,8\",4.8",
    "0.2,SU,\"KY,1,2,3,4\",1.2",
    "0.2,SU,\"KY,1,2,3,4,6\",4.8",
    "0.2,SU,\"KY,1,2,3,5\",1.2",
    "0.2,SU,\"KY,1,2,3,6\",1.2",
    "0.2,SU,\"KY,1,2,4,5,6\",4.8",
    "0.2,SU,\"KY,1,3,4,7,11\",4.8",
    "0.2,SU,\"KY,1,3,4,8\",1.2",
    "0.2,SU,\"KY,1,3,5,6\",1.2",
    "0.2,SU,\"KY,1,3,5,6,13\",4.8",
    "0.2,SU,\"KY,1,4,5,6,7\",4.8",
    "0.2,SU,\"KY,1,4,7,8\",1.2",
    "0.2,SU,\"KY,1,5,6,11\",1.2",
    "0.2,SU,\"KY,1,5,7,11\",1.2",
    "0.2,SU,\"KY,1,5,8,11\",1.2",
    "0.2,SU,\"KY,10,1,2,5\",1.2",
    "0.2,SU,\"KY,10,2,5,7\",1.2",
    "0.2,SU,\"KY,10,2,7,8\",1.2",
    "0.2,SU,\"KY,11,1,3,4,7\",4.8",
    "0.2,SU,\"KY,11,2,4,7\",1.2",
    "0.2,SU,\"KY,11,2,7,10\",1.2",
    "0.2,SU,\"KY,11,2,7,8\",1.2",
    "0.2,SU,\"KY,2,1,3,4\",1.2",
    "0.2,SU,\"KY,2,1,3,5\",1.2",
    "0.2,SU,\"KY,2,1,3,5,6\",4.8",
    "0.2,SU,\"KY,2,1,4,5,7\",4.8",
    "0.2,SU,\"KY,2,1,4,7,8\",4.8",
    "0.2,SU,\"KY,3,1,2,5,6\",4.8",
    "0.2,SU,\"KY,3,1,2,5,7\",4.8",
    "0.2,SU,\"KY,3,1,2,7,8\",4.8",
    "0.2,SU,\"KY,3,1,4,5,7\",4.8",
    "0.2,SU,\"KY,3,1,5,7\",1.2",
    "0.2,SU,\"KY,3,4,5,7\",1.2",
    "0.2,SU,\"KY,3,5,6,7\",1.2",
    "0.2,SU,\"KY,4,1,2,7,8\",4.8",
    "0.2,SU,\"KY,4,1,2,8\",1.2",
    "0.2,SU,\"KY,4,1,3,5,7\",4.8",
    "0.2,SU,\"KY,4,1,5,6\",1.2",
    "0.2,SU,\"KY,4,2,3,5,6\",4.8",
    "0.2,SU,\"KY,4,2,3,6\",1.2",
    "0.2,SU,\"KY,5,1,2,3\",1.2",
    "0.2,SU,\"KY,5,1,2,3,6\",4.8",
    "0.2,SU,\"KY,5,1,2,3,7\",4.8",
    "0.2,SU,\"KY,5,1,2,6,8\",4.8",
    "0.2,SU,\"KY,5,1,3,6\",1.2",
    "0.2,SU,\"KY,5,2,3,4,6,7\",12",
    "0.2,SU,\"KY,5,2,3,6,7,8\",12",
    "0.2,SU,\"KY,5,2,4,6\",1.2",
    "0.2,SU,\"KY,5,3,4,6,7\",4.8",
    "0.2,SU,\"KY,5,4,6,7\",1.2",
    "0.2,SU,\"KY,5,4,6,8\",1.2",
    "0.2,SU,\"KY,5,4,7,9,12\",4.8",
    "0.2,SU,\"KY,6,1,2,3\",1.2",
    "0.2,SU,\"KY,6,1,2,3,4,5,7\",24",
    "0.2,SU,\"KY,6,1,2,3,5\",4.8",
    "0.2,SU,\"KY,6,1,2,4\",1.2",
    "0.2,SU,\"KY,6,1,2,4,5\",4.8",
    "0.2,SU,\"KY,6,2,3,4\",1.2",
    "0.2,SU,\"KY,6,2,7,8\",1.2",
    "0.2,SU,\"KY,6,2,7,9,11\",4.8",
    "0.2,SU,\"KY,6,3,7,8\",1.2",
    "0.2,SU,\"KY,7,1,2,5,6\",4.8",
    "0.2,SU,\"KY,7,1,3,6\",1.2",
    "0.2,SU,\"KY,7,2,3,4\",1.2",
    "0.2,SU,\"KY,7,2,3,6\",1.2",
    "0.2,SU,\"KY,7,3,4,5\",1.2",
    "0.2,SU,\"KY,8,2,7,11\",1.2",
    "0.2,SU,\"KY,8,3,4,6\",1.2",
    "0.2,SU,\"KY,9,2,3,7\",1.2",
    "0.2,TR,\"KY,1,2,3\",0.4",
    "0.2,TR,\"KY,1,2,3,4,6\",2.4",
    "0.2,TR,\"KY,1,2,3,4,7\",2.4",
    "0.2,TR,\"KY,1,2,4\",0.4",
    "0.2,TR,\"KY,1,2,5,7\",1.2",
    "0.2,TR,\"KY,1,2,6\",0.4",
    "0.2,TR,\"KY,1,3,4\",0.4",
    "0.2,TR,\"KY,1,3,4,5,7\",2.4",
    "0.2,TR,\"KY,1,3,5\",0.4",
    "0.2,TR,\"KY,1,4,5,7\",1.2",
    "0.2,TR,\"KY,1,5,6\",0.4",
    "0.2,TR,\"KY,1,5,8\",0.4",
    "0.2,TR,\"KY,2,1,3\",0.4",
    "0.2,TR,\"KY,2,1,3,4,5,6,7\",6",
    "0.2,TR,\"KY,2,1,3,4,5,8\",4",
    "0.2,TR,\"KY,2,1,4\",0.4",
    "0.2,TR,\"KY,2,1,4,6\",1.2",
    "0.2,TR,\"KY,2,3,4\",0.4",
    "0.2,TR,\"KY,2,3,5,7\",1.2",
    "0.2,TR,\"KY,2,5,6\",0.4",
    "0.2,TR,\"KY,2,6,10,11\",1.2",
    "0.2,TR,\"KY,2,6,7\",0.4",
    "0.2,TR,\"KY,3,1,2\",0.4",
    "0.2,TR,\"KY,3,1,2,4\",1.2",
    "0.2,TR,\"KY,3,1,2,7,8\",2.4",
    "0.2,TR,\"KY,3,1,5\",0.4",
    "0.2,TR,\"KY,3,1,7\",0.4",
    "0.2,TR,\"KY,3,2,4,5,6\",2.4",
    "0.2,TR,\"KY,3,2,4,5,6,7\",4",
    "0.2,TR,\"KY,3,2,4,5,7\",2.4",
    "0.2,TR,\"KY,3,2,6,7\",1.2",
    "0.2,TR,\"KY,3,2,6,7,9\",2.4",
    "0.2,TR,\"KY,3,2,7\",0.4",
    "0.2,TR,\"KY,3,4,5,7,8\",2.4",
    "0.2,TR,\"KY,3,5,6,7\",1.2",
    "0.2,TR,\"KY,3,5,7\",0.4",
    "0.2,TR,\"KY,3,6,8\",0.4",
    "0.2,TR,\"KY,3,6,9\",0.4",
    "0.2,TR,\"KY,4,1,2\",0.4",
    "0.2,TR,\"KY,4,1,2,3\",1.2",
    "0.2,TR,\"KY,4,1,5\",0.4",
    "0.2,TR,\"KY,4,1,6\",0.4",
    "0.2,TR,\"KY,4,1,8\",0.4",
    "0.2,TR,\"KY,4,2,3,5,6\",2.4",
    "0.2,TR,\"KY,4,5,6,9\",1.2",
    "0.2,TR,\"KY,4,5,7\",0.4",
    "0.2,TR,\"KY,4,6,8\",0.4",
    "0.2,TR,\"KY,5,1,2,3\",1.2",
    "0.2,TR,\"KY,5,1,3\",0.4",
    "0.2,TR,\"KY,5,2,3\",0.4",
    "0.2,TR,\"KY,5,2,4\",0.4",
    "0.2,TR,\"KY,5,3,4\",0.4",
    "0.2,TR,\"KY,5,3,4,7\",1.2",
    "0.2,TR,\"KY,5,7,8,9\",1.2",
    "0.2,TR,\"KY,5,8,10\",0.4",
    "0.2,TR,\"KY,6,1,2,3,4,5,7\",6",
    "0.2,TR,\"KY,6,1,2,3,4,5,7,8,9\",11.2",
    "0.2,TR,\"KY,6,1,2,3,4,5,7,8,9,10\",14.4",
    "0.2,TR,\"KY,6,1,2,4,5\",2.4",
    "0.2,TR,\"KY,6,1,5\",0.4",
    "0.2,TR,\"KY,6,2,3\",0.4",
    "0.2,TR,\"KY,6,2,3,8,9\",2.4",
    "0.2,TR,\"KY,7,1,2,3,4\",2.4",
    "0.2,TR,\"KY,7,1,3\",0.4",
    "0.2,TR,\"KY,7,2,8\",0.4",
    "0.2,TR,\"KY,7,3,8\",0.4",
    "0.2,TR,\"KY,7,5,6\",0.4",
    "0.2,TR,\"KY,7,8,9\",0.4",
    "0.2,TR,\"KY,8,2,7\",0.4",
    "0.3,SU,\"KY,1,2,3,9\",1.8",
    "0.3,SU,\"KY,1,2,4,6\",1.8",
    "0.3,SU,\"KY,1,4,5,7\",1.8",
    "0.3,SU,\"KY,2,1,3,4,8\",7.2",
    "0.3,SU,\"KY,2,3,6,7\",1.8",
    "0.3,SU,\"KY,3,1,4,6\",1.8",
    "0.3,SU,\"KY,4,1,2,5\",1.8",
    "0.3,SU,\"KY,4,1,2,7\",1.8",
    "0.3,SU,\"KY,4,2,5,7\",1.8",
    "0.3,SU,\"KY,5,1,3,6\",1.8",
    "0.3,SU,\"KY,5,2,4,7\",1.8",
    "0.3,SU,\"KY,6,2,3,7\",1.8",
    "0.3,SU,\"KY,8,2,5,7\",1.8",
    "0.3,TR,\"KY,8,2,5,7\",1.8",
    "0.4,SU,\"KY,2,1,3,7\",2.4",
    "0.4,SU,\"KY,2,3,5,7\",2.4",
    "0.4,SU,\"KY,3,1,2,7\",2.4",
    "0.4,SU,\"KY,3,2,6,7\",2.4",
    "0.4,SU,\"KY,3,4,5,7\",2.4",
    "0.4,SU,\"KY,4,1,2,6\",2.4",
    "0.4,SU,\"KY,4,1,2,7\",2.4",
    "0.4,SU,\"KY,5,1,3,7\",2.4",
    "0.4,TR,\"KY,1,2,4\",0.8",
    "0.4,TR,\"KY,1,4,5,6\",2.4",
    "0.4,TR,\"KY,2,3,4\",0.8",
    "0.4,TR,\"KY,2,3,5\",0.8",
    "0.4,TR,\"KY,2,3,5,7\",2.4",
    "0.4,TR,\"KY,3,1,2\",0.8",
    "0.4,TR,\"KY,3,1,4\",0.8",
    "0.4,TR,\"KY,3,1,4,5\",2.4",
    "0.4,TR,\"KY,3,2,5\",0.8",
    "0.4,TR,\"KY,4,2,7\",0.8",
    "0.4,TR,\"KY,4,3,6\",0.8",
    "0.4,TR,\"KY,5,1,2\",0.8",
    "0.4,TR,\"KY,6,1,2\",0.8",
    "0.4,TR,\"KY,6,1,3,4\",2.4",
    "0.4,TR,\"KY,6,3,4\",0.8",
    "0.4,TR,\"KY,6,8,10\",0.8",
    "0.5,SU,\"KY,1,2,3,7\",3",
    "0.5,SU,\"KY,1,3,4,5,6\",12",
    "0.5,SU,\"KY,1,3,4,7,8\",12",
    "0.5,SU,\"KY,1,3,4,8\",3",
    "0.5,SU,\"KY,1,3,5,7,8\",12",
    "0.5,SU,\"KY,1,4,5,6\",3",
    "0.5,SU,\"KY,1,4,5,7\",3",
    "0.5,SU,\"KY,1,4,7,8\",3",
    "0.5,SU,\"KY,11,1,2,9,10\",12",
    "0.5,SU,\"KY,2,1,4,5,6\",12",
    "0.5,SU,\"KY,2,1,4,5,7\",12",
    "0.5,SU,\"KY,2,1,4,6,7\",12",
    "0.5,SU,\"KY,2,1,4,7\",3",
    "0.5,SU,\"KY,2,1,5,6,8\",12",
    "0.5,SU,\"KY,2,1,9,10,11\",12",
    "0.5,SU,\"KY,2,4,5,6\",3",
    "0.5,SU,\"KY,2,6,7,8,10\",12",
    "0.5,SU,\"KY,3,1,4,5,8\",12",
    "0.5,SU,\"KY,3,1,4,6\",3",
    "0.5,SU,\"KY,3,1,5,6,7\",12",
    "0.5,SU,\"KY,3,1,6,7\",3",
    "0.5,SU,\"KY,3,1,7,8\",3",
    "0.5,SU,\"KY,3,2,6,7\",3",
    "0.5,SU,\"KY,3,2,8,9\",3",
    "0.5,SU,\"KY,4,1,2,3\",3",
    "0.5,SU,\"KY,4,1,2,3,5\",12",
    "0.5,SU,\"KY,4,1,2,7\",3",
    "0.5,SU,\"KY,4,1,3,5\",3",
    "0.5,SU,\"KY,4,1,3,6,8\",12",
    "0.5,SU,\"KY,4,1,3,8\",3",
    "0.5,SU,\"KY,4,1,5,7\",3",
    "0.5,SU,\"KY,4,2,3,5\",3",
    "0.5,SU,\"KY,4,2,7,9,10\",12",
    "0.5,SU,\"KY,5,1,2,4\",3",
    "0.5,SU,\"KY,5,1,2,4,6\",12",
    "0.5,SU,\"KY,5,1,2,4,7\",12",
    "0.5,SU,\"KY,5,1,3,7\",3",
    "0.5,SU,\"KY,5,1,7,8\",3",
    "0.5,SU,\"KY,5,2,3,7,8\",12",
    "0.5,SU,\"KY,5,3,4,6\",3",
    "0.5,SU,\"KY,5,4,6,7\",3",
    "0.5,SU,\"KY,5,7,8,9\",3",
    "0.5,SU,\"KY,6,1,2,3\",3",
    "0.5,SU,\"KY,6,1,2,4\",3",
    "0.5,SU,\"KY,6,1,2,4,5\",12",
    "0.5,SU,\"KY,6,1,2,4,7\",12",
    "0.5,SU,\"KY,6,1,2,5\",3",
    "0.5,SU,\"KY,6,1,3,7\",3",
    "0.5,SU,\"KY,6,1,3,8\",3",
    "0.5,SU,\"KY,6,1,4,5\",3",
    "0.5,SU,\"KY,6,1,5,7\",3",
    "0.5,SU,\"KY,6,1,7,8\",3",
    "0.5,SU,\"KY,6,2,3,4,5\",12",
    "0.5,SU,\"KY,6,2,3,4,7\",12",
    "0.5,SU,\"KY,6,2,3,5\",3",
    "0.5,SU,\"KY,6,2,3,7\",3",
    "0.5,SU,\"KY,6,2,4,5\",3",
    "0.5,SU,\"KY,6,2,5,7\",3",
    "0.5,SU,\"KY,6,4,5,7\",3",
    "0.5,SU,\"KY,7,1,2,3,5\",12",
    "0.5,SU,\"KY,7,1,2,5,6\",12",
    "0.5,SU,\"KY,7,1,3,5\",3",
    "0.5,SU,\"KY,7,1,3,6\",3",
    "0.5,SU,\"KY,7,2,3,6\",3",
    "0.5,SU,\"KY,8,1,3,6\",3",
    "0.5,SU,\"KY,8,1,3,7\",3",
    "0.5,SU,\"KY,8,3,5,9\",3",
    "0.5,SU,\"KY,8,4,5,7,9\",12",
    "0.5,SU,\"KY,9,3,5,6\",3",
    "0.5,TR,\"KY,1,2,3\",1",
    "0.5,TR,\"KY,1,2,3,4,5\",6",
    "0.5,TR,\"KY,1,2,3,5,6\",6",
    "0.5,TR,\"KY,1,2,3,6\",3",
    "0.5,TR,\"KY,1,2,4\",1",
    "0.5,TR,\"KY,1,2,4,5\",3",
    "0.5,TR,\"KY,1,2,4,6\",3",
    "0.5,TR,\"KY,1,2,5\",1",
    "0.5,TR,\"KY,1,2,6\",1",
    "0.5,TR,\"KY,1,2,7\",1",
    "0.5,TR,\"KY,1,2,8\",1",
    "0.5,TR,\"KY,1,3,4\",1",
    "0.5,TR,\"KY,1,3,4,8\",3",
    "0.5,TR,\"KY,1,3,5\",1",
    "0.5,TR,\"KY,1,3,6\",1",
    "0.5,TR,\"KY,1,3,8\",1",
    "0.5,TR,\"KY,1,4,5\",1",
    "0.5,TR,\"KY,1,4,6\",1",
    "0.5,TR,\"KY,1,5,6\",1",
    "0.5,TR,\"KY,1,5,7\",1",
    "0.5,TR,\"KY,1,5,9\",1",
    "0.5,TR,\"KY,1,6,7\",1",
    "0.5,TR,\"KY,10,1,2,3,4,5,7,9,11\",28",
    "0.5,TR,\"KY,10,3,4\",1",
    "0.5,TR,\"KY,10,5,7\",1",
    "0.5,TR,\"KY,11,2,7\",1",
    "0.5,TR,\"KY,11,2,9\",1",
    "0.5,TR,\"KY,11,7,9\",1",
    "0.5,TR,\"KY,12,2,6\",1",
    "0.5,TR,\"KY,12,6,10\",1",
    "0.5,TR,\"KY,2,1,3\",1",
    "0.5,TR,\"KY,2,1,3,4,5\",6",
    "0.5,TR,\"KY,2,1,3,4,5,6\",10",
    "0.5,TR,\"KY,2,1,3,5\",3",
    "0.5,TR,\"KY,2,1,4\",1",
    "0.5,TR,\"KY,2,1,4,8\",3",
    "0.5,TR,\"KY,2,1,5\",1",
    "0.5,TR,\"KY,2,1,5,7\",3",
    "0.5,TR,\"KY,2,1,6\",1",
    "0.5,TR,\"KY,2,1,8\",1",
    "0.5,TR,\"KY,2,1,9,10,11\",6",
    "0.5,TR,\"KY,2,3,4,5,7,8\",10",
    "0.5,TR,\"KY,2,3,5\",1",
    "0.5,TR,\"KY,2,3,5,6\",3",
    "0.5,TR,\"KY,2,3,5,8\",3",
    "0.5,TR,\"KY,2,3,6\",1",
    "0.5,TR,\"KY,2,3,6,8\",3",
    "0.5,TR,\"KY,2,4,5\",1",
    "0.5,TR,\"KY,2,5,11\",1",
    "0.5,TR,\"KY,2,5,6\",1",
    "0.5,TR,\"KY,2,5,6,7,9\",6",
    "0.5,TR,\"KY,2,5,8\",1",
    "0.5,TR,\"KY,2,6,8\",1",
    "0.5,TR,\"KY,2,9,11\",1",
    "0.5,TR,\"KY,3,1,2\",1",
    "0.5,TR,\"KY,3,1,2,5\",3",
    "0.5,TR,\"KY,3,1,2,5,6\",6",
    "0.5,TR,\"KY,3,1,2,5,6,7\",10",
    "0.5,TR,\"KY,3,1,5\",1",
    "0.5,TR,\"KY,3,1,5,6\",3",
    "0.5,TR,\"KY,3,1,6\",1",
    "0.5,TR,\"KY,3,2,5\",1",
    "0.5,TR,\"KY,3,2,5,8\",3",
    "0.5,TR,\"KY,3,2,6,8\",3",
    "0.5,TR,\"KY,3,2,7\",1",
    "0.5,TR,\"KY,3,4,5,6\",3",
    "0.5,TR,\"KY,3,4,8\",1",
    "0.5,TR,\"KY,3,5,6\",1",
    "0.5,TR,\"KY,3,5,7,8\",3",
    "0.5,TR,\"KY,3,5,8\",1",
    "0.5,TR,\"KY,3,6,7\",1",
    "0.5,TR,\"KY,3,6,8\",1",
    "0.5,TR,\"KY,4,1,2\",1",
    "0.5,TR,\"KY,4,1,2,3\",3",
    "0.5,TR,\"KY,4,1,2,3,6,8\",10",
    "0.5,TR,\"KY,4,1,2,8,9\",6",
    "0.5,TR,\"KY,4,1,3,5\",3",
    "0.5,TR,\"KY,4,1,5\",1",
    "0.5,TR,\"KY,4,1,5,6\",3",
    "0.5,TR,\"KY,4,1,6\",1",
    "0.5,TR,\"KY,4,1,6,7\",3",
    "0.5,TR,\"KY,4,1,8\",1",
    "0.5,TR,\"KY,4,2,3\",1",
    "0.5,TR,\"KY,4,2,5\",1",
    "0.5,TR,\"KY,4,2,5,6\",3",
    "0.5,TR,\"KY,4,3,6\",1",
    "0.5,TR,\"KY,4,5,6\",1",
    "0.5,TR,\"KY,4,5,7\",1",
    "0.5,TR,\"KY,4,5,7,8\",3",
    "0.5,TR,\"KY,4,6,7\",1",
    "0.5,TR,\"KY,5,1,10\",1",
    "0.5,TR,\"KY,5,1,2\",1",
    "0.5,TR,\"KY,5,1,2,3,6\",6",
    "0.5,TR,\"KY,5,1,2,3,6,9\",10",
    "0.5,TR,\"KY,5,1,2,4,10,11\",10",
    "0.5,TR,\"KY,5,1,3\",1",
    "0.5,TR,\"KY,5,1,3,4\",3",
    "0.5,TR,\"KY,5,1,3,4,7\",6",
    "0.5,TR,\"KY,5,1,3,6\",3",
    "0.5,TR,\"KY,5,1,3,7\",3",
    "0.5,TR,\"KY,5,1,4\",1",
    "0.5,TR,\"KY,5,1,4,6\",3",
    "0.5,TR,\"KY,5,1,6\",1",
    "0.5,TR,\"KY,5,1,6,7\",3",
    "0.5,TR,\"KY,5,1,7\",1",
    "0.5,TR,\"KY,5,1,9\",1",
    "0.5,TR,\"KY,5,2,3\",1",
    "0.5,TR,\"KY,5,2,3,4\",3",
    "0.5,TR,\"KY,5,2,4\",1",
    "0.5,TR,\"KY,5,2,6\",1",
    "0.5,TR,\"KY,5,2,6,7\",3",
    "0.5,TR,\"KY,5,2,7\",1",
    "0.5,TR,\"KY,5,2,8\",1",
    "0.5,TR,\"KY,5,3,4\",1",
    "0.5,TR,\"KY,5,3,4,7\",3",
    "0.5,TR,\"KY,5,3,6\",1",
    "0.5,TR,\"KY,5,3,6,7\",3",
    "0.5,TR,\"KY,5,3,7\",1",
    "0.5,TR,\"KY,5,4,6\",1",
    "0.5,TR,\"KY,5,4,6,7\",3",
    "0.5,TR,\"KY,5,4,7\",1",
    "0.5,TR,\"KY,5,6,12\",1",
    "0.5,TR,\"KY,5,6,7\",1",
    "0.5,TR,\"KY,5,6,9\",1",
    "0.5,TR,\"KY,5,7,8\",1",
    "0.5,TR,\"KY,5,9,10\",1",
    "0.5,TR,\"KY,6,1,2\",1",
    "0.5,TR,\"KY,6,1,2,3,4,5\",10",
    "0.5,TR,\"KY,6,1,2,3,5\",6",
    "0.5,TR,\"KY,6,1,3\",1",
    "0.5,TR,\"KY,6,1,3,5\",3",
    "0.5,TR,\"KY,6,1,4,8\",3",
    "0.5,TR,\"KY,6,1,5\",1",
    "0.5,TR,\"KY,6,2,3,4,8\",6",
    "0.5,TR,\"KY,6,3,4\",1",
    "0.5,TR,\"KY,6,3,5\",1",
    "0.5,TR,\"KY,6,3,5,7\",3",
    "0.5,TR,\"KY,6,3,5,8\",3",
    "0.5,TR,\"KY,6,3,7\",1",
    "0.5,TR,\"KY,6,3,7,8\",3",
    "0.5,TR,\"KY,6,3,8\",1",
    "0.5,TR,\"KY,6,4,5\",1",
    "0.5,TR,\"KY,6,4,7\",1",
    "0.5,TR,\"KY,6,5,7\",1",
    "0.5,TR,\"KY,6,5,7,8\",3",
    "0.5,TR,\"KY,7,1,2,3\",3",
    "0.5,TR,\"KY,7,1,2,3,4,5,9,10,11\",28",
    "0.5,TR,\"KY,7,1,3\",1",
    "0.5,TR,\"KY,7,1,3,8\",3",
    "0.5,TR,\"KY,7,1,4\",1",
    "0.5,TR,\"KY,7,1,4,6\",3",
    "0.5,TR,\"KY,7,1,5\",1",
    "0.5,TR,\"KY,7,2,3,6,9\",6",
    "0.5,TR,\"KY,7,2,5,8\",3",
    "0.5,TR,\"KY,7,3,4\",1",
    "0.5,TR,\"KY,7,3,5\",1",
    "0.5,TR,\"KY,7,4,5\",1",
    "0.5,TR,\"KY,7,4,5,9\",3",
    "0.5,TR,\"KY,7,4,6\",1",
    "0.5,TR,\"KY,7,5,6\",1",
    "0.5,TR,\"KY,8,1,2\",1",
    "0.5,TR,\"KY,8,1,2,3,5,6\",10",
    "0.5,TR,\"KY,8,1,3\",1",
    "0.5,TR,\"KY,8,1,3,5\",3",
    "0.5,TR,\"KY,8,1,4\",1",
    "0.5,TR,\"KY,8,1,4,5\",3",
    "0.5,TR,\"KY,8,1,5\",1",
    "0.5,TR,\"KY,8,1,6\",1",
    "0.5,TR,\"KY,8,4,6\",1",
    "0.5,TR,\"KY,9,1,2,5,6,8\",10",
    "0.5,TR,\"KY,9,1,5\",1",
    "0.5,TR,\"KY,9,1,5,6\",3",
    "0.5,TR,\"KY,9,1,8\",1",
    "0.5,TR,\"KY,9,3,4,5\",3",
    "0.5,TR,\"KY,9,5,6\",1",
    "0.6,SU,\"KY,1,4,5,6\",3.6",
    "0.6,SU,\"KY,2,3,5,7\",3.6",
    "0.6,SU,\"KY,4,2,3,5\",3.6",
    "0.6,SU,\"KY,6,3,4,5\",3.6",
    "0.6,SU,\"KY,7,2,3,5\",3.6",
    "0.6,TR,\"KY,1,2,3,6\",3.6",
    "0.6,TR,\"KY,1,3,4,7\",3.6",
    "0.6,TR,\"KY,2,1,3,6\",3.6",
    "0.6,TR,\"KY,2,1,4,6\",3.6",
    "0.6,TR,\"KY,2,4,6\",1.2",
    "0.6,TR,\"KY,3,1,2,4\",3.6",
    "0.6,TR,\"KY,3,1,4,5\",3.6",
    "0.6,TR,\"KY,3,1,5,7\",3.6",
    "0.6,TR,\"KY,3,2,7,8\",3.6",
    "0.6,TR,\"KY,3,4,5\",1.2",
    "0.6,TR,\"KY,4,1,2,3\",3.6",
    "0.6,TR,\"KY,5,1,4\",1.2",
    "0.6,TR,\"KY,5,3,4,8\",3.6",
    "0.6,TR,\"KY,6,1,2,4\",3.6",
    "0.6,TR,\"KY,7,1,4,8\",3.6",
    "0.8,TR,\"KY,1,3,5\",1.6",
    "0.8,TR,\"KY,2,1,6\",1.6",
    "1,E5,\"KY,6,2,7,8,9\",24",
    "1,EX,\"KY,1,2,3,4,5,6,7\",6",
    "1,EX,\"KY,1,2,3,4,6\",4",
    "1,EX,\"KY,1,2,3,7\",3",
    "1,EX,\"KY,1,2,4,5,6,7,8,10,11\",8",
    "1,EX,\"KY,1,2,5\",2",
    "1,EX,\"KY,1,2,7\",2",
    "1,EX,\"KY,1,3,4\",2",
    "1,EX,\"KY,1,3,8\",2",
    "1,EX,\"KY,1,5,6\",2",
    "1,EX,\"KY,1,5,6,7,14\",4",
    "1,EX,\"KY,10,3,4,8\",3",
    "1,EX,\"KY,11,1,5,10\",3",
    "1,EX,\"KY,12,6,7,8\",3",
    "1,EX,\"KY,2,1,3\",2",
    "1,EX,\"KY,2,1,3,4,5,6,7,8\",7",
    "1,EX,\"KY,2,1,4,5,6\",4",
    "1,EX,\"KY,2,1,5,6\",3",
    "1,EX,\"KY,2,3,4\",2",
    "1,EX,\"KY,2,5,6\",2",
    "1,EX,\"KY,3,1,4,6\",3",
    "1,EX,\"KY,3,2,4,6,8\",4",
    "1,EX,\"KY,3,4,5\",2",
    "1,EX,\"KY,3,5,6\",2",
    "1,EX,\"KY,4,1,3,6\",3",
    "1,EX,\"KY,4,2,3\",2",
    "1,EX,\"KY,4,3,5\",2",
    "1,EX,\"KY,5,1,2\",2",
    "1,EX,\"KY,5,1,2,3\",3",
    "1,EX,\"KY,5,1,2,3,7\",4",
    "1,EX,\"KY,5,1,3\",2",
    "1,EX,\"KY,5,2,3,9\",3",
    "1,EX,\"KY,5,3,4,6,7\",4",
    "1,EX,\"KY,5,3,6\",2",
    "1,EX,\"KY,5,3,7\",2",
    "1,EX,\"KY,6,1,2,4,5\",4",
    "1,EX,\"KY,6,3,5,7\",3",
    "1,EX,\"KY,7,1,2,3,4,5,6,8,9,10,11,12,13,14,15,16\",15",
    "1,EX,\"KY,7,11\",1",
    "1,EX,\"KY,7,2,3,4\",3",
    "1,EX,\"KY,7,2,4,6\",3",
    "1,EX,\"KY,7,2,6\",2",
    "1,EX,\"KY,7,3,5\",2",
    "1,EX,\"KY,8,2,3,6\",3",
    "1,EX,\"KY,9,1,2,5,6\",4",
    "1,EX,\"KY,9,3,6\",2",
    "1,SU,\"KY,1,2,3,4\",6",
    "1,SU,\"KY,1,2,3,5\",6",
    "1,SU,\"KY,1,2,4,5\",6",
    "1,SU,\"KY,1,2,5,6\",6",
    "1,SU,\"KY,1,4,5,6\",6",
    "1,SU,\"KY,10,3,5,9\",6",
    "1,SU,\"KY,10,6,7,8,12\",24",
    "1,SU,\"KY,2,1,5,6,8\",24",
    "1,SU,\"KY,2,4,6,9\",6",
    "1,SU,\"KY,3,2,5,7\",6",
    "1,SU,\"KY,4,1,2,3\",6",
    "1,SU,\"KY,4,1,3,5\",6",
    "1,SU,\"KY,4,1,5,7\",6",
    "1,SU,\"KY,4,2,5,6\",6",
    "1,SU,\"KY,5,1,2,4\",6",
    "1,SU,\"KY,5,1,4,6\",6",
    "1,SU,\"KY,6,1,3,4\",6",
    "1,SU,\"KY,6,2,3,4\",6",
    "1,SU,\"KY,6,2,4,5\",6",
    "1,SU,\"KY,7,1,2,4\",6",
    "1,SU,\"KY,8,1,2,4\",6",
    "1,SU,\"KY,9,5,7,8\",6",
    "1,TR,\"KY,1,2,3\",2",
    "1,TR,\"KY,1,2,3,4\",6",
    "1,TR,\"KY,1,2,3,4,5\",12",
    "1,TR,\"KY,1,2,3,4,6\",12",
    "1,TR,\"KY,1,2,3,4,6,8\",20",
    "1,TR,\"KY,1,2,3,5\",6",
    "1,TR,\"KY,1,2,3,5,6\",12",
    "1,TR,\"KY,1,2,3,5,7,8\",20",
    "1,TR,\"KY,1,2,3,7\",6",
    "1,TR,\"KY,1,2,4\",2",
    "1,TR,\"KY,1,2,4,5\",6",
    "1,TR,\"KY,1,2,6\",2",
    "1,TR,\"KY,1,2,7\",2",
    "1,TR,\"KY,1,3,4\",2",
    "1,TR,\"KY,1,3,4,5\",6",
    "1,TR,\"KY,1,3,4,6\",6",
    "1,TR,\"KY,1,3,5\",2",
    "1,TR,\"KY,1,3,5,7\",6",
    "1,TR,\"KY,1,3,6\",2",
    "1,TR,\"KY,1,4,5\",2",
    "1,TR,\"KY,1,4,5,6\",6",
    "1,TR,\"KY,1,4,5,7\",6",
    "1,TR,\"KY,1,4,6\",2",
    "1,TR,\"KY,1,4,7\",2",
    "1,TR,\"KY,1,5,6\",2",
    "1,TR,\"KY,1,5,7\",2",
    "1,TR,\"KY,1,5,7,11,12\",12",
    "1,TR,\"KY,1,5,8\",2",
    "1,TR,\"KY,1,6,7\",2",
    "1,TR,\"KY,1,7,8\",2",
    "1,TR,\"KY,10,2,8\",2",
    "1,TR,\"KY,10,3,8\",2",
    "1,TR,\"KY,10,5,12\",2",
    "1,TR,\"KY,10,5,6\",2",
    "1,TR,\"KY,10,6,7,8,12\",12",
    "1,TR,\"KY,11,1,2,9,10\",12",
    "1,TR,\"KY,11,10,15\",2",
    "1,TR,\"KY,11,2,8\",2",
    "1,TR,\"KY,11,3,4\",2",
    "1,TR,\"KY,11,6,12\",2",
    "1,TR,\"KY,12,2,9,13\",6",
    "1,TR,\"KY,12,6,8\",2",
    "1,TR,\"KY,13,2,12\",2",
    "1,TR,\"KY,14,7,10\",2",
    "1,TR,\"KY,2,1,3\",2",
    "1,TR,\"KY,2,1,3,4\",6",
    "1,TR,\"KY,2,1,3,6\",6",
    "1,TR,\"KY,2,1,4\",2",
    "1,TR,\"KY,2,1,5\",2",
    "1,TR,\"KY,2,1,5,6,8\",12",
    "1,TR,\"KY,2,1,6\",2",
    "1,TR,\"KY,2,1,7\",2",
    "1,TR,\"KY,2,3,4\",2",
    "1,TR,\"KY,2,3,4,5,6\",12",
    "1,TR,\"KY,2,3,4,7\",6",
    "1,TR,\"KY,2,3,5\",2",
    "1,TR,\"KY,2,3,7\",2",
    "1,TR,\"KY,2,3,8\",2",
    "1,TR,\"KY,2,3,9\",2",
    "1,TR,\"KY,2,4,5\",2",
    "1,TR,\"KY,2,4,5,9\",6",
    "1,TR,\"KY,2,4,6\",2",
    "1,TR,\"KY,2,4,8\",2",
    "1,TR,\"KY,2,4,9\",2",
    "1,TR,\"KY,2,4,9,12\",6",
    "1,TR,\"KY,2,5,10\",2",
    "1,TR,\"KY,2,5,6\",2",
    "1,TR,\"KY,2,6,10\",2",
    "1,TR,\"KY,2,6,7\",2",
    "1,TR,\"KY,2,6,7,15\",6",
    "1,TR,\"KY,2,7,10\",2",
    "1,TR,\"KY,2,7,9\",2",
    "1,TR,\"KY,3,1,2\",2",
    "1,TR,\"KY,3,1,2,4\",6",
    "1,TR,\"KY,3,1,2,5\",6",
    "1,TR,\"KY,3,1,2,7\",6",
    "1,TR,\"KY,3,1,4\",2",
    "1,TR,\"KY,3,1,4,7\",6",
    "1,TR,\"KY,3,1,5\",2",
    "1,TR,\"KY,3,1,5,6\",6",
    "1,TR,\"KY,3,1,6\",2",
    "1,TR,\"KY,3,1,6,7\",6",
    "1,TR,\"KY,3,1,8\",2",
    "1,TR,\"KY,3,2,4\",2",
    "1,TR,\"KY,3,2,4,5\",6",
    "1,TR,\"KY,3,2,4,8,9\",12",
    "1,TR,\"KY,3,2,5\",2",
    "1,TR,\"KY,3,2,5,6\",6",
    "1,TR,\"KY,3,2,5,7\",6",
    "1,TR,\"KY,3,2,6\",2",
    "1,TR,\"KY,3,2,7\",2",
    "1,TR,\"KY,3,2,9\",2",
    "1,TR,\"KY,3,4,5\",2",
    "1,TR,\"KY,3,4,5,7\",6",
    "1,TR,\"KY,3,4,6\",2",
    "1,TR,\"KY,3,4,7\",2",
    "1,TR,\"KY,3,4,8\",2",
    "1,TR,\"KY,3,5,10\",2",
    "1,TR,\"KY,3,5,6\",2",
    "1,TR,\"KY,3,5,6,7\",6",
    "1,TR,\"KY,3,5,7\",2",
    "1,TR,\"KY,3,5,8\",2",
    "1,TR,\"KY,3,6,7\",2",
    "1,TR,\"KY,3,6,7,8,9\",12",
    "1,TR,\"KY,3,6,8,13\",6",
    "1,TR,\"KY,3,6,9\",2",
    "1,TR,\"KY,4,1,2\",2",
    "1,TR,\"KY,4,1,2,3\",6",
    "1,TR,\"KY,4,1,2,3,5\",12",
    "1,TR,\"KY,4,1,2,3,6\",12",
    "1,TR,\"KY,4,1,2,7\",6",
    "1,TR,\"KY,4,1,3\",2",
    "1,TR,\"KY,4,1,3,6\",6",
    "1,TR,\"KY,4,1,3,7\",6",
    "1,TR,\"KY,4,1,3,9\",6",
    "1,TR,\"KY,4,1,5\",2",
    "1,TR,\"KY,4,1,5,7\",6",
    "1,TR,\"KY,4,1,6\",2",
    "1,TR,\"KY,4,1,7\",2",
    "1,TR,\"KY,4,12,15,16\",6",
    "1,TR,\"KY,4,2,3\",2",
    "1,TR,\"KY,4,2,3,5\",6",
    "1,TR,\"KY,4,2,5\",2",
    "1,TR,\"KY,4,2,6\",2",
    "1,TR,\"KY,4,2,6,8\",6",
    "1,TR,\"KY,4,2,7\",2",
    "1,TR,\"KY,4,2,7,9,10\",12",
    "1,TR,\"KY,4,2,9\",2",
    "1,TR,\"KY,4,3,5\",2",
    "1,TR,\"KY,4,3,6\",2",
    "1,TR,\"KY,4,3,7\",2",
    "1,TR,\"KY,4,3,8\",2",
    "1,TR,\"KY,4,5,6\",2",
    "1,TR,\"KY,4,5,6,7\",6",
    "1,TR,\"KY,4,5,7\",2",
    "1,TR,\"KY,4,6,7\",2",
    "1,TR,\"KY,4,6,7,8\",6",
    "1,TR,\"KY,4,7,11\",2",
    "1,TR,\"KY,5,1,2\",2",
    "1,TR,\"KY,5,1,2,3,4,6\",20",
    "1,TR,\"KY,5,1,2,3,6\",12",
    "1,TR,\"KY,5,1,2,4\",6",
    "1,TR,\"KY,5,1,2,4,6\",12",
    "1,TR,\"KY,5,1,2,6\",6",
    "1,TR,\"KY,5,1,2,7\",6",
    "1,TR,\"KY,5,1,2,7,9\",12",
    "1,TR,\"KY,5,1,3\",2",
    "1,TR,\"KY,5,1,3,7\",6",
    "1,TR,\"KY,5,1,4\",2",
    "1,TR,\"KY,5,1,4,6\",6",
    "1,TR,\"KY,5,1,4,8\",6",
    "1,TR,\"KY,5,1,7\",2",
    "1,TR,\"KY,5,1,9\",2",
    "1,TR,\"KY,5,1,9,14\",6",
    "1,TR,\"KY,5,2,3\",2",
    "1,TR,\"KY,5,2,3,4\",6",
    "1,TR,\"KY,5,2,3,6\",6",
    "1,TR,\"KY,5,2,3,7,8\",12",
    "1,TR,\"KY,5,2,4\",2",
    "1,TR,\"KY,5,2,4,6\",6",
    "1,TR,\"KY,5,2,4,7\",6",
    "1,TR,\"KY,5,2,6\",2",
    "1,TR,\"KY,5,2,9\",2",
    "1,TR,\"KY,5,3,10\",2",
    "1,TR,\"KY,5,3,4\",2",
    "1,TR,\"KY,5,3,4,6\",6",
    "1,TR,\"KY,5,3,6\",2",
    "1,TR,\"KY,5,3,6,9\",6",
    "1,TR,\"KY,5,3,7\",2",
    "1,TR,\"KY,5,3,8\",2",
    "1,TR,\"KY,5,4,6\",2",
    "1,TR,\"KY,5,4,7\",2",
    "1,TR,\"KY,5,4,8\",2",
    "1,TR,\"KY,5,6,7\",2",
    "1,TR,\"KY,5,6,8\",2",
    "1,TR,\"KY,5,7,12\",2",
    "1,TR,\"KY,5,7,8\",2",
    "1,TR,\"KY,6,1,10\",2",
    "1,TR,\"KY,6,1,2\",2",
    "1,TR,\"KY,6,1,2,3\",6",
    "1,TR,\"KY,6,1,2,4\",6",
    "1,TR,\"KY,6,1,3\",2",
    "1,TR,\"KY,6,1,3,4\",6",
    "1,TR,\"KY,6,1,3,7\",6",
    "1,TR,\"KY,6,1,4\",2",
    "1,TR,\"KY,6,1,4,7\",6",
    "1,TR,\"KY,6,1,5\",2",
    "1,TR,\"KY,6,1,7\",2",
    "1,TR,\"KY,6,10,11\",2",
    "1,TR,\"KY,6,2,3\",2",
    "1,TR,\"KY,6,2,3,4\",6",
    "1,TR,\"KY,6,2,3,5\",6",
    "1,TR,\"KY,6,2,4\",2",
    "1,TR,\"KY,6,2,5\",2",
    "1,TR,\"KY,6,2,7\",2",
    "1,TR,\"KY,6,2,8\",2",
    "1,TR,\"KY,6,2,8,9,10\",12",
    "1,TR,\"KY,6,3,4\",2",
    "1,TR,\"KY,6,3,4,5\",6",
    "1,TR,\"KY,6,3,5\",2",
    "1,TR,\"KY,6,4,5\",2",
    "1,TR,\"KY,6,4,5,8\",6",
    "1,TR,\"KY,6,4,7\",2",
    "1,TR,\"KY,6,4,7,9\",6",
    "1,TR,\"KY,6,5,7\",2",
    "1,TR,\"KY,6,5,9\",2",
    "1,TR,\"KY,6,7,10\",2",
    "1,TR,\"KY,6,7,8\",2",
    "1,TR,\"KY,6,7,9\",2",
    "1,TR,\"KY,6,8,10\",2",
    "1,TR,\"KY,7,1,2\",2",
    "1,TR,\"KY,7,1,2,3,4,5,6\",30",
    "1,TR,\"KY,7,1,2,5\",6",
    "1,TR,\"KY,7,1,3\",2",
    "1,TR,\"KY,7,1,3,5,6\",12",
    "1,TR,\"KY,7,1,4\",2",
    "1,TR,\"KY,7,1,4,8,9\",12",
    "1,TR,\"KY,7,1,6\",2",
    "1,TR,\"KY,7,1,8\",2",
    "1,TR,\"KY,7,2,3,8,11\",12",
    "1,TR,\"KY,7,2,5\",2",
    "1,TR,\"KY,7,2,6\",2",
    "1,TR,\"KY,7,3,4\",2",
    "1,TR,\"KY,7,3,5\",2",
    "1,TR,\"KY,7,3,6\",2",
    "1,TR,\"KY,7,4,5\",2",
    "1,TR,\"KY,7,4,6\",2",
    "1,TR,\"KY,7,4,6,11\",6",
    "1,TR,\"KY,7,5,6\",2",
    "1,TR,\"KY,7,5,8\",2",
    "1,TR,\"KY,7,6,8\",2",
    "1,TR,\"KY,7,8,9\",2",
    "1,TR,\"KY,8,1,2\",2",
    "1,TR,\"KY,8,1,3\",2",
    "1,TR,\"KY,8,1,3,4,6\",12",
    "1,TR,\"KY,8,1,3,7\",6",
    "1,TR,\"KY,8,1,5\",2",
    "1,TR,\"KY,8,1,7\",2",
    "1,TR,\"KY,8,10,12\",2",
    "1,TR,\"KY,8,2,11\",2",
    "1,TR,\"KY,8,2,4\",2",
    "1,TR,\"KY,8,2,7\",2",
    "1,TR,\"KY,8,2,9\",2",
    "1,TR,\"KY,8,3,5\",2",
    "1,TR,\"KY,8,3,6\",2",
    "1,TR,\"KY,8,3,7\",2",
    "1,TR,\"KY,8,4,6\",2",
    "1,TR,\"KY,8,4,7\",2",
    "1,TR,\"KY,8,4,7,12\",6",
    "1,TR,\"KY,8,5,10\",2",
    "1,TR,\"KY,8,5,6\",2",
    "1,TR,\"KY,8,9,10\",2",
    "1,TR,\"KY,9,1,2\",2",
    "1,TR,\"KY,9,1,2,3,5,10\",20",
    "1,TR,\"KY,9,2,3\",2",
    "1,TR,\"KY,9,2,4,7\",6",
    "1,TR,\"KY,9,2,6\",2",
    "1,TR,\"KY,9,2,7\",2",
    "1,TR,\"KY,9,4,5,6\",6",
    "1,TR,\"KY,9,5,6\",2",
    "1,TR,\"KY,9,5,8\",2",
    "1,TR,\"KY,9,6,7,8\",6",
    "10,TR,\"KY,1,3,4\",20",
    "15,TR,\"KY,1,3,6\",30",
    "15,TR,\"KY,1,4,5\",30",
    "15,TR,\"KY,3,1,6\",30",
    "2,EX,\"KY,1,2,3\",4",
    "2,EX,\"KY,11,1,2,7,9,10\",10",
    "2,EX,\"KY,2,4,7,10,11\",8",
    "2,EX,\"KY,2,5,6\",4",
    "2,EX,\"KY,2,5,9\",4",
    "2,EX,\"KY,3,1\",2",
    "2,EX,\"KY,3,4,6\",4",
    "2,EX,\"KY,5,2,6\",4",
    "2,EX,\"KY,5,2,9\",4",
    "2,EX,\"KY,6,1,2,7\",6",
    "2,EX,\"KY,6,1,5\",4",
    "2,EX,\"KY,6,7,8,9\",6",
    "2,SU,\"KY,1,3,4,6\",12",
    "2,SU,\"KY,2,1,4,5\",12",
    "2,SU,\"KY,4,1,2,5\",12",
    "2,SU,\"KY,6,3,8,9\",12",
    "2,TR,\"KY,1,2,3\",4",
    "2,TR,\"KY,1,2,3,5\",12",
    "2,TR,\"KY,1,3,7\",4",
    "2,TR,\"KY,1,4,5\",4",
    "2,TR,\"KY,1,4,7\",4",
    "2,TR,\"KY,1,4,8\",4",
    "2,TR,\"KY,1,5,7\",4",
    "2,TR,\"KY,1,6,7\",4",
    "2,TR,\"KY,2,1,3\",4",
    "2,TR,\"KY,2,1,4\",4",
    "2,TR,\"KY,2,1,4,6\",12",
    "2,TR,\"KY,2,1,4,8\",12",
    "2,TR,\"KY,2,1,5\",4",
    "2,TR,\"KY,2,4,6\",4",
    "2,TR,\"KY,2,4,7\",4",
    "2,TR,\"KY,2,5,6\",4",
    "2,TR,\"KY,3,1,5\",4",
    "2,TR,\"KY,3,1,6\",4",
    "2,TR,\"KY,3,1,7\",4",
    "2,TR,\"KY,3,4,5\",4",
    "2,TR,\"KY,3,4,6\",4",
    "2,TR,\"KY,3,5,6\",4",
    "2,TR,\"KY,3,6,7\",4",
    "2,TR,\"KY,4,1,2\",4",
    "2,TR,\"KY,4,1,2,3,6\",24",
    "2,TR,\"KY,4,1,3\",4",
    "2,TR,\"KY,4,1,3,5\",12",
    "2,TR,\"KY,4,1,3,6\",12",
    "2,TR,\"KY,5,1,2\",4",
    "2,TR,\"KY,5,1,2,3\",12",
    "2,TR,\"KY,5,1,3\",4",
    "2,TR,\"KY,5,1,4\",4",
    "2,TR,\"KY,5,3,10\",4",
    "2,TR,\"KY,5,3,6\",4",
    "2,TR,\"KY,5,3,7\",4",
    "2,TR,\"KY,5,6,7\",4",
    "2,TR,\"KY,5,7,9\",4",
    "2,TR,\"KY,6,1,2\",4",
    "2,TR,\"KY,6,1,3\",4",
    "2,TR,\"KY,6,1,3,7\",12",
    "2,TR,\"KY,6,2,4\",4",
    "2,TR,\"KY,6,3,5\",4",
    "2,TR,\"KY,6,4,5\",4",
    "2,TR,\"KY,6,5,7\",4",
    "2,TR,\"KY,6,8,9\",4",
    "2,TR,\"KY,7,1,2\",4",
    "2,TR,\"KY,7,1,2,11\",12",
    "2,TR,\"KY,7,2,4\",4",
    "2,TR,\"KY,7,2,5,8\",12",
    "2,TR,\"KY,7,3,6\",4",
    "2,TR,\"KY,7,4,5\",4",
    "2,TR,\"KY,7,5,8\",4",
    "2,TR,\"KY,8,1,2\",4",
    "2,TR,\"KY,8,1,7\",4",
    "2,TR,\"KY,9,4,5,6,8\",24",
    "3,EX,\"KY,1,7\",3",
    "3,EX,\"KY,3,1,2,4,5,6,7\",18",
    "3,EX,\"KY,3,1,2,7\",9",
    "3,EX,\"KY,6,2,3,5\",9",
    "3,EX,\"KY,7,5,8\",6",
    "3,TR,\"KY,1,2,3,4\",18",
    "3,TR,\"KY,1,2,5,9,10\",36",
    "3,TR,\"KY,1,3,4,5\",18",
    "3,TR,\"KY,1,3,6\",6",
    "3,TR,\"KY,10,5,6,12\",18",
    "3,TR,\"KY,2,1,3,5\",18",
    "3,TR,\"KY,3,1,2\",6",
    "3,TR,\"KY,3,4,5,6\",18",
    "3,TR,\"KY,4,2,5\",6",
    "3,TR,\"KY,5,2,6,7\",18",
    "3,TR,\"KY,6,1,3,4\",18",
    "3,TR,\"KY,6,2,5\",6",
    "3,TR,\"KY,6,3,4\",6",
    "3,TR,\"KY,8,1,4\",6",
    "4,EX,\"KY,1,2,3,5,7\",16",
    "4,EX,\"KY,6,1,7\",8",
    "4,SU,\"KY,3,1,6,7\",24",
    "4,TR,\"KY,2,1,9,11\",24",
    "4,TR,\"KY,2,4,6\",8",
    "4,TR,\"KY,4,1,2,5,8\",48",
    "4,TR,\"KY,4,1,3\",8",
    "4,TR,\"KY,5,2,4,6\",24",
    "5,EX,\"KY,4,1,2\",10",
    "5,TR,\"KY,1,3,4\",10",
    "5,TR,\"KY,2,1,9,10\",30",
    "5,TR,\"KY,2,4,6\",10",
    "5,TR,\"KY,4,1,6\",10",
    "5,TR,\"KY,5,1,2,4\",30",
    "5,TR,\"KY,5,3,7\",10",
    "5,TR,\"KY,6,5,7\",10",
    "7,TR,\"KY,4,3,6\",14",
    "8,TR,\"KY,4,3,6\",16"
)
