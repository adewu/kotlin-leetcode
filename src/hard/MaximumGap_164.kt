package hard

import java.util.*

class MaximumGap_164 {

    fun maximumGap(nums: IntArray): Int {
        Arrays.sort(nums)
        if(nums.size == 2){
            return nums[1] - nums[0]
        }
        var r = 0
        for (i in 0 until nums.size - 1){
            var a = nums[i + 1] - nums[i]
            if (a > r){
                r = a
            }
        }
        return r
    }

    fun exe(){
        maximumGap(intArrayOf(1,10))
    }
}