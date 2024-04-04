package The500.P100.P20.Q11;

/**
 * LeetCodePractice
 * 盛最多水的容器
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/4/4 23:24
 * @since JDK17
 */

public class Solution {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int ans = 0;
        while (l < r) {
            int area = Math.min(height[l], height[r]) * (r - l);
            ans = Math.max(ans, area);
            if (height[l] <= height[r]) {
                ++l;
            }
            else {
                --r;
            }
        }
        return ans;
    }
}

