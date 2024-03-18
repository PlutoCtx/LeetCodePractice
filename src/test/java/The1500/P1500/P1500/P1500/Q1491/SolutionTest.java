package The1500.P1500.P1500.P1500.Q1491;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SolutionTest {

    @Test
    public void testAverage() {
        Solution solution = new Solution();

        int[] salary = new int[]{4000, 3000, 1000, 2000};
        Assert.assertEquals(solution.average(salary), 2500.00000);

        salary = new int[]{1000, 2000, 3000};
        Assert.assertEquals(solution.average(salary), 2000.00000);

        salary = new int[]{6000, 5000, 4000, 3000, 2000, 1000};
        Assert.assertEquals(solution.average(salary), 3500.00000);

        salary = new int[]{8000, 9000, 2000, 3000, 6000, 1000};
        Assert.assertEquals(solution.average(salary), 4750.00000);
    }
}
