package The500.P100.P60.Q58;

/**
 * LeetCodePractice
 * 最后一个单词的长度
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/3/31 23:52
 * @since JDK17
 */

class Solution {
    public int lengthOfLastWord(String s) {
        int end = s.length() - 1;
        while(end >= 0 && s.charAt(end) == ' ') {
            end--;
        }
        if(end < 0) {
            return 0;
        }
        int start = end;
        while(start >= 0 && s.charAt(start) != ' ') {
            start--;
        }
        return end - start;
    }
}

