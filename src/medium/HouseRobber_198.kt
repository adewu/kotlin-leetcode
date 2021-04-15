package medium

class HouseRobber_198 {

    fun rob(nums: IntArray): Int {
        if(nums.isEmpty()){
            return 0
        }

        //子问题
        //f(k)=[0..k)房间中的最大金额
        //f(0) = 0
        //f(1) = nums[0]
        //f(k) = max{rob(k - 1),nums[k - 1] + rob(k - 2) }

        val N = nums.size
        val dp = IntArray(N + 1){0}
        dp[0] = 0
        dp[1] = nums[0]
        for (i in 2 .. N){
            dp[i] = Math.max(dp[i - 1],nums[i - 1] + dp[i - 2])
        }
        return dp[N]
    }

    fun exe(){
        print(rob(intArrayOf(2,7,9,3,1)))
    }

}