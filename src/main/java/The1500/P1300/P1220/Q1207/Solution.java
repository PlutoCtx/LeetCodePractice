package The1500.P1300.P1220.Q1207;

import java.util.*;

/**
 * LeetCodePractice
 * 独一无二的出现次数
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/3/18 15:47
 * @since JDK17
 */

public class Solution {

    /**
     * 执行用时分布 4 ms
     * 击败 5.41% 使用 Java 的用户
     * 消耗内存分布 40.95 MB
     * 击败 18.26% 使用 Java 的用户
     * @param arr   数组
     * @return  数组元素出现次数是否唯一
     */
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int j : arr) {
            if (map.containsKey(j)) {
                map.replace(j, map.get(j) + 1);
            } else {
                map.put(j, 1);
            }
        }

        List<Integer> result = map.values().stream().toList();
        Map<Integer, Integer> resultMap = new HashMap<>();
        for (Integer integer : result) {
            if (!resultMap.containsKey(integer)) {
                resultMap.put(integer, 1);
            } else {
                return false;
            }
        }
        return true;
    }


    /**
     * 执行用时分布 2 ms
     * 击败 84.19% 使用 Java 的用户
     * 消耗内存分布 41.02 MB
     * 击败 12.14% 使用 Java 的用户
     * @param arr   数组
     * @return  数组元素出现次数是否唯一
     */
    public boolean uniqueOccurrencesOfficialSolution(int[] arr) {
        Map<Integer, Integer> occur = new HashMap<>();
        for (int x : arr) {
            occur.put(x, occur.getOrDefault(x, 0) + 1);
        }
        Set<Integer> times = new HashSet<>();
        for (Map.Entry<Integer, Integer> x : occur.entrySet()) {
            times.add(x.getValue());
        }
        return times.size() == occur.size();
    }

}
