package easy

class FindAllNumbersDisappearedArray_448 {

    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        val res = mutableListOf<Int>()

        if (nums.isEmpty()){
            return res
        }

        val intArray = IntArray(nums.size + 1) { 0 }

        nums.forEach {
            intArray[it] = intArray[it] + 1
        }

        intArray.forEachIndexed { index, i ->
            if (index != 0 ){
                if (i == 0){
                    res.add(index)
                }
            }
        }

        return res
    }

    fun exe(){
        findDisappearedNumbers(intArrayOf(1,1))
    }
}