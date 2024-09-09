package The2500.P2200.P2200.Q2181;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SolutionTest {

    @Test
    public void testMergeNodes() {
        Solution solution = new Solution();

        ListNode node = new ListNode(0);
        ListNode node1 = new ListNode(2, node);
        ListNode node2 = new ListNode(5, node1);
        ListNode node3 = new ListNode(4, node2);
        ListNode node4 = new ListNode(0, node3);
        ListNode node5 = new ListNode(1, node4);
        ListNode node6 = new ListNode(3, node5);
        ListNode node7 = new ListNode(0, node6);

        solution.mergeNodes(node7);


    }
}
