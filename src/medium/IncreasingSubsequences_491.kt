package medium

import java.util.*

class IncreasingSubsequences_491 {

    fun findSubsequences(nums: IntArray): List<List<Int>> {
        val resultList = mutableListOf<List<Int>>()

        Arrays.copyOfRange(nums,0,nums.size - 1)
        Arrays.copyOfRange(nums,1,nums.size - 1)
        Arrays.copyOfRange(nums,2,nums.size - 1)

        return resultList
    }



    fun exe(){
        val ints = intArrayOf(4, 6, 7, 7)
        findSubsequences(ints)
    }
}