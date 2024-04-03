package The500.P300.P240.Q239;

import java.util.Deque;
import java.util.LinkedList;

/**
 * LeetCodePractice
 * 滑动窗口最大值
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/4/3 9:44
 * @since JDK17
 */

public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 0 || k == 0) {
            return new int[0];
        }
        Deque<Integer> deque = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];
        for(int j = 0, i = 1 - k; j < nums.length; i++, j++) {
            // 删除 deque 中对应的 nums[i-1]
            if(i > 0 && deque.peekFirst() == nums[i - 1]) {
                deque.removeFirst();
            }
            // 保持 deque 递减
            while(!deque.isEmpty() && deque.peekLast() < nums[j]) {
                deque.removeLast();
            }
            deque.addLast(nums[j]);
            // 记录窗口最大值
            if(i >= 0) {
                res[i] = deque.peekFirst();
            }
        }
        return res;
    }
}


