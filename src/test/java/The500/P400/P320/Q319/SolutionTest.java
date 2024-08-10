package The500.P400.P320.Q319;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SolutionTest {

    @Test
    public void testBulbSwitch() {
        Assert.assertEquals(new Solution().bulbSwitch(0), 0);
        Assert.assertEquals(new Solution().bulbSwitch(1), 1);
//        Assert.assertEquals(new Solution().bulbSwitch(0), 0);



    }
}
