package easy

class BestTime2BuySellStock2_122 {

    fun maxProfit(prices: IntArray): Int {
        var profit = 0
        for (i in 1 until  prices.size){
            var tmp = prices[i] - prices[i - 1]
            if (tmp > 0){
                profit += tmp
            }
        }

        return profit
    }

}