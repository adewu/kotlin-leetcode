package medium

class PartitionEqualSubsetSum_416 {

    fun canPartition1(nums: IntArray): Boolean {
        nums.sort()
        val ints = nums.copyOf()
        var last = 0
        for (i in nums.size - 1 downTo 0){
            ints[i] = -1
            last += nums[i] // 11
            var prev = 0
            for (j in 0 until i ){
                prev += nums[j]
                ints[j] = -1
                if (last == prev){
                    var allMeet = true
                    for (k in ints.indices){
                        if (ints[k] != -1){
                            allMeet = false
                            break
                        }
                    }
                    if (allMeet){
                        return true
                    }
                }
            }
        }
        return false
    }


    fun exe(){
        print(canPartition(intArrayOf(1,5,11,5)))
    }

    private fun canPartition(nums: IntArray): Boolean {
        val len = nums.size
        if (len == 0){
            return false
        }
        var sum = 0
        nums.forEach {
            sum += it
        }
        if ((sum % 2) != 0){
            return false
        }
        val target = sum / 2

        val dp = Array(len){
            Array(target + 1){
                false
            }
        }

        if (nums[0] <= target){
            dp[0][nums[0]] = true
        }
        for (i in 1 until len){
            for (j in 0 .. target){
                dp[i][j] = dp[i - 1][j]

                if (nums[i] == j){
                    dp[i][j] = true
                    continue
                }
                if (nums[i] < j){
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - nums[i]]
                }
            }
        }
        return dp[len - 1][target]
    }
}