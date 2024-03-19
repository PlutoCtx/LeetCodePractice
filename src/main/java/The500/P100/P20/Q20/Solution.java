package The500.P100.P20.Q20;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * LeetCodePractice
 * 有效的括号
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/3/19 23:49
 * @since JDK17
 */

public class Solution {
    private static final Map<Character,Character> map = new HashMap<Character,Character>(){{
        put('{','}');
        put('[',']');
        put('(',')');
        put('?','?');
    }};

    public boolean isValid(String s) {
        if(s.length() > 0 && !map.containsKey(s.charAt(0))) {
            return false;
        }
        LinkedList<Character> stack = new LinkedList<Character>() {{ add('?'); }};
        for(Character c : s.toCharArray()){
            if(map.containsKey(c)) {
                stack.addLast(c);
            } else if(!map.get(stack.removeLast()).equals(c)) {
                return false;
            }
        }
        return stack.size() == 1;
    }
}
