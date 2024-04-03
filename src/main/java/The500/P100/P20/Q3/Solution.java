package The500.P100.P20.Q3;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCodePractice
 * 无重复字符的最长子串
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/4/3 9:51
 * @since JDK17
 */

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> dic = new HashMap<>();
        int i = -1, res = 0, len = s.length();
        for(int j = 0; j < len; j++) {
            if (dic.containsKey(s.charAt(j))) {
                // 更新左指针 i
                i = Math.max(i, dic.get(s.charAt(j)));
            }
            // 哈希表记录
            dic.put(s.charAt(j), j);
            // 更新结果
            res = Math.max(res, j - i);
        }
        return res;
    }
}


