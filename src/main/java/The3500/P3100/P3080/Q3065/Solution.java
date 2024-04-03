package The3500.P3100.P3080.Q3065;

/**
 * LeetCodePractice
 * 超过阙值的最少操作数1
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/3/22 19:12
 * @since JDK17
 */

public class Solution {
    /**
     * 执行用时分布 0 ms
     * 击败 100.00% 使用 Java 的用户
     * 消耗内存分布 41.82 MB
     * 击败 37.24% 使用 Java 的用户
     * @param nums  数组
     * @param k 阙值
     * @return  最小操作数
     */
    public int minOperations(int[] nums, int k) {
        int res = 0;
        for (int num : nums) {
            if (num < k) {
                res++;
            }
        }
        return res;
    }
}
