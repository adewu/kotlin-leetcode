package medium

import java.util.*

class SubsetsII_90 {


    val t = mutableListOf<Int>()
    val ans = mutableListOf<MutableList<Int>>()

    fun subsetsWithDup(nums: IntArray): List<List<Int>> {
        Arrays.sort(nums)
        val n = nums.size
        for (mask in 0 until (1 shl n)) {
            t.clear()
            var flag = true
            for (i in 0 until n){
                if ((mask and (1 shl i)) != 0){
                    if (i > 0 && (mask shr (i - 1) and 1) == 0 && nums[i] == nums[i - 1]){
                        flag = false
                        break
                    }
                    t.add(nums[i])
                }
            }
            if (flag){
                ans.add(t)
            }
        }
        return ans
    }

    fun exe(){

    }
}