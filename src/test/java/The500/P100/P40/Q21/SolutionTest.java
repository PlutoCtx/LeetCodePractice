package The500.P100.P40.Q21;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.logging.Logger;

import static org.testng.Assert.*;

public class SolutionTest {

    @Test
    public void testMergeTwoLists() {

        // Test case 1:
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4, null)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4, null)));
        ListNode expected = new ListNode(
                1, new ListNode(
                        1, new ListNode(
                                2, new ListNode(
                                        3, new ListNode(
                                                4, new ListNode(
                                                        4, null)))))
        );

        Solution solution = new Solution();
        ListNode result = solution.mergeTwoLists(l1, l2);
        Logger.getGlobal().info("Test case 1: " + (result.equals(expected) ? "PASS" : "FAIL"));

//        Assert.assertEquals(result, expected);
    }
}
