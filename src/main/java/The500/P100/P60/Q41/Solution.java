package The500.P100.P60.Q41;

/**
 * LeetCodePractice
 * 缺失的第一个正数
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/4/3 9:35
 * @since JDK17
 */

public class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        for(int i = 0; i < n; i ++){
            while(nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]){
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
                //由于nums[i] - 1依赖于nums[i]因此以下这种交换规则是错误的，期间nums[i]已经改变了
                // int temp = nums[i];
                // nums[i] = nums[nums[i] - 1];
                // nums[nums[i] - 1] = temp;
            }
        }

        for(int i = 0; i < n; i ++){
            if(nums[i] != i + 1){
                return i + 1;
            }
        }

        return n + 1;
    }
}


