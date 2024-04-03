package The500.P200.P140.Q128;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * LeetCodePractice
 * 最长连续序列
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/4/3 9:31
 * @since JDK17
 */

public class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        // 存储出现过的数字和长度
        Map<Integer, Integer> map = new HashMap<>();
        int res = 1;
        // 排序
        Arrays.sort(nums);
        for (int num : nums) {
            int temp = 0;
            if (map.containsKey(num - 1)) {
                // 如果出现过
                int l = map.get(num - 1);
                map.put(num, l + 1);
                res = Math.max(res, l + 1);
            } else {
                // 未出现过的话
                map.put(num, 1);
            }
        }
        return res;
    }
}


