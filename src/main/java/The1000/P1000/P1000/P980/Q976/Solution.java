package The1000.P1000.P1000.P980.Q976;

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
        int len = nums.length;
        int max = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                for (int k = j + 1; j < len; j++) {
                    if (isTriangle(i, j, k)) {
                        if (max < nums[i] + nums[j] + nums[k]) {
                            max = nums[i] + nums[j] + nums[k];
                        }
                    }
                }
            }
        }
        return max;

    }

    public boolean isTriangle(int a, int b, int c) {
        if (a > 0 && b > 0 && c > 0) {
            return a + b > c && a + c > b && b + c > a;
        } else {
            return false;
        }
    }

}
