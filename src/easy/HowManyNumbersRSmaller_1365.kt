package easy

class HowManyNumbersRSmaller_1365 {

    fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
        val result = IntArray(nums.size)
        nums.forEachIndexed { index, i ->
            var count = 0
            nums.forEachIndexed { index, j ->
                if (i > j){
                    count += 1
                }
            }
            result[index] = count
        }
        return result
    }

    fun exe(){
        val ints = smallerNumbersThanCurrent(intArrayOf(7,7,7,7))
        ints.forEach { print(it) }
    }
}