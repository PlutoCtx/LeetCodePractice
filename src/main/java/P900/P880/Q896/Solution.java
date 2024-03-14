package P900.P880.Q896;

/**
 * LeetCodePractice
 * 单调数列
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/3/12 23:27
 * @since JDK17
 */

public class Solution {

    public boolean isMonotonic(int[] nums) {
        boolean flag = true;
        if (nums.length <= 2) {
            return true;
        } else if (nums[0] <= nums[nums.length - 1]) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    flag = false;
                }
            }
        } else if (nums[0] > nums[nums.length - 1]) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] < nums[i + 1]) {
                    flag = false;
                }
            }
        }
        return flag;
    }
}
