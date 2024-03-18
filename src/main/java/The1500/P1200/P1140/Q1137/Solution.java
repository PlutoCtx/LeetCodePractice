package The1500.P1200.P1140.Q1137;

/**
 * LeetCodePractice
 * 第 N 个泰波那契数
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/3/18 15:16
 * @since JDK17
 */

public class Solution {

    /**
     * 执行用时分布 0 ms
     * 击败 100.00% 使用 Java 的用户
     * 消耗内存分布 39.44 MB
     * 击败 20.18% 使用 Java 的用户
     * @param n     第 n 个泰波那契数
     * @return  第 n 个泰波那契数
     */
    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {

            int[] count = new int[n];
            count[0] = 0;
            count[1] = 1;
            count[2] = 1;
            for (int i = 3; i < n; i++) {
                count[i] = count[i - 1] + count[i - 2] + count[i - 3];
            }
            return count[n - 1] + count[n - 2] + count[n - 3];
        }
    }

}
