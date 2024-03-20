package The500.P200.P140.Q121;

/**
 * LeetCodePractice
 * 买卖股票的最佳时机
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/3/20 22:22
 * @since JDK17
 */

public class Solution {

    public int maxProfit(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice) {
                minprice = prices[i];
            } else if (prices[i] - minprice > maxprofit) {
                maxprofit = prices[i] - minprice;
            }
        }
        return maxprofit;
    }
}
