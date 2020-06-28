package medium

class MinimumSizeSubarraySum_209 {

    fun minSubArrayLen(s: Int, nums: IntArray): Int {
        var low = 0
        var high = 0
        var sum = 0
        var min = Integer.MAX_VALUE

        while (high < nums.size) {
            sum += nums[high++]
            while (sum >= s) {
                min = min.coerceAtMost(high - low)
                sum -= nums[low++]
            }
        }

        return if (min == Integer.MAX_VALUE) 0 else min
    }

    fun minSubArrayLenViolence(s: Int, nums: IntArray): Int {

        var counter = nums.size + 1
        for (i in nums.indices) {
            var tempCounter = 0
            var sum = 0
            for (j in i until nums.size) {
                sum += nums[j]
                tempCounter++
                if (sum >= s) {
                    if (tempCounter < counter) {
                        counter = tempCounter
                    }
                    break
                }
            }
        }

        if (counter == nums.size + 1) {
            counter = 0
        }

        return counter
    }

    fun exe() {
        minSubArrayLen(15, intArrayOf(1, 2, 3, 4, 5))
    }
}