package The2000.P1800.P1780.Q1768;


/**
 * LeetCodePractice
 * 交替合并字符串
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/3/12 22:50
 * @since JDK17
 */

class Solution {

    /**
     * 交替合并字符串
     * @param word1     字符串1
     * @param word2     字符串2
     * @return  合并后的字符串
     */
    public String mergeAlternately(String word1, String word2) {
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < chars1.length + chars2.length; i++) {
            if (i < chars1.length) {
                result.append(chars1[i]);
            }
            if (i < chars2.length) {
                result.append(chars2[i]);
            }
        }
        return result.toString();
    }
}
