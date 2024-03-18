package The2000.P1700.P1680.Q1672;

/**
 * LeetCodePractice
 * 最富有的客户资产总量
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/3/14 0:01
 * @since JDK17
 */

public class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        int temp;
        int n = accounts[0].length;
        for (int[] account : accounts) {
            temp = 0;
            for (int j = 0; j < n; j++) {
                temp += account[j];
            }
            if (max < temp) {
                max = temp;
            }
        }
        return max;
    }
}
