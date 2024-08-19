package The500.P100.P80.Q70;

/**
 * LeetCodePractice
 * 爬楼梯
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/8/20 0:39
 * @since JDK17
 */
 
public class Solution {

    /**
     * 爬楼梯
     * 每次只能爬一级或者两级楼梯，共n级，有几种方案
     * </p>
     * 执行用时分布0ms
     * 击败100.00%
     * 复杂度分析
     * 消耗内存分布39.24MB
     * 击败86.80%
     * @param n 楼梯数
     * @return  方案
     */
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            int[] dp = new int[n];
            dp[0] = 1;
            dp[1] = 2;
            for (int i = 2; i < n; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
            return dp[n - 1];
        }

    }
}
