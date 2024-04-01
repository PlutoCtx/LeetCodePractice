package The500.P500.P440.Q422;

import java.util.Arrays;
import java.util.List;

/**
 * LeetCodePractice
 * 有效的单词方块
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/4/1 21:54
 * @since JDK17
 */

class Solution {
    public boolean validWordSquare(List<String> words) {
        int n=words.size();
        char[][] matrix=new char[n][];
        for(int i=0;i!=n;i++){
            char[] chars=words.get(i).toCharArray();
            if(chars.length>n) {
                return false;
            }
            matrix[i]= Arrays.copyOf(chars,n);
        }
        for(int i=0;i!=n;i++){
            for(int j=i+1;j<n;j++){
                if(matrix[i][j]!=matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}

