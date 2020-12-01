package medium

class FindFirstLastPositionElementSortedArray_34 {

    fun searchRange(nums: IntArray, target: Int): IntArray {
        val result = intArrayOf(-1, -1)
        if (nums.isEmpty()) {
            return result
        }

        var left = -1
        nums.forEachIndexed { index, i ->
            if (i == target && left == -1) {
                left = index
            }
        }
        if (left == -1) {
            return result
        }
        var right = -1
        for (i in nums.size - 1 downTo left) {
            if (nums[i] == target && right == -1){
                right = i;
            }
        }
        result[0] = left
        result[1] = right
        return result
    }

    fun exe() {
        searchRange(intArrayOf(5,7,7,8,8,10), 9)
    }
}