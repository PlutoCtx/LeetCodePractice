package The1000.P800.P740.Q724;

/**
 * LeetCodePractice
 * 寻找数组的中心下标
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/3/18 13:55
 * @since JDK17
 */

public class Solution {
    /**
     * 执行用时分布 1 ms
     * 击败 60.60% 使用 Java 的用户
     * 消耗内存分布 44.17 MB
     * 击败 67.13% 使用 Java 的用户
     * @param nums  数组
     * @return  中心下标
     */
    public int pivotIndex(int[] nums) {
        int len = nums.length;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int half = 0;
        for (int i = 0; i < len; i++) {
            if (half * 1.0 == 1.0 * (sum - nums[i]) / 2) {
                return i;
            }
            half += nums[i];
        }
        return -1;
    }
}
