package The500.P100.P60.Q53;

/**
 * LeetCodePractice
 * 最大子数组和
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/4/3 9:39
 * @since JDK17
 */

public class Solution {

    public int maxSubArray(int[] nums) {
        int pre = 0;
        int res = nums[0];
        for (int num : nums) {
            pre = Math.max(pre + num, num);
            res = Math.max(res, pre);
        }
        return res;
    }
}


