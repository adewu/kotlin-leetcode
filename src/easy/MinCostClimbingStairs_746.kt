package easy

import kotlin.math.cos

class MinCostClimbingStairs_746 {

    fun minCostClimbingStairs(cost: IntArray): Int {
        val length = cost.size
        val dp = IntArray(length + 1)
        for (i in 2 .. length){
            dp[i] = Math.min(dp[i - 1]+ cost[i - 1],dp[i -2 ] + cost[i - 2])
        }
        return dp[length]
    }

    fun exe(){
        minCostClimbingStairs(intArrayOf(10,15,20))
    }
}