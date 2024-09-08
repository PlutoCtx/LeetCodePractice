package The1000.P1000.P1000.P920.Q912;

/**
 * LeetCodePractice
 * 排序数组
 *
 * @author PlutoCtx    ctx195467@163.com
 * @version 2024/9/8 22:07
 * @since JDK17
 */

public class Solution {

    /**
     * 排序数组
     * <p>
     *     插入排序
     * 执行用时分布 2497 ms
     * 击败 5.02%
     * 消耗内存分布 54.37 MB
     * 击败 84.49%
     * </p>
     * @param nums      原始数组
     * @return          排序后的数组
     */
    public int[] sortArray(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int currentNumber = nums[i];

            int j = i - 1;
            while (j >= 0 && currentNumber < nums[j]) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = currentNumber;
        }
        return nums;
    }





}
