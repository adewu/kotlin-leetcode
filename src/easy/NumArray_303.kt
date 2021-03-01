package easy

import java.util.*

class NumArray_303(val nums: IntArray) {

    val arr = IntArray(nums.size + 1){0}

    init {
       for (i in nums.indices){
           arr[i + 1] = arr[i] + nums[i]
       }
    }

    fun sumRange(i: Int, j: Int): Int {

        return arr[j + 1] - arr[i]
    }

}