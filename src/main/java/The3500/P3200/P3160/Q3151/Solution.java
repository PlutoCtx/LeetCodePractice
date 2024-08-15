package The3500.P3200.P3160.Q3151;

/**
 * LeetCodePractice
 * 特殊数组 I
 *
 * @author PlutoCtx    ctx195467@163.com
 * @version 2024/8/15 22:47
 * @since JDK17
 */

public class Solution {


    /**
     * 特殊数组：
     * 该数组中元素相邻之间奇偶性是否都不同
     * @param nums  完整的数组
     * @return  是不是特殊数组
     */
    public boolean isArraySpecial(int[] nums) {

        if (nums.length < 2) {
            return true;
        }

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] % 2 == nums[i + 1] % 2) {
                return false;
            }
        }
        return true;
    }





}
