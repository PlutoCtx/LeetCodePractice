package A.work01;

/**
 * LeetCodePractice
 * 四色问题
 *
 * @author PlutoCtx
 * @version 2024/6/15 23:43
 * @email ctx195467@163.com
 * @since JDK17
 */

public class FourColorMap {

    public void MapColor(int[][] dist, int[] s) {
        int color, area, k;
        s[0] = 1;
        area = 1;
        color = 1;

        while (area < dist.length) {
            while (color <= 4) {
                if (area >= dist.length) {
                    break;
                }
                k = 0;

                while (k < area && s[k] * dist[area][k] != color) {
                    k++;
                }
                if (k < area) {
                    color ++;
                } else {
                    s[area] = color;
                    area++;
                    color = 1;
                }
            }

            if (color > 4) {
                area = area - 1;
                color = s[area] + 1;
            }
        }
    }

    public static void main(String[] args) {
        // 地图的邻接矩阵
        int[][] dist = {{0,1,1,1,1,1,0},
                {1,0,0,0,0,1,0},
                {1,0,0,1,1,0,0},
                {1,0,1,0,1,1,0},
                {1,0,1,1,0,1,0},
                {1,1,0,1,1,0,0},
                {0,0,0,0,0,0,0}};
        int [] s = new int[dist.length];

        FourColorMap fourColorMap = new FourColorMap();
        fourColorMap.MapColor(dist, s);
        System.out.println("地图区域1-7的颜色为：");


        for (int i = 0; i < s.length; i++) {
            System.out.println("区域" + (i + 1) + "的颜色为：" + s[i]);
        }
    }
}
