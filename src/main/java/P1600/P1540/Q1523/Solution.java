package P1600.P1540.Q1523;

/**
 * LeetCodePractice
 * 在区间范围内统计奇数数目
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/3/13 23:51
 * @since JDK17
 */

public class Solution {

    public int countOdds(int low, int high) {
        int cnt = 0;

        if(low % 2 == 0 && high % 2 == 0) {
            cnt = (high - low) / 2;
        } else {
            cnt = (high - low) / 2 + 1;
        }

        return cnt;

    }
}
