package The1000.P1000.P1000.P980.Q976;

import java.util.Arrays;

/**
 * LeetCodePractice
 * 三角形的最大周长
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/3/22 17:36
 * @since JDK17
 */

public class Solution {



        public int largestPerimeter(int[] nums) {
            Arrays.sort(nums);
            int len = nums.length;
            for (int i = len - 1; i > 1; i--) {
                int a = nums[i];
                int b = nums[i - 1];
                int c = nums[i - 2];
                if (b + c > a) {
                    return a + b + c;
                }
            }
            return 0;
        }




}
