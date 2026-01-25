class Solution {
    fun maxProfit(prices: IntArray): Int {
        var result = 0
        for (i in 1 until prices.size)
            result += maxOf(prices[i] - prices[i - 1], 0)
        return result
    }
}