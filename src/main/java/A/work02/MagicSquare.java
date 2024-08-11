package A.work02;

import java.util.Scanner;

/**
 * LeetCodePractice
 * 魔方阵
 *
 * @author PlutoCtx
 * @version 2024/6/18 20:08
 * @email ctx195467@163.com
 * @since JDK17
 */

public class MagicSquare {

    public static void main(String[] args) {
        // 你可以将这里的值替换为你输入的奇数
        int n = 5;
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入一个奇数：");
        n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println("请输入一个奇数！");
            return;
        }
        int[][] magicSquare = new int[n][n];
        generateMagicSquare(magicSquare, n, 1);
        printMagicSquare(magicSquare);
    }

    public static void generateMagicSquare(int[][] magicSquare, int n, int num) {
        int row = 0;
        int col = n / 2;

        for (int i = 1; i <= n * n; i++) {
            magicSquare[row][col] = num++;

            // 检查下一个位置是否越界
            int newRow = (row - 1 + n) % n;
            int newCol = (col + 1) % n;

            // 如果下一个位置已被占据，则改变方向
            if (magicSquare[newRow][newCol] != 0) {
                row = (row + 1) % n;
            } else {
                row = newRow;
                col = newCol;
            }
        }
    }

    public static void printMagicSquare(int[][] magicSquare) {
        for (int[] row : magicSquare) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
