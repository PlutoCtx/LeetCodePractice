package P300.P240.Q238;

/**
 * LeetCodePractice
 * 除自身以外数组的乘积
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/3/18 14:28
 * @since JDK17
 */

public class Solution {

    /**
     * 执行用时分布 1 ms
     * 击败 100.00% 使用 Java 的用户
     * 消耗内存分布 52.14 MB
     * 击败 45.58% 使用 Java 的用户
     * @param nums  待乘数组
     * @return  除自身以外数组的乘积
     */
    public int[] productExceptSelf(int[] nums) {
        int multiplier = 1;
        for (int num : nums) {
            multiplier *= num;
        }
        int[] res = new int[nums.length];
        if (multiplier != 0) {
            for (int i = 0; i < nums.length; i++) {
                res[i] = multiplier / nums[i];
            }
            return res;
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    res[i] = 0;
                } else {
                    int temp = 1;
                    for (int j = 0; j < nums.length; j++) {
                        if (j != i) {
                            temp *= nums[j];
                        }
                    }
                    res[i] = temp;
                }
            }
            return res;
        }
    }


    /**
     * 执行用时分布 1 ms
     * 击败 100.00% 使用 Java 的用户
     * 消耗内存分布 51.47 MB
     * 击败 89.18% 使用 Java 的用户
     * @param nums  待乘数组
     * @return  除自身以外数组的乘积
     */
    public int[] productExceptSelfOfficialSolution(int[] nums) {
        int length = nums.length;

        // L 和 R 分别表示左右两侧的乘积列表
        int[] L = new int[length];
        int[] R = new int[length];

        int[] answer = new int[length];

        // L[i] 为索引 i 左侧所有元素的乘积
        // 对于索引为 '0' 的元素，因为左侧没有元素，所以 L[0] = 1
        L[0] = 1;
        for (int i = 1; i < length; i++) {
            L[i] = nums[i - 1] * L[i - 1];
        }

        // R[i] 为索引 i 右侧所有元素的乘积
        // 对于索引为 'length-1' 的元素，因为右侧没有元素，所以 R[length-1] = 1
        R[length - 1] = 1;
        for (int i = length - 2; i >= 0; i--) {
            R[i] = nums[i + 1] * R[i + 1];
        }

        // 对于索引 i，除 nums[i] 之外其余各元素的乘积就是左侧所有元素的乘积乘以右侧所有元素的乘积
        for (int i = 0; i < length; i++) {
            answer[i] = L[i] * R[i];
        }
        return answer;
    }



}
