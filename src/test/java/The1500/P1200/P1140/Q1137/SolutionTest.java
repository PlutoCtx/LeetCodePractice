package The1500.P1200.P1140.Q1137;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SolutionTest {

    @Test
    public void testTribonacci() {
        Assert.assertEquals(new Solution().tribonacci(4), 4);
        Assert.assertEquals(new Solution().tribonacci(25), 1389537);
        Assert.assertEquals(new Solution().tribonacci(35), 615693474);

    }
}
