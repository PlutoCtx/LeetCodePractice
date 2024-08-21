package The1000.P600.P520.Q504;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SolutionTest {

    @Test
    public void testConvertToBase7() {
        Solution solution = new Solution();
        Assert.assertEquals("0", solution.convertToBase7(0));
        Assert.assertEquals("-10", solution.convertToBase7(-7));
        Assert.assertEquals("202", solution.convertToBase7(100));

    }
}