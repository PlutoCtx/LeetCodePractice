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

    /**
     * 求最大的面积
     * 题目提供了一个数组，表示容器的高度，要求找出两个柱子，使得它们之间的面积最大。
     * 执行用时分布4ms击败69.66%
     * 复杂度分析
     * 消耗内存分布56.57MB
     * 击败56.94%
     * @param height    高度
     * @return  最大面积
     */
    public int maxArea(int[] height) {
        /*
         * 双指针法
         * 从两端开始，比较两端的高度，高度较小的那一端向中间移动，直到两个指针相遇为止。
         * 这样的时间复杂度是O(n)，比暴力解法O(n^2)要快很多。
         */
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


//        69.66%    76.93%
//        public int maxArea(int[] height) {
//            int ans = 0, left = 0, right = height.length - 1;
//            while (left < right) {
//                int area = (right - left) * Math.min(height[left], height[right]);
//                ans = Math.max(ans, area);
//                if (height[left] < height[right]) ++left;
//                else --right;
//            }
//            return ans;
//        }



        /*
            时间超时
         */
//        int max = 0;
//        int length = height.length;
//        for (int i = 0; i < length - 1; i++) {
//            for (int j = i + 1; j < length; j++) {
//                int h = Math.min(height[i], height[j]);
//                int d = j - i;
//                max = Math.max(max, h * d);
//            }
//        }
//        return max;
    }

}

