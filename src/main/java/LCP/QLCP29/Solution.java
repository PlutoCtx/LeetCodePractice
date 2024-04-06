package LCP.QLCP29;

/**
 * LeetCodePractice
 * LCP29 乐团站位
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/4/6 16:20
 * @since JDK17
 */

public class Solution {

    public int orchestraLayout(int num, int x, int y) {
        //先确定这个位置在第几圈,circle从0开始计数，即第“一”圈为circle == 0
        long circle = Math.min(Math.min(x,num-1-x), Math.min(y,num-1-y));

        //len 记录第circle圈的边长，边长为正方形边长-1，每圈过后边长减2
        long len = num-1-2*circle;

        //count一定会溢出，这里参考 @灰包包 老哥的count解法。
        long count = (long)num*num - (len+1)*(len+1);

        //根据pos在不同的坐标来计算count，其实这里想要优化来着
        if(x == circle && y < num-1-circle){
            //这个时候在上边的边
            count += y - circle + 1;
        }else if(y == num-1-circle && x < num-1-circle){
            //在右边的边
            count += len + x-circle+1;
        }else if(x == num-1-circle && y>circle){
            //在下边的边
            count += 2*len + num-circle-y;
        }else{
            count += 3*len + num-circle-x;
        }

        return (int)(count%9==0?9:count%9);
    }



}
