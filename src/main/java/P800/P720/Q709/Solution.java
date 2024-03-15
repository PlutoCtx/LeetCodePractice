package P800.P720.Q709;

/**
 * LeetCodePractice
 * 转换成小写字母
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/3/15 10:57
 * @since JDK17
 */

public class Solution {

    public String toLowerCase(String s) {
        char[] chars = s.toCharArray();
        String res = "";
        for(int i = 0; i < chars.length; i++) {
            if(chars[i] <= 'Z' && chars[i] >= 'A') {
                chars[i] = (char)((int)chars[i] + 32);
            }
            res += chars[i];
        }
        return res;
    }
}
