package The500.P200.P180.Q163;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * LeetCodePractice
 * 缺失的区间
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/4/2 10:31
 * @since JDK17
 */


class Solution {
    public List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
        List<List<Integer>> ranges = new ArrayList<>();

        // 遍历nums中的数字
        for (int num : nums) {
            if (lower < num) {
                // 将区间[lower, num-1]添加进结果集
                ranges.add(Arrays.asList(lower, num - 1));
            }
            lower = num + 1;
        }

        // 遍历完nums之后 如果发现lower依然小于upper
        // 说明这段是缺失的，添加进结果集
        if (lower <= upper) {
            ranges.add(Arrays.asList(lower, upper));
        }

        return ranges;
    }
}



