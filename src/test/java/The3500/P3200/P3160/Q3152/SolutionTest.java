package The3500.P3200.P3160.Q3152;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SolutionTest {

    @Test
    public void testIsArraySpecial() {
        Solution solution = new Solution();
        Assert.assertEquals(
                solution.isArraySpecial(new int[]{4, 3, 1, 6},
                        new int[][]{{0, 2}, {2, 3}}),
                new boolean[]{false, true});

        Assert.assertEquals(
                solution.isArraySpecial(new int[]{3, 4, 1, 2, 6},
                        new int[][]{{0, 4}}),
                new boolean[]{false});

        Assert.assertEquals(
                solution.isArraySpecial(new int[]{9, 5, 9},
                        new int[][]{{0, 2}}),
                new boolean[]{false});











//        assertEquals(Solution.isArraySpecial(new int[]{3, 4, 1, 2, 6}, new int[][]{{0, 4}}), new boolean[]{false});
    }
}
