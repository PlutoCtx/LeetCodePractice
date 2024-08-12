package The500.P100.P100.Q88;

/**
 * LeetCodePractice
 * 合并两个有序数组
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/4/7 22:21
 * @since JDK17
 */

public class Solution {




    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums01 = new int[m];
        for (int i = 0; i < m; i++) {
            nums01[i] = nums1[i];
        }

        int i = 0;
        int j = 0;
        while (i < m || j < n) {
            if (i == m) {
                nums1[i + j] = nums2[j];
            } else if (j == n) {
                nums1[i + j] = nums01[i];
            } else if (nums01[i] <= nums2[j]) {
                nums1[i + j] = nums01[i];
                i++;
            } else {
                nums1[i + j] = nums2[j];
                j++;
            }
        }
    }

//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        int len1 = m - 1;
//        int len2 = n - 1;
//        int len = m + n - 1;
//        while(len1 >= 0 && len2 >= 0) {
//            // 注意--符号在后面，表示先进行计算再减1，这种缩写缩短了代码
//            nums1[len--] = nums1[len1] > nums2[len2] ? nums1[len1--] : nums2[len2--];
//        }
//        // 表示将nums2数组从下标0位置开始，拷贝到nums1数组中，从下标0位置开始，长度为len2+1
//        System.arraycopy(nums2, 0, nums1, 0, len2 + 1);
//    }



}
