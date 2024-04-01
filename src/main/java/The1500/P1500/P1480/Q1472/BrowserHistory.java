package The1500.P1500.P1480.Q1472;

/**
 * LeetCodePractice
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/4/1 22:10
 * @since JDK17
 */

public class BrowserHistory {
    Node page;
    Node temp = page;
    public BrowserHistory(String homepage) {
        page = new Node(homepage);
    }

    public void visit(String url) {
        Node newPage = new Node(url);
        newPage.next = null;
        page.next = newPage;
        newPage.pre = page;
        page = page.next;
    }

    public String back(int steps) {
        while (steps != 0) {
            if (page.pre == temp) {
                break;
            }else {
                page = page.pre;
                steps--;
            }
        }
        return page.str;
    }

    public String forward(int steps) {
        while (steps != 0) {
            if (page.next == null) {
                break;
            }else {
                page = page.next;
                steps--;
            }
        }
        return page.str;
    }
}




