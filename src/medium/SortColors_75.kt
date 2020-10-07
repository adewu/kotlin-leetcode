package medium

class SortColors_75 {

    fun sortColors(nums: IntArray): Unit {

        val size = nums.size
        if (size < 2){
            return
        }

        var zeroCount = 0
        var oneCount = 0

        nums.forEachIndexed { index, value ->
            if (value == 0){
                zeroCount ++;
            }else if (value == 1){
                oneCount ++
            }
        }

        var onePos = zeroCount
        var twoPos = zeroCount + oneCount
        nums.forEachIndexed { index, value ->
            if (index < onePos){
                nums[index] = 0
            }else if (index < twoPos){
                nums[index] = 1
            }else{
                nums[index] = 2
            }
        }

        nums.forEach {
            print(it)
        }
    }

    fun exe(){
        sortColors(intArrayOf(2,0,2,1,1,0))
    }
}