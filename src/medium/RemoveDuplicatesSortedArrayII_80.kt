package medium

class RemoveDuplicatesSortedArrayII_80 {

    fun removeDuplicates(nums: IntArray): Int {

        var res = 0

        if (nums.isEmpty()) {
            return 0
        }
        var prev = nums[0]
        var prevNum = 1
        for (i in 1 until nums.size) {
            if (nums[i] == prev) {
                if (prevNum >= 2) {
                    nums[i] = 100000
                    res++
                } else {
                    prevNum++
                }
            } else {
                prev = nums[i]
                prevNum = 1
            }
        }

        var j = 0
        while (j < nums.size) {
            if (nums[j] == 100000) {
                var k = j + 1
                while (k < nums.size) {
                    if (nums[k] != 100000) {
                        val temp = nums[j]
                        nums[j] = nums[k]
                        nums[k] = temp
                        break
                    }
                    k++
                }
            }
                j++
        }


        return nums.size - res
    }

    fun exe() {
        print(removeDuplicates(intArrayOf(1,1,1,2,2,3)))
    }
}