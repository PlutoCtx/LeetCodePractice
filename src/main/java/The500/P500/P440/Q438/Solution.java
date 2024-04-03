package The500.P500.P440.Q438;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCodePractice
 * 找到字符串中所有字母异位词
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/4/3 9:47
 * @since JDK17
 */

public class Solution {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        // 初始化一个数组来统计字符串 p 中每个字符的出现次数
        int[] cnt = new int[26];
        for(int i = 0; i < p.length(); i++){
            cnt[p.charAt(i) - 'a']++;
        }
        // l 和 r 分别表示滑动窗口的左右边界
        int l = 0;
        for(int r = 0; r < s.length(); r++){
            // 更新当前窗口中字符的计数数组
            cnt[s.charAt(r) - 'a']--;
            // 从左侧收缩窗口，直到当前字符的计数在限定范围内
            while(cnt[s.charAt(r) - 'a'] < 0){
                cnt[s.charAt(l) - 'a']++;
                l++;
            }
            // 检查当前窗口大小是否等于字符串 p 的大小
            if(r - l + 1 == p.length()){
                ans.add(l);
            }
        }
        return ans;
    }

}


