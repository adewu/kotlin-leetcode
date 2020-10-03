package easy

class TwoSum_1 {

    fun twoSum(nums: IntArray, target: Int): IntArray {

        for (index in 0 until nums.size) {

            for (j in index + 1 until nums.size) {
                if (nums[index] + nums[j] == target) {
                    return intArrayOf(index, j)
                }
            }
        }
        return intArrayOf(0)
    }

    fun twoSum2(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int,Int>()
        for (i in 0 .. nums.size){
            if (map.containsKey(target - nums[i])){
                val v = map[target - nums[i]]
                v?.let {
                    return intArrayOf(v,i)
                }
                return intArrayOf(0)
            }
            map[nums[i]] = i
        }

        return intArrayOf(0)
    }

        fun exe() {
        twoSum(intArrayOf(-1, -2, -3, -4, -5), -8).forEachIndexed { index, i ->
            println(i)
        }

    }
}