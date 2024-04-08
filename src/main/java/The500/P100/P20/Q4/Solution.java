package The500.P100.P20.Q4;

/**
 * LeetCodePractice
 * 寻找两个正序数组的中位数
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/4/9 7:08
 * @since JDK17
 */

public class Solution {

    /**
     * 执行用时分布 21 ms
     * 击败 5.14% 使用 Java 的用户
     * 消耗内存分布 44.70 MB
     * 击败 87.02% 使用 Java 的用户
     * @param nums1     正序数组1
     * @param nums2     正序数组2
     * @return  两数组中位数
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int l = l1 + l2;
        int[] total = new int[l];

        System.arraycopy(nums1, 0, total, 0, l1);
        System.arraycopy(nums2, 0, total, 0 + l1, l2);


        for (int i = 0; i < l - 1; i++) {
            for (int j = i + 1; j < l; j++) {
                if (total[j] < total[i]) {
                    int temp = total[j];
                    total[j] = total[i];
                    total[i] = temp;
                }
            }
        }

        if (l % 2 == 0) {
            return 1.0 * (total[l / 2 - 1] + total[l / 2]) / 2;
        } else {
            return 1.0 * (total[l / 2]);
        }

    }
}
