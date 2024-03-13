package P300.P300.Q283;
/**
 * LeetCodePractice
 *     public void moveZeroes(int[] nums) {         int numsLength = nums.length;          for(int i = 0; i < numsLength - 1; i++) {             for(int j = 0; j < numsLength - 1; j++) {                 int temp;                 if(nums[j] == 0) {                     temp = nums[j];                     nums[j] = nums[j + 1];                     nums[j + 1] = temp;                 }             }         }     }
 * 
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/3/13 23:53
 * @since JDK17
 */

public class Solution {
}
