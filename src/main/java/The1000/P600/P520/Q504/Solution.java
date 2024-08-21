package The1000.P600.P520.Q504;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCodePractice
 * 七进制数
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/8/21 22:27
 * @since JDK17
 */

public class Solution {

    /**
     * 将任意整数转换为七进制数
     * 执行用时分布 1 ms
     * 击败 81.03%
     * 复杂度分析
     * 消耗内存分布 39.98 MB
     * 击败 79.66%
     * @param num   十进制整数
     * @return      对应的七进制数
     */
    public String convertToBase7(int num) {

        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        if (num < 0) {
            sb.append("-");
            num = -num;
        } else if (num == 0) {
            sb.append("0");
        }

        while (num > 0) {
            list.add("" + num % 7);
            num = num / 7;
        }

        for (int i = list.size() - 1; i >= 0 ; i--) {
            sb.append(list.get(i));
        }
        return sb.toString();

    }


}
