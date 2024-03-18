package The500.P400.P400.Q392;

/**
 * LeetCodePractice
 * 判断子序列
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/3/18 14:51
 * @since JDK17
 */

public class Solution {

    /**
     * 执行用时分布 0 ms
     * 击败 100.00% 使用 Java 的用户
     * 消耗内存分布 40.39 MB
     * 击败 70.06% 使用 Java 的用户
     * @param s     疑似子串
     * @param t     长字符串
     * @return  是否为子串
     */
    public boolean isSubsequence(String s, String t) {
        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();

        int start = 0;
        for (char aChar : chars) {
            int first = find(aChar, chart, start);
            if (first == -1) {
                return false;
            }
            start = first + 1;
        }
        return true;
    }


    public int find(char ch, char[] chart, int start) {
        for (int i = start; i < chart.length; i++) {
            if (ch == chart[i]) {
                return i;
            }
        }
        return - 1;
    }

}
