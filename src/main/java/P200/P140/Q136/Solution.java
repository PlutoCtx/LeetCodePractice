package P200.P140.Q136;

/**
 * LeetCodePractice
 * 只出现一次的数字
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/3/17 0:41
 * @since JDK17
 */

public class Solution {

    /**
     * 执行用时分布 0 ms
     * 击败 100.00% 使用 Java 的用户
     * 消耗内存分布 43.23 MB
     * 击败 97.92% 使用 Java 的用户
     * @param nums  数组
     * @return  pass
     */
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int num : nums){
            res ^= num;
        }
        return res;
    }
}
