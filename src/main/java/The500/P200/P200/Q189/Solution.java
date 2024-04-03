package The500.P200.P200.Q189;

/**
 * LeetCodePractice
 * 轮转数组
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/4/3 9:36
 * @since JDK17
 */

public class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start += 1;
            end -= 1;
        }
    }
}

