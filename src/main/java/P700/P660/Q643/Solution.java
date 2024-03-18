package P700.P660.Q643;

/**
 * LeetCodePractice
 * 子数组最大平均数 I
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/3/18 15:30
 * @since JDK17
 */

public class Solution {

    /**
     * 执行用时分布 5 ms
     * 击败 30.58% 使用 Java 的用户
     * 消耗内存分布 54.48 MB
     * 击败 81.00% 使用 Java 的用户
     * @param nums  数组
     * @param k 最长
     * @return  最大平均数
     */
    public double findMaxAverage(int[] nums, int k) {
        double temp = 0.0;
        double res;

        for (int i = 0; i < k; i++) {
            temp += nums[i];
        }
        res = temp / k;

        for (int i = k; i < nums.length; i++) {
            temp = temp - nums[i - k] + nums[i];
            res = Math.max(res, temp);
        }
        return res / k;
    }


    /**
     * 执行用时分布 2 ms
     * 击败 100% 使用 Java 的用户
     * 消耗内存分布 54.66 MB
     * 击败 61.90% 使用 Java 的用户
     * @param nums  数组
     * @param k 最长
     * @return  最大平均数
     */
    public double findMaxAverageOfficialSolution(int[] nums, int k) {
        int sum = 0;
        int n = nums.length;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int maxSum = sum;
        for (int i = k; i < n; i++) {
            sum = sum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, sum);
        }
        return 1.0 * maxSum / k;
    }

}
