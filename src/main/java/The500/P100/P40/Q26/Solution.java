package The500.P100.P40.Q26;

/**
 * LeetCodePractice
 * 删除有序数组中的重复项
 *
 * @author PlutoCtx    ctx195467@163.com
 * @version 2024/8/12 23:16
 * @since JDK17
 */

public class Solution {



    public int removeDuplicates(int[] nums) {
        int ans = nums.length;

        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return 1;
        } else {
//            int k = 0;
//            while (k < nums.length - 1) {
//                if (nums[k] == nums[k + 1]) {
//                    moveDuplicates(nums, k);
//                    ans--;
//                } else {
//                    k++;
//                    ans--;
//                }
//            }
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == nums[i + 1]) {
                    moveDuplicates(nums, i);
                    ans--;
                }
            }
        }
        return ans;
    }

    private void moveDuplicates(int[] nums, int i) {
        int temp = nums[i + 1];
        for (int j = i + 1; j < nums.length - 1; j++) {
            nums[j] = nums[j + 1];
        }
        nums[nums.length - 1] = temp;
    }


}
