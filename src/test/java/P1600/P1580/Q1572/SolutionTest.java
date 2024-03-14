package P1600.P1580.Q1572;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SolutionTest {

    @Test
    public void testDiagonalSum() {
        Solution solution = new Solution();

        int[][] mat = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        Assert.assertEquals(solution.diagonalSum(mat), 25);

        mat = new int[][]{{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        Assert.assertEquals(solution.diagonalSum(mat), 8);

        mat = new int[][]{{5}};
        Assert.assertEquals(solution.diagonalSum(mat), 5);
    }
}
