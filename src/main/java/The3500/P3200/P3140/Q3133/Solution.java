package The3500.P3200.P3140.Q3133;

/**
 * LeetCodePractice
 * 数组最后一个元素的最小值
 *
 * @author PlutoCtx    ctx195467@163.com
 * @version 2024/8/22 18:40
 * @since JDK17
 */

public class Solution {

    public long minEnd(int n, int x) {

        long[] nums = new long[n];
        nums[0] = x;
        int count = 1;
        long temp = x + 1;

        while (count < n) {
            if ((temp & x) == x) {
                nums[count] = temp;
                count++;
            }
            temp++;
        }

        return nums[n - 1];
    }



}
