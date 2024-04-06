package The3000.P2700.P2620.Q2612;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

/**
 * LeetCodePractice
 * 最少翻转操作数
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/4/6 16:23
 * @since JDK17
 */

public class Solution {

    public int[] minReverseOperations(int n, int p, int[] banned, int k) {
        var ban = new boolean[n];
        ban[p] = true;
        for (int i : banned) {
            ban[i] = true;
        }
        TreeSet<Integer>[] sets = new TreeSet[2];
        sets[0] = new TreeSet<>();
        sets[1] = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            if (!ban[i]) {
                sets[i % 2].add(i);
            }
        }
        sets[0].add(n);
        // 哨兵
        sets[1].add(n);

        var ans = new int[n];
        Arrays.fill(ans, -1);
        var q = new ArrayList<Integer>();
        q.add(p);
        for (int step = 0; !q.isEmpty(); ++step) {
            var tmp = q;
            q = new ArrayList<>();
            for (int i : tmp) {
                ans[i] = step;
                // 从 mn 到 mx 的所有位置都可以翻转到
                int mn = Math.max(i - k + 1, k - i - 1);
                int mx = Math.min(i + k - 1, n * 2 - k - i - 1);
                var s = sets[mn % 2];
                for (var j = s.ceiling(mn); j <= mx; j = s.ceiling(mn)) {
                    q.add(j);
                    s.remove(j);
                }
            }
        }
        return ans;
    }



}
