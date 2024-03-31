package The500.P300.P260.Q242;

import java.util.HashMap;

/**
 * LeetCodePractice
 * 有效的字母异位词
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/3/31 23:37
 * @since JDK17
 */

public class Solution {

    public boolean isAnagram(String s, String t) {
        int len1 = s.length(), len2 = t.length();
        if (len1 != len2) {
            return false;
        }
        HashMap<Character, Integer> dic = new HashMap<>();
        for (int i = 0; i < len1; i++) {
            dic.put(s.charAt(i) , dic.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < len2; i++) {
            dic.put(t.charAt(i) , dic.getOrDefault(t.charAt(i), 0) - 1);
        }
        for (int val : dic.values()) {
            if (val != 0) {
                return false;
            }
        }
        return true;
    }


}
