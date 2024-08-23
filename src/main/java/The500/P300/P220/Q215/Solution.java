package The500.P300.P220.Q215;

/**
 * LeetCodePractice
 * 数组中的第 K 个最大元素
 *
 * @author PlutoCtx    ctx195467@163.com
 * @version 2024/8/16 23:04
 * @since JDK17
 */

public class Solution {



    public int findKthLargest(int[] nums, int k) {
        for (int i = 0; i < nums.length - 1; i++) {
            int maxIndex = i;
            int minIndex = i;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[maxIndex] < nums[j]) {
                    maxIndex = j;
                }

                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }

            if (minIndex == maxIndex) {
                break;
            }

            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;

            if (maxIndex == i) {
                maxIndex = minIndex;
            }

            int lastIndex = nums.length - 1 - i;
            temp = nums[lastIndex];
            nums[lastIndex] = nums[maxIndex];
            nums[maxIndex] = temp;

//            if (k == i + 1) {
//                return nums[i];
//            }
        }

        System.out.println("************************");
        for (int num : nums) {
            System.out.printf(num + "\t");
        }
        System.out.println();
        System.out.println(nums[k - 1]);
        return nums[k - 1];
    }












}
