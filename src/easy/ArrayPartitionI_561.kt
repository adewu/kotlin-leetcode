package easy

import java.util.*

class ArrayPartitionI_561 {

    fun arrayPairSum(nums: IntArray): Int {
        Arrays.sort(nums)

        var res = 0

        for (i in nums.indices step 2){
            res += nums[i]
        }

        return res
    }


    fun exe(){
        arrayPairSum(intArrayOf(6,2,6,5,1,2))
    }
}