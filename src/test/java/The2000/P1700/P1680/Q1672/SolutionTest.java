package The2000.P1700.P1680.Q1672;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SolutionTest {

    @Test
    public void testMaximumWealth() {
        Solution solution = new Solution();
        int[][] accounts = new int[][]{{1,2,3},{3,2,1}};
        Assert.assertEquals(solution.maximumWealth(accounts), 6);

        accounts = new int[][]{{1, 5}, {7, 3}, {3, 5}};
        Assert.assertEquals(solution.maximumWealth(accounts), 10);

        accounts = new int[][]{{2,8,7},{7,1,3},{1,9,5}};
        Assert.assertEquals(solution.maximumWealth(accounts), 17);
    }
}
