package The500.P100.P60.Q42;

/**
 * LeetCodePractice
 * 接雨水
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/4/4 23:18
 * @since JDK17
 */

public class Solution {

    public int trap(int[] height) {
        int sum = 0;
        int maxLeft = 0;
        int maxRight = 0;
        int left = 1;
        // 加右指针进去
        int right = height.length - 2;
        for (int i = 1; i < height.length - 1; i++) {
            //从左到右更
            if (height[left - 1] < height[right + 1]) {
                maxLeft = Math.max(maxLeft, height[left - 1]);
                int min = maxLeft;
                if (min > height[left]) {
                    sum = sum + (min - height[left]);
                }
                left++;
                //从右到左更
            } else {
                maxRight = Math.max(maxRight, height[right + 1]);
                int min = maxRight;
                if (min > height[right]) {
                    sum = sum + (min - height[right]);
                }
                right--;
            }
        }
        return sum;
    }


}
