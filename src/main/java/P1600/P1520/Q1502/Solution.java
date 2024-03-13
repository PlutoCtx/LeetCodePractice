package P1600.P1520.Q1502;

/**
 * LeetCodePractice
 * 判断能否形成等差数列
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/3/13 23:56
 * @since JDK17
 */

public class Solution {

    public boolean canMakeArithmeticProgression(int[] arr) {

        boolean flag = true;

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length - 1; j++) {
                if(arr[j] < arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        int d = arr[0] - arr[1];

        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] - arr[i + 1] != d && arr[i] - arr[i + 1] != (-1) * d) {
                flag = false;
                return flag;
            }
        }
        return flag;
    }

}
