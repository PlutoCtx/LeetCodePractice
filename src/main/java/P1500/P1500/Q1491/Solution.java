package P1500.P1500.Q1491;

/**
 * LeetCodePractice
 * 去掉最低工资和最高工资后的工资平均值
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/3/14 11:11
 * @since JDK17
 */

public class Solution {
    public double average(int[] salary) {
        int max = salary[0];
        int min = salary[0];
        int len = salary.length;
        double sum = 0;
        for (int j : salary) {
            sum += j;
            if (j > max) {
                max = j;
            }
            if (j < min) {
                min = j;
            }
        }
        return (sum - max - min) / (len - 2);
    }
}
