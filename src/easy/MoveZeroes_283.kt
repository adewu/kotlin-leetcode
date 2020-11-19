package easy

class MoveZeroes_283 {
    fun moveZeroes(nums: IntArray): Unit {
        var z = 0
        for (i in nums.indices){
            if (nums[i] != 0 ){
                nums[z ++] = nums[i]
            }
        }
        for (j in z until nums.size){
            nums[j] = 0
        }
    }

    fun exe(){
        moveZeroes(intArrayOf(0,0,1))
    }
}