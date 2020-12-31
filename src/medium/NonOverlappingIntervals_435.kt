package medium

import java.util.*

class NonOverlappingIntervals_435 {

    fun eraseOverlapIntervals(intervals: Array<IntArray>): Int {
        if (intervals.isEmpty()){
            return 0
        }
        Arrays.sort(intervals){ arr1:IntArray?, arr2:IntArray? ->
            arr1!![1] - arr2!![1]
        }
        var count = 1
        var end = intervals[0][1]
        for (i in intervals.indices) {
            if (intervals[i][0] < end){
                continue
            }
            end = intervals[i][1]
            count ++
        }
        return intervals.size - count
    }

    fun exe(){
        eraseOverlapIntervals(arrayOf(intArrayOf(1,2),intArrayOf(2,3),intArrayOf(3,4),intArrayOf(1,3)))
    }
}