package easy


class FindPivotIndex_724 {

    fun pivotIndex(nums: IntArray): Int {
        val length = nums.size
        var ret = -1
        if (length < 3) {
            return ret
        }

        val record = IntArray(nums.size) { 0 }

        ret = rec(nums, 0, record)

        return ret
    }


    private fun rec(nums: IntArray, index: Int, record: IntArray): Int {
        if (index in nums.indices) {
            if (record[index] != 0) {
                return -1
            }
            val i = nums[index]
            var left = 0
            var right = 0
            for (i in 0 until index) {
                left += nums[i]
            }

            for (i in index + 1 until nums.size) {
                right += nums[i]
            }
            record[index] = 1
            if (left == right) {
                print(index)
                return index
            } else {
                val left = rec(nums, index - 1, record)
                val right = rec(nums, index + 1, record)
                if (left != -1){
                    return left
                }
                if (right != -1){
                    return right
                }
                return -1
            }
        } else {
            return -1
        }

    }

    fun exe() {
        print(pivotIndex(intArrayOf(-1,1,-1,-1,0,1)))
    }
}