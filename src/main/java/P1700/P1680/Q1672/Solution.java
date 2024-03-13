package P1700.P1680.Q1672;

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
        int temp = 0;
        int m = accounts.length;
        int n = accounts[0].length;
        for(int i = 0; i < m; i++) {
            temp = 0;
            for(int j = 0; j < n; j++) {
                temp += accounts[i][j];
            }
            if(max < temp) {
                max = temp;
            }
        }
        return max;
    }
}
