package The2000.P1900.P1840.Q1832;

/**
 * LeetCodePractice
 * 判断句子是否为全字母句
 *
 * @author PlutoCtx
 * @version 2024/6/4 19:02
 * @email ctx195467@163.com
 * @since JDK17
 */

public class Solution {


    public boolean checkIfPangram(String sentence) {

        char[] chars = sentence.toCharArray();

        int[] cnt = new int[26];
        for (int i = 0; i < 26; i++) {
            cnt[i] = 0;
        }


        for (char c : chars) {
            if (c == 'A') {
                cnt[0] = 1;
            } else if (c == 'B') {
                cnt[1] = 1;
            } else if (c == 'C') {
                cnt[2] = 1;
            } else if (c == 'D') {
                cnt[3] = 1;
            } else if (c == 'E') {
                cnt[4] = 1;
            } else if (c == 'F') {
                cnt[5] = 1;
            } else if (c == 'G') {
                cnt[6] = 1;
            } else if (c == 'H') {
                cnt[7] = 1;
            } else if (c == 'I') {
                cnt[8] = 1;
            } else if (c == 'J') {
                cnt[9] = 1;
            } else if (c == 'K') {
                cnt[10] = 1;
            } else if (c == 'L') {
                cnt[11] = 1;
            } else if (c == 'M') {
                cnt[12] = 1;
            } else if (c == 'N') {
                cnt[13] = 1;
            } else if (c == 'O') {
                cnt[14] = 1;
            } else if (c == 'P') {
                cnt[15] = 1;
            } else if (c == 'Q') {
                cnt[16] = 1;
            } else if (c == 'R') {
                cnt[17] = 1;
            } else if (c == 'S') {
                cnt[18] = 1;
            } else if (c == 'T') {
                cnt[19] = 1;
            } else if (c == 'U') {
                cnt[20] = 1;
            } else if (c == 'V') {
                cnt[21] = 1;
            } else if (c == 'W') {
                cnt[22] = 1;
            } else if (c == 'X') {
                cnt[23] = 1;
            } else if (c == 'Y') {
                cnt[24] = 1;
            } else if (c == 'Z') {
                cnt[25] = 1;
            }

        }

        int res = 0;

        for (int i = 0; i < 26; i++) {

            if (cnt[i] == 1) {
                res++;
            }
            System.out.println(cnt[i]);
        }

        return res == 26;
    }

}
