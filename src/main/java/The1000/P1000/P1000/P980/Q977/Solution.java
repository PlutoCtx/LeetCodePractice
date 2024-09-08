package The1000.P1000.P1000.P980.Q977;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCodePractice
 * 有序数组的平方
 *
 * @author PlutoCtx    ctx195467@163.com
 * @version 2024/9/8 8:28
 * @since JDK17
 */

public class Solution {

    /**
     * 官方的代码，在时间复杂度这一块确实没话说
     * @param nums      原始数组，有正有负
     * @return          原数组的平方，并完成升序排序
     */
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int negative = -1;
        for (int i = 0; i < n; ++i) {
            if (nums[i] < 0) {
                negative = i;
            } else {
                break;
            }
        }

        int[] ans = new int[n];
        int index = 0, i = negative, j = negative + 1;
        while (i >= 0 || j < n) {
            if (i < 0) {
                ans[index] = nums[j] * nums[j];
                ++j;
            } else if (j == n) {
                ans[index] = nums[i] * nums[i];
                --i;
            } else if (nums[i] * nums[i] < nums[j] * nums[j]) {
                ans[index] = nums[i] * nums[i];
                --i;
            } else {
                ans[index] = nums[j] * nums[j];
                ++j;
            }
            ++index;
        }

        return ans;
    }


}
