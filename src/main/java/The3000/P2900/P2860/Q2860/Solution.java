package The3000.P2900.P2860.Q2860;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * LeetCodePractice
 * 让所有学生保持开心的分组方法数
 *
 * @author PlutoCtx    ctx195467@163.com
 * @version 2024/9/4 12:17
 * @since JDK17
 */

public class Solution {


    /**
     * 让所有学生都开心的分组方法数
     * 执行用时分布 38 ms
     * 击败 29.55%
     * 消耗内存分布 54.71 MB
     * 击败 86.36%
     * @param nums      数组
     * @return          分组方法数
     */
    public int countWays(List<Integer> nums) {
        sortList(nums);
        int ways = 0;
        if (nums.get(0) != 0) {
            ways ++;
        }

        for (int i = 0; i < nums.size(); i ++) {
            if (nums.get(i) < i + 1) {
                if (i + 1 < nums.size()) {
                    if (i + 1 < nums.get(i + 1)) {
                        ways ++;
                    }
                } else {
                    ways ++;
                }
            } else {
                if (nums.get(i) < i + 1) {
                    i = nums.get(i);
                }
            }
        }

        return ways;
    }

    /**
     * 将list进行升序排序
     * @param nums  待排序的链表
     */
    private void sortList(List<Integer> nums) {
        Collections.sort(nums);
//        nums.sort(Integer::compareTo);
//        System.out.println(nums);
    }


}
