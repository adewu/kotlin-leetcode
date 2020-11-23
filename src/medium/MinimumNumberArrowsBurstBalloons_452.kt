package medium

import java.util.*

class MinimumNumberArrowsBurstBalloons_452 {

    fun findMinArrowShots(points: Array<IntArray>): Int {
        if (points.size == 0){
            return 0
        }
        Arrays.sort(points) { o1, o2 -> Integer.compare(o1[1],o2[1]) }
        var count = 1
        var axis = points[0][1]
        for (i in 1 until points.size){
            if (axis < points[i][0]){
                count++
                axis = points[i][1]
            }
        }
        return count
    }




    fun exe() {
        print(findMinArrowShots(arrayOf(intArrayOf(10, 16), intArrayOf(2, 8), intArrayOf(1, 6), intArrayOf(7, 12))))
//        print(findMinArrowShots(arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(3, 4), intArrayOf(4, 5))))
//        print(findMinArrowShots(arrayOf(intArrayOf(2, 3), intArrayOf(2,3))))
    }
}