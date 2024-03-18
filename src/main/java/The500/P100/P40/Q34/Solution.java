package The500.P100.P40.Q34;

/**
 * LeetCodePractice
 * 在排序数组中查找元素的第一个和最后一个位置
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/3/17 22:33
 * @since JDK17
 */

public class Solution {

    /**
     * 执行用时分布 1 ms
     * 击败 6.53% 使用 Java 的用户
     * 消耗内存分布 45.07 MB
     * 击败 9.59% 使用 Java 的用户
     * @param nums  非递减数组
     * @param target    目标
     * @return  位置下标
     */
    public int[] searchRange(int[] nums, int target) {
        int len = nums.length;
        int start = -1;
        int end = -1;
        for (int i = 0; i < len; i++) {
            if (nums[i] == target) {
                if (start < i && start == -1) {
                    start = i;
                }
            }
            if (nums[len - 1 - i] == target) {
                if (end == -1 && end < len - 1 - i) {
                    end = len - 1 - i;
                }
            }
            if (start != -1 && end != -1) {
                break;
            }
        }
        return new int[] {
            start, end
        };
    }


    /**
     * 执行用时分布 0 ms
     * 击败 100.00% 使用 Java 的用户
     * 消耗内存分布 44.86 MB
     * 击败 54.12% 使用 Java 的用户
     * @param nums  非递减数组
     * @param target    目标数字
     * @return  下标
     */
    public int[] searchRangeOfficialSolution(int[] nums, int target) {
        int leftIdx = binarySearch(nums, target, true);
        int rightIdx = binarySearch(nums, target, false) - 1;
        if (leftIdx <= rightIdx && rightIdx < nums.length && nums[leftIdx] == target && nums[rightIdx] == target) {
            return new int[]{leftIdx, rightIdx};
        }
        return new int[]{-1, -1};
    }

    public int binarySearch(int[] nums, int target, boolean lower) {
        int left = 0, right = nums.length - 1, ans = nums.length;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target || (lower && nums[mid] >= target)) {
                right = mid - 1;
                ans = mid;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
