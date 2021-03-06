package com.twinspires.wagerutils.testUtils

/**
 * A list of wager data suitable for testing QUINELLA wagers.
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
val quinellaWagers = listOf(
    "1,QU,\"1,10,12,WT,1,10,12\",3",
    "1,QU,\"1,10,WT,1,10\",1",
    "1,QU,\"1,10,WT,1,3,7,10\",5",
    "1,QU,\"1,10,WT,2,3,8\",6",
    "1,QU,\"1,11,WT,1,3,7,11\",5",
    "1,QU,\"1,11,WT,1,4,6,8,11,12\",9",
    "1,QU,\"1,11,WT,4,9,11\",5",
    "1,QU,\"1,11,WT,7\",2",
    "1,QU,\"1,12,WT,1,12\",1",
    "1,QU,\"1,12,WT,1,4,13,17\",7",
    "1,QU,\"1,2,3,6,8,11,12,14,WT,1,2\",13",
    "1,QU,\"1,2,3,7,8,9,10,11,12,13,15,WT,7\",10",
    "1,QU,\"1,2,4,7,8,11,WT,1,2,4,7,8,11\",15",
    "1,QU,\"1,2,5,11,14,WT,8\",5",
    "1,QU,\"1,2,7,8,9,WT,1,2,7,8,9\",10",
    "1,QU,\"1,2,7,WT,3,9,10\",9",
    "1,QU,\"1,2,WT,1,2,7,8,10,11\",9",
    "1,QU,\"1,2,WT,1,4,5,7,10,14\",11",
    "1,QU,\"1,2,WT,2,3,4,5,7,10,11,12\",15",
    "1,QU,\"1,3,11,WT,3,6,10,11,16,17\",15",
    "1,QU,\"1,3,12,13,14,WT,1,3,12,13,14\",10",
    "1,QU,\"1,3,8,12,14,WT,2\",5",
    "1,QU,\"1,3,WT,6\",2",
    "1,QU,\"1,4,11,13,14,WT,1,3,4,11,13,14\",15",
    "1,QU,\"1,4,WT,1,2,4,6\",5",
    "1,QU,\"1,5,10,14,WT,6,11\",8",
    "1,QU,\"1,5,12,WT,3,7\",6",
    "1,QU,\"1,5,WT,4,7,10\",6",
    "1,QU,\"1,6,8,WT,3,6\",5",
    "1,QU,\"1,6,WT,3\",2",
    "1,QU,\"1,7,WT,1,7,8\",3",
    "1,QU,\"1,8,9,WT,1,8,9\",3",
    "1,QU,\"1,8,WT,3,4,8,12\",7",
    "1,QU,\"1,WT,1,2,3,4,5,6,7,8,9,10,11,12\",11",
    "1,QU,\"1,WT,1,3,4,5,6,7,8,9,10,11,16,17\",11",
    "1,QU,\"1,WT,10\",1",
    "1,QU,\"1,WT,12\",1",
    "1,QU,\"1,WT,14\",1",
    "1,QU,\"1,WT,2\",1",
    "1,QU,\"1,WT,2,12\",2",
    "1,QU,\"1,WT,2,3,4,5,6,7,8\",7",
    "1,QU,\"1,WT,2,3,4,6,13\",5",
    "1,QU,\"1,WT,2,4,5\",3",
    "1,QU,\"1,WT,2,4,5,7,8,10,16\",7",
    "1,QU,\"1,WT,2,7\",2",
    "1,QU,\"1,WT,2,7,10\",3",
    "1,QU,\"1,WT,2,8\",2",
    "1,QU,\"1,WT,3\",1",
    "1,QU,\"1,WT,3,4,5\",3",
    "1,QU,\"1,WT,3,4,5,8,9\",5",
    "1,QU,\"1,WT,3,9,13,14\",4",
    "1,QU,\"1,WT,4\",1",
    "1,QU,\"1,WT,4,13\",2",
    "1,QU,\"1,WT,4,7,9,10,11\",5",
    "1,QU,\"1,WT,5,12\",2",
    "1,QU,\"1,WT,5,6,7,14\",4",
    "1,QU,\"1,WT,5,7\",2",
    "1,QU,\"1,WT,7\",1",
    "1,QU,\"1,WT,7,10\",2",
    "1,QU,\"1,WT,7,8,9,10\",4",
    "1,QU,\"1,WT,8\",1",
    "1,QU,\"1,WT,8,10\",2",
    "1,QU,\"1,WT,8,10,11\",3",
    "1,QU,\"10,11,WT,4,5,6\",6",
    "1,QU,\"10,12,WT,4,6,10,12,16\",7",
    "1,QU,\"10,14,WT,1,3,10,14\",5",
    "1,QU,\"10,15,WT,7\",2",
    "1,QU,\"10,WT,1,13\",2",
    "1,QU,\"10,WT,1,2,3,4,5,6,7,8,10,12,13,16\",11",
    "1,QU,\"10,WT,1,6,8\",3",
    "1,QU,\"10,WT,12,13\",2",
    "1,QU,\"10,WT,13\",1",
    "1,QU,\"10,WT,13,14,15\",3",
    "1,QU,\"10,WT,2\",1",
    "1,QU,\"10,WT,2,3,7,8\",4",
    "1,QU,\"10,WT,2,4,5,6,7,8,12,13,16\",9",
    "1,QU,\"10,WT,2,5,13\",3",
    "1,QU,\"10,WT,2,5,6\",3",
    "1,QU,\"10,WT,2,7\",2",
    "1,QU,\"10,WT,3,5\",2",
    "1,QU,\"10,WT,3,5,7,11,12\",5",
    "1,QU,\"10,WT,3,7\",2",
    "1,QU,\"10,WT,3,8\",2",
    "1,QU,\"10,WT,4,5,6,11,14\",5",
    "1,QU,\"10,WT,4,6,7,8,9,14,18\",7",
    "1,QU,\"10,WT,5,6,8\",3",
    "1,QU,\"10,WT,6\",1",
    "1,QU,\"10,WT,6,12\",2",
    "1,QU,\"10,WT,7,12\",2",
    "1,QU,\"10,WT,7,15\",2",
    "1,QU,\"10,WT,8\",1",
    "1,QU,\"11,14,WT,11,14\",1",
    "1,QU,\"11,14,WT,2,3,8\",6",
    "1,QU,\"11,14,WT,2,5,8\",6",
    "1,QU,\"11,WT,1\",1",
    "1,QU,\"11,WT,1,2\",2",
    "1,QU,\"11,WT,1,2,4,5,6,7,8,10,11,12,13,14\",11",
    "1,QU,\"11,WT,1,2,4,5,8,10\",6",
    "1,QU,\"11,WT,12,13,14\",3",
    "1,QU,\"11,WT,2,3\",2",
    "1,QU,\"11,WT,2,3,5,7,8,9,12,13\",8",
    "1,QU,\"11,WT,2,7\",2",
    "1,QU,\"11,WT,3,7\",2",
    "1,QU,\"11,WT,7\",1",
    "1,QU,\"11,WT,7,8\",2",
    "1,QU,\"12,13,WT,1,5,8\",6",
    "1,QU,\"12,15,WT,4,10,11\",6",
    "1,QU,\"12,WT,1\",1",
    "1,QU,\"12,WT,1,2,4,5,6,7,8,9,10,12,14,16\",11",
    "1,QU,\"12,WT,1,2,6,13\",4",
    "1,QU,\"12,WT,1,3,4,5,6,7,8,9,10,11,12,13\",11",
    "1,QU,\"12,WT,1,4\",2",
    "1,QU,\"12,WT,1,4,6,9\",4",
    "1,QU,\"12,WT,1,6,8,10\",4",
    "1,QU,\"12,WT,10\",1",
    "1,QU,\"12,WT,14,15,16\",3",
    "1,QU,\"12,WT,2,8,10\",3",
    "1,QU,\"12,WT,4\",1",
    "1,QU,\"12,WT,5,7,9,10,11\",5",
    "1,QU,\"12,WT,6,7\",2",
    "1,QU,\"12,WT,6,7,10\",3",
    "1,QU,\"12,WT,9\",1",
    "1,QU,\"13,WT,1,2,3,4,5,6,7,8,9,11,12,13\",11",
    "1,QU,\"13,WT,1,2,3,4,5,6,7,9,10,11,12,13\",11",
    "1,QU,\"13,WT,1,4\",2",
    "1,QU,\"13,WT,6\",1",
    "1,QU,\"13,WT,8,9,10,14,15\",5",
    "1,QU,\"14,WT,1,2,3,4,5,6,7,9,10,13,14\",10",
    "1,QU,\"14,WT,5\",1",
    "1,QU,\"14,WT,8,11\",2",
    "1,QU,\"16,WT,4\",1",
    "1,QU,\"2,10,WT,1\",2",
    "1,QU,\"2,10,WT,1,7,11\",6",
    "1,QU,\"2,10,WT,2,10\",1",
    "1,QU,\"2,11,12,WT,2,11,12\",3",
    "1,QU,\"2,3,7,WT,2,3,7\",3",
    "1,QU,\"2,4,WT,3,5,12,16\",8",
    "1,QU,\"2,4,WT,6,8,10\",6",
    "1,QU,\"2,5,14,WT,2,5,14\",3",
    "1,QU,\"2,5,WT,2,4,8,12,16\",9",
    "1,QU,\"2,5,WT,4,9,10\",6",
    "1,QU,\"2,7,13,WT,5,10,14\",9",
    "1,QU,\"2,7,8,WT,1,8,10\",8",
    "1,QU,\"2,7,WT,1\",2",
    "1,QU,\"2,7,WT,3,4,7,10,14\",9",
    "1,QU,\"2,WT,1,3,6,7,8\",5",
    "1,QU,\"2,WT,1,3,8,12\",4",
    "1,QU,\"2,WT,1,4\",2",
    "1,QU,\"2,WT,1,4,7,10\",4",
    "1,QU,\"2,WT,1,5,8,11,14\",5",
    "1,QU,\"2,WT,1,6\",2",
    "1,QU,\"2,WT,1,8\",2",
    "1,QU,\"2,WT,10\",1",
    "1,QU,\"2,WT,11,12\",2",
    "1,QU,\"2,WT,13\",1",
    "1,QU,\"2,WT,3,10,12\",3",
    "1,QU,\"2,WT,3,11\",2",
    "1,QU,\"2,WT,3,6,7\",3",
    "1,QU,\"2,WT,4\",1",
    "1,QU,\"2,WT,4,5\",2",
    "1,QU,\"2,WT,4,5,6,13\",4",
    "1,QU,\"2,WT,4,7,10\",3",
    "1,QU,\"2,WT,5\",1",
    "1,QU,\"2,WT,5,6\",2",
    "1,QU,\"2,WT,5,7\",2",
    "1,QU,\"2,WT,6\",1",
    "1,QU,\"2,WT,6,8\",2",
    "1,QU,\"2,WT,7,10\",2",
    "1,QU,\"2,WT,7,8\",2",
    "1,QU,\"3,10,WT,6,11,12\",6",
    "1,QU,\"3,11,WT,2,3,4,7,8,10,11,12,14,17\",17",
    "1,QU,\"3,11,WT,3,11\",1",
    "1,QU,\"3,4,5,WT,3,4,5\",3",
    "1,QU,\"3,4,7,9,WT,6\",4",
    "1,QU,\"3,6,WT,3,5,10,11,12,13\",11",
    "1,QU,\"3,7,11,12,WT,3,7,11,12\",6",
    "1,QU,\"3,7,WT,3,7,9,12,20\",7",
    "1,QU,\"3,8,9,WT,2,7,11\",9",
    "1,QU,\"3,WT,1\",1",
    "1,QU,\"3,WT,1,2,8,11,12,13\",6",
    "1,QU,\"3,WT,10,11\",2",
    "1,QU,\"3,WT,12,15\",2",
    "1,QU,\"3,WT,14\",1",
    "1,QU,\"3,WT,14,17,18\",3",
    "1,QU,\"3,WT,2\",1",
    "1,QU,\"3,WT,4,10\",2",
    "1,QU,\"3,WT,4,10,12\",3",
    "1,QU,\"3,WT,4,9\",2",
    "1,QU,\"3,WT,5,14\",2",
    "1,QU,\"3,WT,6\",1",
    "1,QU,\"3,WT,6,7,8,14\",4",
    "1,QU,\"3,WT,9,12\",2",
    "1,QU,\"4,10,WT,5\",2",
    "1,QU,\"4,5,WT,2,4,5,12\",5",
    "1,QU,\"4,6,7,WT,2,3,5,6,7,9,10,12\",21",
    "1,QU,\"4,6,WT,13,15,16\",6",
    "1,QU,\"4,7,10,WT,4,7,10\",3",
    "1,QU,\"4,8,13,WT,2,10\",6",
    "1,QU,\"4,8,9,WT,4,8,9\",3",
    "1,QU,\"4,WT,1,2,3,4,5,6,7,8,9,10\",9",
    "1,QU,\"4,WT,1,9\",2",
    "1,QU,\"4,WT,10\",1",
    "1,QU,\"4,WT,11\",1",
    "1,QU,\"4,WT,2\",1",
    "1,QU,\"4,WT,2,4,5,7,13,15,17,18\",7",
    "1,QU,\"4,WT,2,6,7,8,16\",5",
    "1,QU,\"4,WT,3,6,7\",3",
    "1,QU,\"4,WT,5\",1",
    "1,QU,\"4,WT,6\",1",
    "1,QU,\"4,WT,6,7\",2",
    "1,QU,\"4,WT,7\",1",
    "1,QU,\"4,WT,7,12\",2",
    "1,QU,\"4,WT,7,8\",2",
    "1,QU,\"4,WT,7,9\",2",
    "1,QU,\"4,WT,9,12\",2",
    "1,QU,\"5,10,WT,1,3,5,6,7,9\",11",
    "1,QU,\"5,6,10,13,WT,5,12\",7",
    "1,QU,\"5,7,WT,1,2,3,4,6,7,8\",13",
    "1,QU,\"5,7,WT,4,5,7,8\",5",
    "1,QU,\"5,7,WT,9,11,13\",6",
    "1,QU,\"5,8,9,WT,5,8,9\",3",
    "1,QU,\"5,WT,1,2,3,4,5,6,7,8,9,10,11,12\",11",
    "1,QU,\"5,WT,10\",1",
    "1,QU,\"5,WT,10,12\",2",
    "1,QU,\"5,WT,10,15\",2",
    "1,QU,\"5,WT,2,10,11\",3",
    "1,QU,\"5,WT,2,3,7,10\",4",
    "1,QU,\"5,WT,2,4,5,6,7,8,12,13,14,15,16,17,18\",12",
    "1,QU,\"5,WT,2,4,7,9,12\",5",
    "1,QU,\"5,WT,2,6\",2",
    "1,QU,\"5,WT,4\",1",
    "1,QU,\"5,WT,4,6,9\",3",
    "1,QU,\"5,WT,6\",1",
    "1,QU,\"5,WT,6,7\",2",
    "1,QU,\"5,WT,7\",1",
    "1,QU,\"5,WT,7,10\",2",
    "1,QU,\"5,WT,7,9,11,12,14\",5",
    "1,QU,\"6,10,WT,6,10\",1",
    "1,QU,\"6,11,WT,2,3,4,6,10,12\",11",
    "1,QU,\"6,12,13,WT,1,2,6,9,12,13\",12",
    "1,QU,\"6,12,WT,2,3,6,10,17\",9",
    "1,QU,\"6,13,WT,1,7,12\",6",
    "1,QU,\"6,7,WT,3,4,5,6,7,9,10,11,12\",15",
    "1,QU,\"6,7,WT,3,6,7,9\",5",
    "1,QU,\"6,7,WT,6,7\",1",
    "1,QU,\"6,8,9,WT,1,4,6,8,9\",9",
    "1,QU,\"6,8,WT,6,8,10,13,14\",7",
    "1,QU,\"6,9,12,13,WT,1,3,6,7,12,13\",18",
    "1,QU,\"6,9,13,WT,7\",3",
    "1,QU,\"6,9,WT,1,2,3,4,6,7,9,10,11,12\",17",
    "1,QU,\"6,9,WT,3,6,7,9\",5",
    "1,QU,\"6,WT,1\",1",
    "1,QU,\"6,WT,1,12\",2",
    "1,QU,\"6,WT,1,2\",2",
    "1,QU,\"6,WT,1,8\",2",
    "1,QU,\"6,WT,12\",1",
    "1,QU,\"6,WT,2,3,9,13\",4",
    "1,QU,\"6,WT,2,7,9\",3",
    "1,QU,\"6,WT,3\",1",
    "1,QU,\"6,WT,3,14\",2",
    "1,QU,\"6,WT,3,4,7,8,12\",5",
    "1,QU,\"6,WT,3,7,10\",3",
    "1,QU,\"6,WT,4\",1",
    "1,QU,\"6,WT,4,7,9,12\",4",
    "1,QU,\"6,WT,7\",1",
    "1,QU,\"6,WT,7,8,12\",3",
    "1,QU,\"6,WT,7,9,10\",3",
    "1,QU,\"6,WT,8,9,10\",3",
    "1,QU,\"6,WT,9\",1",
    "1,QU,\"6,WT,9,11\",2",
    "1,QU,\"7,10,WT,1,2,3,4,5,10,13,14\",15",
    "1,QU,\"7,10,WT,3,4,7,14\",7",
    "1,QU,\"7,10,WT,7,10\",1",
    "1,QU,\"7,11,WT,10,11,13\",5",
    "1,QU,\"7,11,WT,2,3,5,8\",8",
    "1,QU,\"7,12,WT,1,7\",3",
    "1,QU,\"7,12,WT,7,12\",1",
    "1,QU,\"7,8,WT,1\",2",
    "1,QU,\"7,WT,1,2,10,12\",4",
    "1,QU,\"7,WT,1,2,3,4\",4",
    "1,QU,\"7,WT,1,2,3,4,5,8,11,12\",8",
    "1,QU,\"7,WT,1,6\",2",
    "1,QU,\"7,WT,1,9,10\",3",
    "1,QU,\"7,WT,10\",1",
    "1,QU,\"7,WT,10,14\",2",
    "1,QU,\"7,WT,11\",1",
    "1,QU,\"7,WT,2\",1",
    "1,QU,\"7,WT,2,10\",2",
    "1,QU,\"7,WT,2,3,4,7,9,11,14\",6",
    "1,QU,\"7,WT,2,5\",2",
    "1,QU,\"7,WT,3,10\",2",
    "1,QU,\"7,WT,3,5\",2",
    "1,QU,\"7,WT,4\",1",
    "1,QU,\"7,WT,4,8\",2",
    "1,QU,\"7,WT,5,6,10\",3",
    "1,QU,\"7,WT,6\",1",
    "1,QU,\"7,WT,8\",1",
    "1,QU,\"7,WT,8,10\",2",
    "1,QU,\"7,WT,8,14\",2",
    "1,QU,\"7,WT,9,12\",2",
    "1,QU,\"8,10,WT,4,5,7,13,14\",10",
    "1,QU,\"8,11,WT,1,4,6,10,12\",10",
    "1,QU,\"8,11,WT,2\",2",
    "1,QU,\"8,11,WT,2,5,8,11\",5",
    "1,QU,\"8,11,WT,7\",2",
    "1,QU,\"8,12,13,WT,2,4,7\",9",
    "1,QU,\"8,12,WT,8,12\",1",
    "1,QU,\"8,13,WT,1,5,6,8,9,10,13,14,15\",15",
    "1,QU,\"8,9,WT,1,4\",4",
    "1,QU,\"8,WT,1,2,3,15\",4",
    "1,QU,\"8,WT,1,2,3,4,5,6,7,8,10,12,13,16\",11",
    "1,QU,\"8,WT,1,2,5\",3",
    "1,QU,\"8,WT,1,3\",2",
    "1,QU,\"8,WT,1,5,14\",3",
    "1,QU,\"8,WT,10,12\",2",
    "1,QU,\"8,WT,11,12\",2",
    "1,QU,\"8,WT,12\",1",
    "1,QU,\"8,WT,13\",1",
    "1,QU,\"8,WT,2\",1",
    "1,QU,\"8,WT,2,10\",2",
    "1,QU,\"8,WT,2,3\",2",
    "1,QU,\"8,WT,2,3,4,10,12\",5",
    "1,QU,\"8,WT,2,5\",2",
    "1,QU,\"8,WT,3,4\",2",
    "1,QU,\"8,WT,4,12\",2",
    "1,QU,\"8,WT,4,5,6,7,14\",5",
    "1,QU,\"8,WT,5,10\",2",
    "1,QU,\"8,WT,5,13\",2",
    "1,QU,\"8,WT,5,7,11\",3",
    "1,QU,\"9,10,11,WT,2,4\",6",
    "1,QU,\"9,12,WT,2,5,6,7\",8",
    "1,QU,\"9,13,WT,1,5\",4",
    "1,QU,\"9,13,WT,7,12\",4",
    "1,QU,\"9,15,WT,8,9,13,14,15\",7",
    "1,QU,\"9,WT,1,2,13\",3",
    "1,QU,\"9,WT,1,2,3,4,5,6,7,8,9,10,11,12\",11",
    "1,QU,\"9,WT,1,2,3,6,11,12,13\",7",
    "1,QU,\"9,WT,1,3,6\",3",
    "1,QU,\"9,WT,12\",1",
    "1,QU,\"9,WT,2,3,4,6,7,8,13\",7",
    "1,QU,\"9,WT,3\",1",
    "1,QU,\"9,WT,3,8\",2",
    "1,QU,\"9,WT,4\",1",
    "1,QU,\"9,WT,6\",1",
    "1,QU,\"BX,1,10\",1",
    "1,QU,\"BX,1,10,12\",3",
    "1,QU,\"BX,1,12\",1",
    "1,QU,\"BX,1,12,13\",3",
    "1,QU,\"BX,1,12,16\",3",
    "1,QU,\"BX,1,13\",1",
    "1,QU,\"BX,1,13,15\",3",
    "1,QU,\"BX,1,14\",1",
    "1,QU,\"BX,1,2\",1",
    "1,QU,\"BX,1,2,10\",3",
    "1,QU,\"BX,1,2,11\",3",
    "1,QU,\"BX,1,2,12\",3",
    "1,QU,\"BX,1,2,15\",3",
    "1,QU,\"BX,1,2,3\",3",
    "1,QU,\"BX,1,2,3,4\",6",
    "1,QU,\"BX,1,2,3,4,6,7,8,12\",28",
    "1,QU,\"BX,1,2,3,7\",6",
    "1,QU,\"BX,1,2,3,7,11,13,15\",21",
    "1,QU,\"BX,1,2,3,8\",6",
    "1,QU,\"BX,1,2,4\",3",
    "1,QU,\"BX,1,2,4,11\",6",
    "1,QU,\"BX,1,2,4,5\",6",
    "1,QU,\"BX,1,2,4,5,7,10\",15",
    "1,QU,\"BX,1,2,4,6,9\",10",
    "1,QU,\"BX,1,2,4,8\",6",
    "1,QU,\"BX,1,2,5\",3",
    "1,QU,\"BX,1,2,5,7\",6",
    "1,QU,\"BX,1,2,5,7,10,11\",15",
    "1,QU,\"BX,1,2,5,8\",6",
    "1,QU,\"BX,1,2,7,11,14\",10",
    "1,QU,\"BX,1,2,7,8,10\",10",
    "1,QU,\"BX,1,2,7,9,10\",10",
    "1,QU,\"BX,1,2,8\",3",
    "1,QU,\"BX,1,2,8,11\",6",
    "1,QU,\"BX,1,2,8,9,11\",10",
    "1,QU,\"BX,1,2,9,10\",6",
    "1,QU,\"BX,1,3\",1",
    "1,QU,\"BX,1,3,12\",3",
    "1,QU,\"BX,1,3,4\",3",
    "1,QU,\"BX,1,3,4,11\",6",
    "1,QU,\"BX,1,3,4,13,14\",10",
    "1,QU,\"BX,1,3,4,5\",6",
    "1,QU,\"BX,1,3,4,5,8,9\",15",
    "1,QU,\"BX,1,3,4,6,8,9,13\",21",
    "1,QU,\"BX,1,3,4,9\",6",
    "1,QU,\"BX,1,3,5\",3",
    "1,QU,\"BX,1,3,5,6\",6",
    "1,QU,\"BX,1,3,5,6,8\",10",
    "1,QU,\"BX,1,3,5,7,9,11\",15",
    "1,QU,\"BX,1,3,5,8\",6",
    "1,QU,\"BX,1,3,6\",3",
    "1,QU,\"BX,1,3,6,9\",6",
    "1,QU,\"BX,1,3,8\",3",
    "1,QU,\"BX,1,3,8,11\",6",
    "1,QU,\"BX,1,3,8,9\",6",
    "1,QU,\"BX,1,3,9,11\",6",
    "1,QU,\"BX,1,4\",1",
    "1,QU,\"BX,1,4,10\",3",
    "1,QU,\"BX,1,4,11\",3",
    "1,QU,\"BX,1,4,12\",3",
    "1,QU,\"BX,1,4,13\",3",
    "1,QU,\"BX,1,4,14\",3",
    "1,QU,\"BX,1,4,5\",3",
    "1,QU,\"BX,1,4,5,6\",6",
    "1,QU,\"BX,1,4,6\",3",
    "1,QU,\"BX,1,4,6,10,14\",10",
    "1,QU,\"BX,1,4,7\",3",
    "1,QU,\"BX,1,4,7,10\",6",
    "1,QU,\"BX,1,4,7,11\",6",
    "1,QU,\"BX,1,4,7,8,9\",10",
    "1,QU,\"BX,1,4,8,11\",6",
    "1,QU,\"BX,1,4,8,11,17\",10",
    "1,QU,\"BX,1,4,9\",3",
    "1,QU,\"BX,1,4,9,12\",6",
    "1,QU,\"BX,1,4,9,13\",6",
    "1,QU,\"BX,1,5\",1",
    "1,QU,\"BX,1,5,10,11\",6",
    "1,QU,\"BX,1,5,10,15\",6",
    "1,QU,\"BX,1,5,6\",3",
    "1,QU,\"BX,1,5,6,12\",6",
    "1,QU,\"BX,1,5,7\",3",
    "1,QU,\"BX,1,5,7,12\",6",
    "1,QU,\"BX,1,5,7,9,11\",10",
    "1,QU,\"BX,1,5,8,13\",6",
    "1,QU,\"BX,1,5,9\",3",
    "1,QU,\"BX,1,5,9,11,13\",10",
    "1,QU,\"BX,1,6\",1",
    "1,QU,\"BX,1,6,10\",3",
    "1,QU,\"BX,1,6,10,11,16\",10",
    "1,QU,\"BX,1,6,7\",3",
    "1,QU,\"BX,1,6,8\",3",
    "1,QU,\"BX,1,6,8,14\",6",
    "1,QU,\"BX,1,6,9,12\",6",
    "1,QU,\"BX,1,7\",1",
    "1,QU,\"BX,1,7,10\",3",
    "1,QU,\"BX,1,7,11\",3",
    "1,QU,\"BX,1,7,14\",3",
    "1,QU,\"BX,1,7,8\",3",
    "1,QU,\"BX,1,7,8,13\",6",
    "1,QU,\"BX,1,7,9\",3",
    "1,QU,\"BX,1,8\",1",
    "1,QU,\"BX,1,8,10\",3",
    "1,QU,\"BX,1,8,10,16\",6",
    "1,QU,\"BX,1,8,12\",3",
    "1,QU,\"BX,1,8,9\",3",
    "1,QU,\"BX,1,9\",1",
    "1,QU,\"BX,1,9,10\",3",
    "1,QU,\"BX,1,9,11,12\",6",
    "1,QU,\"BX,1,9,13\",3",
    "1,QU,\"BX,1,9,15\",3",
    "1,QU,\"BX,10,11\",1",
    "1,QU,\"BX,10,11,12\",3",
    "1,QU,\"BX,10,11,12,14\",6",
    "1,QU,\"BX,10,11,14\",3",
    "1,QU,\"BX,10,12\",1",
    "1,QU,\"BX,10,13\",1",
    "1,QU,\"BX,11,12\",1",
    "1,QU,\"BX,11,13,14,15\",6",
    "1,QU,\"BX,11,14\",1",
    "1,QU,\"BX,12,13\",1",
    "1,QU,\"BX,12,13,14\",3",
    "1,QU,\"BX,12,13,17\",3",
    "1,QU,\"BX,13,16\",1",
    "1,QU,\"BX,14,18\",1",
    "1,QU,\"BX,2,10\",1",
    "1,QU,\"BX,2,10,12\",3",
    "1,QU,\"BX,2,10,14\",3",
    "1,QU,\"BX,2,11\",1",
    "1,QU,\"BX,2,11,13\",3",
    "1,QU,\"BX,2,11,15\",3",
    "1,QU,\"BX,2,12\",1",
    "1,QU,\"BX,2,3\",1",
    "1,QU,\"BX,2,3,10,12\",6",
    "1,QU,\"BX,2,3,11\",3",
    "1,QU,\"BX,2,3,4,5\",6",
    "1,QU,\"BX,2,3,4,6\",6",
    "1,QU,\"BX,2,3,5\",3",
    "1,QU,\"BX,2,3,6,8\",6",
    "1,QU,\"BX,2,3,7\",3",
    "1,QU,\"BX,2,3,7,10,11\",10",
    "1,QU,\"BX,2,3,7,11\",6",
    "1,QU,\"BX,2,3,8,11\",6",
    "1,QU,\"BX,2,3,8,12\",6",
    "1,QU,\"BX,2,3,8,13\",6",
    "1,QU,\"BX,2,4\",1",
    "1,QU,\"BX,2,4,12\",3",
    "1,QU,\"BX,2,4,5\",3",
    "1,QU,\"BX,2,4,5,7,11\",10",
    "1,QU,\"BX,2,4,5,8,12\",10",
    "1,QU,\"BX,2,4,6\",3",
    "1,QU,\"BX,2,4,6,11\",6",
    "1,QU,\"BX,2,4,6,7\",6",
    "1,QU,\"BX,2,4,6,7,10,16\",15",
    "1,QU,\"BX,2,4,6,8\",6",
    "1,QU,\"BX,2,4,7,10\",6",
    "1,QU,\"BX,2,4,7,8,10\",10",
    "1,QU,\"BX,2,4,7,9,10\",10",
    "1,QU,\"BX,2,4,8\",3",
    "1,QU,\"BX,2,4,8,13\",6",
    "1,QU,\"BX,2,4,8,17\",6",
    "1,QU,\"BX,2,5\",1",
    "1,QU,\"BX,2,5,12\",3",
    "1,QU,\"BX,2,5,6\",3",
    "1,QU,\"BX,2,5,6,7\",6",
    "1,QU,\"BX,2,5,7,14\",6",
    "1,QU,\"BX,2,5,7,9\",6",
    "1,QU,\"BX,2,5,8\",3",
    "1,QU,\"BX,2,5,8,11\",6",
    "1,QU,\"BX,2,5,9\",3",
    "1,QU,\"BX,2,6\",1",
    "1,QU,\"BX,2,6,12\",3",
    "1,QU,\"BX,2,6,7\",3",
    "1,QU,\"BX,2,6,8\",3",
    "1,QU,\"BX,2,6,9\",3",
    "1,QU,\"BX,2,7\",1",
    "1,QU,\"BX,2,7,10\",3",
    "1,QU,\"BX,2,7,10,14\",6",
    "1,QU,\"BX,2,7,11\",3",
    "1,QU,\"BX,2,7,12\",3",
    "1,QU,\"BX,2,7,8\",3",
    "1,QU,\"BX,2,7,8,14\",6",
    "1,QU,\"BX,2,7,9\",3",
    "1,QU,\"BX,2,7,9,10,11\",10",
    "1,QU,\"BX,2,7,9,11\",6",
    "1,QU,\"BX,2,8\",1",
    "1,QU,\"BX,2,8,10,11\",6",
    "1,QU,\"BX,2,8,13\",3",
    "1,QU,\"BX,3,10\",1",
    "1,QU,\"BX,3,10,11\",3",
    "1,QU,\"BX,3,10,11,13\",6",
    "1,QU,\"BX,3,11\",1",
    "1,QU,\"BX,3,12\",1",
    "1,QU,\"BX,3,13,14\",3",
    "1,QU,\"BX,3,14\",1",
    "1,QU,\"BX,3,4,11\",3",
    "1,QU,\"BX,3,4,12\",3",
    "1,QU,\"BX,3,4,13\",3",
    "1,QU,\"BX,3,4,14\",3",
    "1,QU,\"BX,3,4,5\",3",
    "1,QU,\"BX,3,4,6\",3",
    "1,QU,\"BX,3,4,6,8\",6",
    "1,QU,\"BX,3,4,8\",3",
    "1,QU,\"BX,3,5\",1",
    "1,QU,\"BX,3,5,10\",3",
    "1,QU,\"BX,3,5,6,9,12\",10",
    "1,QU,\"BX,3,5,7\",3",
    "1,QU,\"BX,3,5,7,11\",6",
    "1,QU,\"BX,3,5,7,8,11,12\",15",
    "1,QU,\"BX,3,5,8,9\",6",
    "1,QU,\"BX,3,6\",1",
    "1,QU,\"BX,3,6,11\",3",
    "1,QU,\"BX,3,6,12\",3",
    "1,QU,\"BX,3,6,7\",3",
    "1,QU,\"BX,3,6,7,9\",6",
    "1,QU,\"BX,3,6,8,9\",6",
    "1,QU,\"BX,3,6,9,12\",6",
    "1,QU,\"BX,3,7\",1",
    "1,QU,\"BX,3,7,10\",3",
    "1,QU,\"BX,3,7,11\",3",
    "1,QU,\"BX,3,7,12,15,20\",10",
    "1,QU,\"BX,3,8\",1",
    "1,QU,\"BX,3,8,10,12\",6",
    "1,QU,\"BX,3,8,11\",3",
    "1,QU,\"BX,3,8,12\",3",
    "1,QU,\"BX,3,8,15\",3",
    "1,QU,\"BX,3,9\",1",
    "1,QU,\"BX,3,9,13\",3",
    "1,QU,\"BX,4,10\",1",
    "1,QU,\"BX,4,10,11\",3",
    "1,QU,\"BX,4,5\",1",
    "1,QU,\"BX,4,5,14\",3",
    "1,QU,\"BX,4,5,6\",3",
    "1,QU,\"BX,4,5,6,8\",6",
    "1,QU,\"BX,4,5,7,15,17\",10",
    "1,QU,\"BX,4,5,7,8\",6",
    "1,QU,\"BX,4,5,9\",3",
    "1,QU,\"BX,4,6\",1",
    "1,QU,\"BX,4,6,11\",3",
    "1,QU,\"BX,4,6,7,8,11,14\",15",
    "1,QU,\"BX,4,6,7,8,9,11,13\",21",
    "1,QU,\"BX,4,6,8\",3",
    "1,QU,\"BX,4,6,8,10\",6",
    "1,QU,\"BX,4,6,9\",3",
    "1,QU,\"BX,4,6,9,10\",6",
    "1,QU,\"BX,4,7\",1",
    "1,QU,\"BX,4,7,11\",3",
    "1,QU,\"BX,4,7,12\",3",
    "1,QU,\"BX,4,7,8\",3",
    "1,QU,\"BX,4,7,8,12\",6",
    "1,QU,\"BX,4,7,8,12,13\",10",
    "1,QU,\"BX,4,7,9\",3",
    "1,QU,\"BX,4,8\",1",
    "1,QU,\"BX,4,8,10\",3",
    "1,QU,\"BX,4,8,11\",3",
    "1,QU,\"BX,4,8,13\",3",
    "1,QU,\"BX,4,8,15,16\",6",
    "1,QU,\"BX,4,8,9\",3",
    "1,QU,\"BX,4,9\",1",
    "1,QU,\"BX,5,10\",1",
    "1,QU,\"BX,5,11\",1",
    "1,QU,\"BX,5,11,14\",3",
    "1,QU,\"BX,5,12,13\",3",
    "1,QU,\"BX,5,12,14\",3",
    "1,QU,\"BX,5,13\",1",
    "1,QU,\"BX,5,6\",1",
    "1,QU,\"BX,5,6,7,8\",6",
    "1,QU,\"BX,5,6,9\",3",
    "1,QU,\"BX,5,6,9,10,15\",10",
    "1,QU,\"BX,5,7\",1",
    "1,QU,\"BX,5,7,11\",3",
    "1,QU,\"BX,5,7,12\",3",
    "1,QU,\"BX,5,7,9,12\",6",
    "1,QU,\"BX,5,8\",1",
    "1,QU,\"BX,5,8,11\",3",
    "1,QU,\"BX,5,8,12,13\",6",
    "1,QU,\"BX,5,9,10\",3",
    "1,QU,\"BX,5,9,10,12\",6",
    "1,QU,\"BX,5,9,12\",3",
    "1,QU,\"BX,5,9,13\",3",
    "1,QU,\"BX,6,11\",1",
    "1,QU,\"BX,6,11,12\",3",
    "1,QU,\"BX,6,12\",1",
    "1,QU,\"BX,6,7\",1",
    "1,QU,\"BX,6,7,10\",3",
    "1,QU,\"BX,6,7,11\",3",
    "1,QU,\"BX,6,7,12\",3",
    "1,QU,\"BX,6,7,12,17\",6",
    "1,QU,\"BX,6,7,8,10\",6",
    "1,QU,\"BX,6,7,8,12\",6",
    "1,QU,\"BX,6,7,9\",3",
    "1,QU,\"BX,6,8,10\",3",
    "1,QU,\"BX,6,8,10,13\",6",
    "1,QU,\"BX,6,8,14\",3",
    "1,QU,\"BX,6,8,9,10\",6",
    "1,QU,\"BX,7,10\",1",
    "1,QU,\"BX,7,10,11\",3",
    "1,QU,\"BX,7,10,12\",3",
    "1,QU,\"BX,7,10,14,16\",6",
    "1,QU,\"BX,7,11\",1",
    "1,QU,\"BX,7,14\",1",
    "1,QU,\"BX,7,8,10\",3",
    "1,QU,\"BX,7,8,10,12,16\",10",
    "1,QU,\"BX,7,8,9\",3",
    "1,QU,\"BX,7,8,9,10,11\",10",
    "1,QU,\"BX,7,9\",1",
    "1,QU,\"BX,7,9,10\",3",
    "1,QU,\"BX,7,9,13\",3",
    "1,QU,\"BX,8,10\",1",
    "1,QU,\"BX,8,10,12\",3",
    "1,QU,\"BX,8,10,13\",3",
    "1,QU,\"BX,8,11\",1",
    "1,QU,\"BX,8,11,12\",3",
    "1,QU,\"BX,8,9,10\",3",
    "1,QU,\"BX,9,10\",1",
    "1,QU,\"BX,9,10,11,12,13\",10",
    "1,QU,\"BX,9,10,13\",3",
    "1,QU,\"BX,9,11\",1",
    "1,QU,\"BX,9,11,12\",3",
    "1,QU,\"BX,9,12\",1",
    "1,QU,\"BX,9,14\",1",
    "10,QU,\"1,4,6,WT,1,4,6\",30",
    "10,QU,\"1,WT,7\",10",
    "10,QU,\"4,WT,8\",10",
    "10,QU,\"BX,1,11\",10",
    "10,QU,\"BX,4,5\",10",
    "10,QU,\"BX,4,6\",10",
    "10,QU,\"BX,8,10\",10",
    "2,QU,\"1,11,WT,1,11\",2",
    "2,QU,\"1,12,WT,2,3,4,6,9,12,13\",26",
    "2,QU,\"1,2,10,WT,1,2,10\",6",
    "2,QU,\"1,2,WT,1,2,10,11,12\",14",
    "2,QU,\"1,2,WT,3,4\",8",
    "2,QU,\"1,2,WT,8,9,10\",12",
    "2,QU,\"1,8,12,17,WT,1,8,12,17\",12",
    "2,QU,\"1,8,12,WT,1,8,12\",6",
    "2,QU,\"1,WT,1,2,3,7,8,9,10,11,12,13,15\",20",
    "2,QU,\"1,WT,2\",2",
    "2,QU,\"1,WT,2,7\",4",
    "2,QU,\"1,WT,3,4,9\",6",
    "2,QU,\"1,WT,6\",2",
    "2,QU,\"10,WT,11\",2",
    "2,QU,\"10,WT,4,5,13\",6",
    "2,QU,\"11,WT,1,12\",4",
    "2,QU,\"11,WT,1,7\",4",
    "2,QU,\"12,13,WT,1,2,3,6,8,13\",22",
    "2,QU,\"12,WT,2,3,4,5,6,7,8,9,11,12,13\",20",
    "2,QU,\"12,WT,3,13\",4",
    "2,QU,\"2,3,11,12,17,WT,10\",10",
    "2,QU,\"2,3,5,7,8,11,12,WT,2,7,11\",30",
    "2,QU,\"2,4,7,WT,1,2,4,7,8,10,11\",30",
    "2,QU,\"2,5,10,WT,2,5,10\",6",
    "2,QU,\"2,5,WT,8,10,14\",12",
    "2,QU,\"2,6,10,13,WT,2,6,13\",12",
    "2,QU,\"2,WT,10\",2",
    "2,QU,\"2,WT,5,8,10,11\",8",
    "2,QU,\"3,4,WT,1,2,3,4,5,6\",18",
    "2,QU,\"3,6,9,WT,7,9\",10",
    "2,QU,\"3,6,WT,4\",4",
    "2,QU,\"3,WT,4,6,8\",6",
    "2,QU,\"3,WT,7,11\",4",
    "2,QU,\"4,9,WT,1,3,4,9\",10",
    "2,QU,\"4,WT,1\",2",
    "2,QU,\"4,WT,1,2,3,4,5,6,7\",12",
    "2,QU,\"4,WT,2,7,10\",6",
    "2,QU,\"5,12,WT,1,4,5,7,9,11,15\",26",
    "2,QU,\"5,6,9,12,WT,1,2\",16",
    "2,QU,\"5,6,9,12,WT,1,3\",16",
    "2,QU,\"5,6,WT,5,6,8,10\",10",
    "2,QU,\"5,7,WT,1,2,3,5,8,12\",22",
    "2,QU,\"5,7,WT,5,9,12\",10",
    "2,QU,\"5,WT,1,2,3,4,5,6,7\",12",
    "2,QU,\"5,WT,1,2,6,8,9\",10",
    "2,QU,\"6,7,WT,4,6,7,8\",10",
    "2,QU,\"6,WT,1\",2",
    "2,QU,\"6,WT,1,2,3\",6",
    "2,QU,\"6,WT,2,4,5,9\",8",
    "2,QU,\"6,WT,3,4,8\",6",
    "2,QU,\"6,WT,3,5\",4",
    "2,QU,\"6,WT,7,9\",4",
    "2,QU,\"7,WT,1\",2",
    "2,QU,\"7,WT,1,5,14\",6",
    "2,QU,\"7,WT,12,13,14\",6",
    "2,QU,\"7,WT,3\",2",
    "2,QU,\"8,WT,7\",2",
    "2,QU,\"8,WT,9\",2",
    "2,QU,\"9,12,WT,6,12\",6",
    "2,QU,\"9,WT,1,2,3,6,11,12,13\",14",
    "2,QU,\"9,WT,5,7\",4",
    "2,QU,\"9,WT,7,12\",4",
    "2,QU,\"BX,1,10\",2",
    "2,QU,\"BX,1,10,11\",6",
    "2,QU,\"BX,1,11\",2",
    "2,QU,\"BX,1,2,10\",6",
    "2,QU,\"BX,1,2,3,4\",12",
    "2,QU,\"BX,1,2,4\",6",
    "2,QU,\"BX,1,2,4,7,11\",20",
    "2,QU,\"BX,1,2,5\",6",
    "2,QU,\"BX,1,2,7\",6",
    "2,QU,\"BX,1,2,9,10\",12",
    "2,QU,\"BX,1,3,4\",6",
    "2,QU,\"BX,1,3,4,9\",12",
    "2,QU,\"BX,1,3,5\",6",
    "2,QU,\"BX,1,3,6,8,12\",20",
    "2,QU,\"BX,1,3,8\",6",
    "2,QU,\"BX,1,4,5\",6",
    "2,QU,\"BX,1,4,7,10\",12",
    "2,QU,\"BX,1,5\",2",
    "2,QU,\"BX,1,7\",2",
    "2,QU,\"BX,1,7,11\",6",
    "2,QU,\"BX,1,7,8,12\",12",
    "2,QU,\"BX,1,8\",2",
    "2,QU,\"BX,1,8,10\",6",
    "2,QU,\"BX,1,8,9\",6",
    "2,QU,\"BX,1,9,12\",6",
    "2,QU,\"BX,10,11\",2",
    "2,QU,\"BX,10,11,12,14\",12",
    "2,QU,\"BX,10,14,17\",6",
    "2,QU,\"BX,12,13\",2",
    "2,QU,\"BX,2,10\",2",
    "2,QU,\"BX,2,10,12\",6",
    "2,QU,\"BX,2,10,14\",6",
    "2,QU,\"BX,2,3,4\",6",
    "2,QU,\"BX,2,3,4,10,12\",20",
    "2,QU,\"BX,2,3,6\",6",
    "2,QU,\"BX,2,3,6,10\",12",
    "2,QU,\"BX,2,3,6,7\",12",
    "2,QU,\"BX,2,4\",2",
    "2,QU,\"BX,2,4,10\",6",
    "2,QU,\"BX,2,4,11\",6",
    "2,QU,\"BX,2,4,5\",6",
    "2,QU,\"BX,2,5,10\",6",
    "2,QU,\"BX,2,5,7\",6",
    "2,QU,\"BX,2,5,8,11\",12",
    "2,QU,\"BX,3,4,5,6\",12",
    "2,QU,\"BX,3,4,7\",6",
    "2,QU,\"BX,3,6\",2",
    "2,QU,\"BX,3,6,14\",6",
    "2,QU,\"BX,3,6,7,9\",12",
    "2,QU,\"BX,3,7\",2",
    "2,QU,\"BX,3,8\",2",
    "2,QU,\"BX,3,9,12\",6",
    "2,QU,\"BX,4,10,12\",6",
    "2,QU,\"BX,4,5\",2",
    "2,QU,\"BX,4,6,7\",6",
    "2,QU,\"BX,4,7\",2",
    "2,QU,\"BX,4,7,8\",6",
    "2,QU,\"BX,4,7,8,12\",12",
    "2,QU,\"BX,4,7,9\",6",
    "2,QU,\"BX,5,6\",2",
    "2,QU,\"BX,5,7,11\",6",
    "2,QU,\"BX,5,7,8\",6",
    "2,QU,\"BX,5,7,8,10\",12",
    "2,QU,\"BX,5,7,9\",6",
    "2,QU,\"BX,5,8,10\",6",
    "2,QU,\"BX,5,9\",2",
    "2,QU,\"BX,6,11\",2",
    "2,QU,\"BX,6,7,9\",6",
    "2,QU,\"BX,6,8,10\",6",
    "2,QU,\"BX,7,11\",2",
    "2,QU,\"BX,7,8,12\",6",
    "2,QU,\"BX,8,9\",2",
    "2,QU,\"BX,9,10,11\",6",
    "2,QU,\"BX,9,11\",2",
    "20,QU,\"6,WT,12\",20",
    "20,QU,\"BX,5,10,12\",60",
    "20,QU,\"BX,6,9\",20",
    "25,QU,\"BX,1,5,8\",75",
    "3,QU,\"1,WT,1,3,4,5,6,7,8,9,10,11,16,17\",33",
    "3,QU,\"1,WT,2,3\",6",
    "3,QU,\"10,WT,1\",3",
    "3,QU,\"10,WT,11\",3",
    "3,QU,\"2,10,WT,2,10\",3",
    "3,QU,\"2,WT,7,10\",6",
    "3,QU,\"3,4,WT,2,3,4,6,7,8,10\",33",
    "3,QU,\"4,11,WT,4,11\",3",
    "3,QU,\"5,12,WT,3,5,6,7,12\",21",
    "3,QU,\"5,WT,1,4,6\",9",
    "3,QU,\"6,7,12,WT,6,7,12\",9",
    "3,QU,\"7,WT,10\",3",
    "3,QU,\"7,WT,9,10,11\",9",
    "3,QU,\"BX,1,4,5,12,16,17\",45",
    "3,QU,\"BX,1,5,11\",9",
    "3,QU,\"BX,11,12,14\",9",
    "3,QU,\"BX,2,3,5\",9",
    "3,QU,\"BX,3,10,12\",9",
    "3,QU,\"BX,3,7,12,18\",18",
    "3,QU,\"BX,4,5,11\",9",
    "3,QU,\"BX,4,5,8\",9",
    "3,QU,\"BX,5,13\",3",
    "3,QU,\"BX,7,8\",3",
    "3,QU,\"BX,7,8,9,12\",18",
    "4,QU,\"1,WT,11\",4",
    "4,QU,\"11,WT,1,2,3,7,8,9,10,11,12,13,15\",40",
    "4,QU,\"2,WT,5\",4",
    "4,QU,\"3,WT,10,12\",8",
    "4,QU,\"4,WT,6\",4",
    "4,QU,\"5,WT,1,4\",8",
    "4,QU,\"6,WT,1,4,5\",12",
    "4,QU,\"7,WT,6\",4",
    "4,QU,\"BX,1,2,4,5\",24",
    "4,QU,\"BX,1,9\",4",
    "4,QU,\"BX,2,7,10,14\",24",
    "4,QU,\"BX,3,5,7\",12",
    "4,QU,\"BX,4,10\",4",
    "4,QU,\"BX,5,7,8\",12",
    "4,QU,\"BX,6,8\",4",
    "5,QU,\"1,WT,3\",5",
    "5,QU,\"1,WT,5,6\",10",
    "5,QU,\"1,WT,7\",5",
    "5,QU,\"1,WT,8\",5",
    "5,QU,\"11,WT,1,2\",10",
    "5,QU,\"11,WT,6\",5",
    "5,QU,\"2,WT,8\",5",
    "5,QU,\"3,WT,11\",5",
    "5,QU,\"3,WT,2\",5",
    "5,QU,\"4,7,WT,1,2,11\",30",
    "5,QU,\"4,WT,6\",5",
    "5,QU,\"4,WT,6,8,12\",15",
    "5,QU,\"4,WT,8,9\",10",
    "5,QU,\"5,WT,12\",5",
    "5,QU,\"5,WT,4,8\",10",
    "5,QU,\"6,WT,2,3\",10",
    "5,QU,\"6,WT,3\",5",
    "5,QU,\"6,WT,7,9\",10",
    "5,QU,\"7,WT,1,2,10\",15",
    "5,QU,\"7,WT,5,12\",10",
    "5,QU,\"7,WT,8,11\",10",
    "5,QU,\"9,WT,1,2,7,8,10,15\",30",
    "5,QU,\"BX,1,3\",5",
    "5,QU,\"BX,10,12\",5",
    "5,QU,\"BX,10,14\",5",
    "6,QU,\"2,WT,1,10\",12",
    "6,QU,\"6,7,WT,6,7\",6",
    "6,QU,\"6,WT,7\",6",
    "6,QU,\"BX,1,2,6\",18",
    "6,QU,\"BX,1,4\",6",
    "6,QU,\"BX,3,6\",6",
    "6,QU,\"BX,9,10\",6",
    "7,QU,\"6,WT,5\",7",
    "7,QU,\"BX,2,10\",7",
    "8,QU,\"1,WT,5\",8"
)
