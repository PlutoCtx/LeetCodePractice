package The500.P300.P220.Q215;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * LeetCodePractice
 * 数组中的第 K 个最大元素
 *
 * @author PlutoCtx    ctx195467@163.com
 * @version 2024/8/16 23:04
 * @since JDK17
 */

public class Solution {


    /**
     * 数组中的第k个最大元素
     * 执行用时分布 86 ms
     * 击败 16.67%
     * 消耗内存分布 56.23 MB
     * 击败 50.70%
     * <p></p>
     * 取巧了，建议还是在仔细看看
     * 我记得这种找数组中第k大的数，有一种排序算法好像挺适合的，但是我忘记了
     * @param nums      数组，无序
     * @param k         k
     * @return          数组中第k大的数
     */
    public int findKthLargest(int[] nums, int k) {

        List<Integer> intList = new ArrayList<>();
        for (int num : nums) {
            intList.add(num);
        }
        Collections.sort(intList);
        System.out.println(intList);
        return intList.get(nums.length - k);



//        for (int i = 0; i < nums.length - 1; i++) {
//            int maxIndex = i;
//            int minIndex = i;
//
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[maxIndex] < nums[j]) {
//                    maxIndex = j;
//                }
//
//                if (nums[minIndex] > nums[j]) {
//                    minIndex = j;
//                }
//            }
//
//            if (minIndex == maxIndex) {
//                break;
//            }
//
//            int temp = nums[i];
//            nums[i] = nums[minIndex];
//            nums[minIndex] = temp;
//
//            if (maxIndex == i) {
//                maxIndex = minIndex;
//            }
//
//            int lastIndex = nums.length - 1 - i;
//            temp = nums[lastIndex];
//            nums[lastIndex] = nums[maxIndex];
//            nums[maxIndex] = temp;
//
////            if (k == i + 1) {
////                return nums[i];
////            }
//        }
//
//        System.out.println("************************");
//        for (int num : nums) {
//            System.out.printf(num + "\t");
//        }
//        System.out.println();
//        System.out.println(nums[k - 1]);
//        return nums[k - 1];
    }












}
