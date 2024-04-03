package The500.P100.P80.Q76;

/**
 * LeetCodePractice
 * 最小覆盖子串
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/4/3 9:41
 * @since JDK17
 */

public class Solution {
    public String minWindow(String S, String t) {
        char[] s = S.toCharArray();
        int m = s.length;
        int ansLeft = -1;
        int ansRight = m;
        int left = 0;
        // s 子串字母的出现次数
        int[] cntS = new int[128];
        // t 中字母的出现次数
        int[] cntT = new int[128];
        for (char c : t.toCharArray()) {
            cntT[c]++;
        }
        // 移动子串右端点
        for (int right = 0; right < m; right++) {
            // 右端点字母移入子串
            cntS[s[right]]++;
            // 涵盖
            while (isCovered(cntS, cntT)) {
                // 找到更短的子串
                if (right - left < ansRight - ansLeft) {
                    // 记录此时的左右端点
                    ansLeft = left;
                    ansRight = right;
                }
                // 左端点字母移出子串
                cntS[s[left++]]--;
            }
        }
        return ansLeft < 0 ? "" : S.substring(ansLeft, ansRight + 1);
    }

    private boolean isCovered(int[] cntS, int[] cntT) {
        for (int i = 'A'; i <= 'Z'; i++) {
            if (cntS[i] < cntT[i]) {
                return false;
            }
        }
        for (int i = 'a'; i <= 'z'; i++) {
            if (cntS[i] < cntT[i]) {
                return false;
            }
        }
        return true;
    }
}

