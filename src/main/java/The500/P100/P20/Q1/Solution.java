package The500.P100.P20.Q1;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCodePractice
 * 两数之和
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/3/17 0:03
 * @since JDK17
 */

public class Solution {
    /**
     * 执行用时分布55ms
     * 击败16.56%使用 Java 的用户
     * 消耗内存分布43.79MB
     * 击败55.03%使用 Java 的用户
     * @param nums  传入的数组
     * @param target    目标数字
     * @return  传入数组目标数字的下标
     */
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return res;
    }


    /**
     * Official solution
     * 执行用时分布 2 ms
     * 击败 96.28% 使用 Java 的用户
     * 消耗内存分布 44.09 MB
     * 击败 10.35% 使用 Java 的用户
     *
     * @param nums  pass
     * @param target    pass
     * @return  pass
     */
    public int[] twoSumOfficialSolution(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }
}
