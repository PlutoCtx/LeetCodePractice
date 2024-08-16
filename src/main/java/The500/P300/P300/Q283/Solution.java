package The500.P300.P300.Q283;

/**
 * LeetCodePractice
 * 移动零
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/3/13 23:53
 * @since JDK17
 */

public class Solution {

    /**
     * 移动零
     * 将数组中所有的0都移动到最后，同时各个非零元素的相对位置不变
     * @param nums  数组
     */
    public void moveZeroes(int[] nums) {
        boolean swapped;
        for (int i = 0; i < nums.length - 1; i++) {
            swapped = false;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == 0) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }

        }

    }
}
