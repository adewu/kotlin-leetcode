package medium

import java.util.*

class OneThreeTwoPattern_456 {

    fun find132pattern(nums: IntArray): Boolean {
        val n = nums.size
        if (n < 3){
            return false
        }

        var leftMin = nums[0]
        val rightAll = TreeMap<Int, Int>()

        for (k in 2 until n){
            rightAll[nums[k]] = rightAll.getOrDefault(nums[k],0) + 1
        }

        for (j in 1 until n -1){
            if (leftMin < nums[j]){
                val next = rightAll.ceilingKey(leftMin + 1)
                if (next != null && next < nums[j]){
                    return true
                }
            }
            leftMin = Math.min(leftMin,nums[j])
            rightAll[nums[j + 1]]?.minus(1)?.let { rightAll.put(nums[j + 1], it) }
            if (rightAll[nums[j + 1]] == 0){
                rightAll.remove(nums[j + 1])
            }
        }
        return false
    }

    fun exe(){
        find132pattern(intArrayOf(3,1,4,2))
    }
}