package P1900.P1840.Q1822;

/**
 * LeetCodePractice
 * 数组元素积的符号
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/3/13 23:55
 * @since JDK17
 */

public class Solution {

    public int arraySign(int[] nums) {
        int res = 1;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0){
                res = res * 1;
            } else if (nums[i] == 0) {
                res = 0;
                return 0;
            } else if (nums[i] < 0) {
                res = res * (-1);
            }
        }
        return res;

    }

}
