package The3500.P3200.P3180.Q3174;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCodePractice
 * 清除数字
 *
 * @author PlutoCtx    ctx195467@163.com
 * @version 2024/9/5 12:01
 * @since JDK17
 */

public class Solution {

    /**
     * 消除数字
     * 执行用时分布 2 ms
     * 击败 49.70%
     * 消耗内存分布 41.69 MB
     * 击败 34.71%
     * @param s         输入字符串
     * @return          删除数字后的字符串
     */
    public String clearDigits(String s) {

        List<Character> characterList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char currentCharacter = s.charAt(i);
            characterList.add(currentCharacter);
        }

        int length = characterList.size();
        int ll = characterList.size();
        for (int j = 0; j < ll; j++) {
            for (int i = 0; i < length - 1; i++) {
                if (isNumber(characterList.get(i + 1))) {
                    characterList.remove(i + 1);
                    characterList.remove(i);
                    break;
                }
            }

            length = characterList.size();
        }


        StringBuilder stringBuilder = new StringBuilder();
        for (Character character : characterList) {
            stringBuilder.append(character);
        }

        return stringBuilder.toString();

    }

    /**
     * 该字符是否为数字
     * @param e     待判断字符
     * @return      是否为字符
     */
    private boolean isNumber(Character e) {
        return e <= '9' && e >= '0';
    }


}
