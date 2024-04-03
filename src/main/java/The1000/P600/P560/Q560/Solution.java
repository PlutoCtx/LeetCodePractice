package The1000.P600.P560.Q560;

/**
 * LeetCodePractice
 * 和为K的子数组
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/4/3 9:46
 * @since JDK17
 */

public class Solution {

    public int subarraySum(int[] nums, int k) {
        int len = nums.length;
        int count = 0;
        for (int left = 0; left < len; left++) {
            for (int right = left; right < len; right++) {

                int sum = 0;
                for (int i = left; i <= right; i++) {
                    sum += nums[i];
                }
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

//    public static void main(String[] args) {
//        int[] nums = new int[]{1, 1, 1};
//        int k = 2;
//        Solution solution = new Solution();
//        int res = solution.subarraySum(nums, k);
//        System.out.println(res);
//    }
}


