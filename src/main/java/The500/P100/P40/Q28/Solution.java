package The500.P100.P40.Q28;

/**
 * LeetCodePractice
 * 找出字符串中第一个匹配项的下标
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/3/12 23:25
 * @since JDK17
 */

public class Solution {

    public int strStr(String haystack, String needle) {
        char[] haystackChars = haystack.toCharArray();
        char[] needleChars = needle.toCharArray();
        int needleLength = needleChars.length;
        int haystackLength = haystackChars.length;

        if(haystackLength < needleLength){
            return -1;
        }

        for(int i = 0; i < haystackChars.length - needleLength + 1; i++) {
            if(haystackChars[i] == needleChars[0]) {
                boolean flag = true;
                for(int j = 0; j < needleLength; j++) {
                    if (haystackChars[j + i] != needleChars[j]) {
                        flag = false;
                        break;
                    }
                }

                if(flag) {
                    return i;
                }
            }
        }
        return -1;
    }

}
