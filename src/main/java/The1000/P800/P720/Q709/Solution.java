package The1000.P800.P720.Q709;

/**
 * LeetCodePractice
 * 转换成小写字母
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/3/15 10:57
 * @since JDK17
 */

public class Solution {
    /**
     * 执行用时分布 0 ms
     * 击败 100.00% 使用 Java 的用户
     * 消耗内存分布 40.70 MB
     * 击败 21.99% 使用 Java 的用户
     * @param s 待转换字符串
     * @return  小写字符串
     */
    public String toLowerCase(String s) {
        char[] chars = s.toCharArray();
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < chars.length; i++) {
            if(chars[i] <= 'Z' && chars[i] >= 'A') {
                chars[i] = (char)((int)chars[i] + 32);
            }
            res.append(chars[i]);
        }
        return res.toString();
    }
}
