package medium

class DeleteAndEarn_740 {

    fun deleteAndEarn(nums: IntArray): Int {
        var maxVal = 0
        nums.forEach {
            maxVal = Math.max(maxVal,it)
        }
        val sum = IntArray(maxVal + 1) {
            0
        }
        nums.forEach {
            sum[it] += it
        }
        return rob(sum)
    }

    private fun rob(sum: IntArray): Int {
        val size = sum.size
        var first = sum[0]
        var second = Math.max(sum[0],sum[1])
        for (i in 2 until size ){
            var temp = second
            second = Math.max(first + sum[i],second)
            first = temp
        }
        return second
    }


    fun exe(){
        print(deleteAndEarn(intArrayOf(2,2,3,3,3,4)))
    }
}