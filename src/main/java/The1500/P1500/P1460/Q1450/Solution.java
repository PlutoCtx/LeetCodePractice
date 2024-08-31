package The1500.P1500.P1460.Q1450;

/**
 * LeetCodePractice
 * 在既定时间做作业的学生人数
 *
 * @author PlutoCtx    ctx195467@163.com
 * @version 2024/9/1 0:35
 * @since JDK17
 */

public class Solution {

    /**
     * 在既定时间做作业的学生人数
     * <p></p>
     * @param startTime     开始时间
     * @param endTime       结束时间
     * @param queryTime     某时刻
     * @return  res         在既定时间做作业的学生人数
     */
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int res = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (queryTime >= startTime[i] && queryTime <= endTime[i]) {
                res ++;
            }
        }
        return res;
    }




}
