package The500.P500.P460.Q459;

/**
 * LeetCodePractice
 * 重复的子字符串
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/3/31 23:46
 * @since JDK17
 */

public class Solution {

    public boolean repeatedSubstringPattern(String s) {
        String str = s + s;
        return str.substring(1, str.length() - 1).contains(s);
    }

}
