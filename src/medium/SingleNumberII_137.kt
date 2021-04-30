package medium

import java.util.*

class SingleNumberII_137 {

    fun singleNumber(nums: IntArray): Int {
        if (nums.isEmpty()){
            return 0
        }
        Arrays.sort(nums)
        var index = 0
        while (index < nums.size){
            // 0 .. 2 3 .. 5 6 .. 8
            if (index + 2 < nums.size && nums[index] == nums[index + 2]){
                index += 3
            }else{
                return nums[index]
            }
        }
        return nums[0]
    }

    fun exe(){
        print(singleNumber(intArrayOf(2,2,3,2)))
    }
}