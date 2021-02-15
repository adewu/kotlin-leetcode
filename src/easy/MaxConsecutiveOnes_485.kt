package easy

class MaxConsecutiveOnes_485 {


    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var res = 0
        var temp = 0
        nums.forEachIndexed { index, i ->

            if (i == 1){
                temp ++
            }

            if (i == 0 || index == nums.size - 1){
                if (res < temp){
                    res = temp
                }
                temp = 0
            }
        }
        return res
    }

    fun exe(){
        print(findMaxConsecutiveOnes(intArrayOf(1,1,0,1,1,1)))
    }
}