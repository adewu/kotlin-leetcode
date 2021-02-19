package medium

class MaxConsecutiveOnesIII_1004 {

    fun longestOnes(A: IntArray, K: Int): Int {
        val length = A.size
        var res = 0
        var left = 0
        var right = 0
        var zeros = 0
        while (right < length) {
            if (A[right] == 0) {
                zeros++
            }
            while (zeros > K) {
                if (A[left++] == 0) {
                    zeros--
                }
            }
            res = Math.max(res, right - left + 1)
            right++
        }
        return res
    }

    fun exe() {
        longestOnes(intArrayOf(1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0), 2)
    }
}