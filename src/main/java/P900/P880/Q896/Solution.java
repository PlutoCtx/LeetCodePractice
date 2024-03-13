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


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {1, 2, 2, 3};
        System.out.println(solution.isMonotonic(nums1));

        int[] nums2 = {6, 5, 4, 4};
        System.out.println(solution.isMonotonic(nums2));


        int[] nums3 = {1, 3, 2};
        System.out.println(solution.isMonotonic(nums3));
    }
}
