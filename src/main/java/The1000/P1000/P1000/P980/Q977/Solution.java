package The1000.P1000.P1000.P980.Q977;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCodePractice
 * 有序数组的平方
 *
 * @author PlutoCtx    ctx195467@163.com
 * @version 2024/9/8 8:28
 * @since JDK17
 */

public class Solution {

    /**
     * 有序数组的平方
     * <p>
     *      执行用时分布 344 ms
     *      击败 5.02%
     *      消耗内存分布 45.44 MB
     *      击败  90.84%
     * </p>
     * @param nums      原始数组，有正有负
     * @return          原数组的平方，并完成升序排序
     */
    public int[] sortedSquares(int[] nums) {
        List<Integer> squareNumber = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            squareNumber.add(nums[i] * nums[i]);
        }
        int[] res = squareNumber.stream().filter(integer -> integer != null).mapToInt(i -> i).toArray();

        sortList(res);
        return res;
//        int[] result = new int[res.length];
//        int leftIndex = 0;
//        int rightIndex = 0;
//        int minIndex = 0;
//        for (int i = 0; i < res.length; i++) {
//            if (res[i] < nums[minIndex]) {
//                minIndex = i;
//            }
//        }
//
//        if (minIndex != res.length - 1) {
//            rightIndex = minIndex + 1;
//        } else {
//            for (int i = res.length - 1; i >= 0; i--) {
//                result[res.length - 1 - i] = res[i];
//            }
//            return result;
//        }
//
//        if (minIndex != 0) {
//            leftIndex = minIndex - 1;
//        } else {
//            return res;
//        }
//
//        result[0] = res[minIndex];
//        int i = 1;
//        while (leftIndex >= 0 || rightIndex < res.length) {
//            if (rightIndex < res.length && res[leftIndex] >= res[rightIndex]) {
//                result[i] = res[rightIndex];
//                rightIndex ++;
//            } else {
//                result[i] = res[leftIndex];
//                leftIndex --;
//            }
//            i++;
//        }
//
//        return result;
    }

    private void sortList(int[] arr) {

        int minIndex, maxIndex;
        // i 只需要遍历一半
        for (int i = 0; i < arr.length / 2; i++) {
            minIndex = i;
            maxIndex = i;
            for (int j = i + 1; j < arr.length - i; j++) {
                if (arr[minIndex] > arr[j]) {
                    // 记录最小值的下标
                    minIndex = j;
                }
                if (arr[maxIndex] < arr[j]) {
                    // 记录最大值的下标
                    maxIndex = j;
                }
            }
            // 如果 minIndex 和 maxIndex 都相等，那么他们必定都等于 i，且后面的所有数字都与 arr[i] 相等，此时已经排序完成
            if (minIndex == maxIndex) {
                break;
            }
            // 将最小元素交换至首位
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
            // 如果最大值的下标刚好是 i，由于 arr[i] 和 arr[minIndex] 已经交换了，所以这里要更新 maxIndex 的值。
            if (maxIndex == i) {
                maxIndex = minIndex;
            }
            // 将最大元素交换至末尾
            int lastIndex = arr.length - 1 - i;
            temp = arr[lastIndex];
            arr[lastIndex] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }


}
