package The1000.P700.P700.Q682;

/**
 * LeetCodePractice
 * 棒球比赛
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/3/31 23:55
 * @since JDK17
 */

class Solution {
    static int[] nums = new int[1010];
    public int calPoints(String[] ops) {
        int n = ops.length, idx = 0;
        for (int i = 0; i < n; i++, idx++) {
            if (ops[i].equals("+")) {
                nums[idx] = nums[idx - 1] + nums[idx - 2];
            } else if (ops[i].equals("D")) {
                nums[idx] = nums[idx - 1] * 2;
            } else if (ops[i].equals("C")) {
                idx -= 2;
            } else {
                nums[idx] = Integer.parseInt(ops[i]);
            }
        }
        int ans = 0;
        for (int i = 0; i < idx; i++) {
            ans += nums[i];
        }
        return ans;
    }
}


