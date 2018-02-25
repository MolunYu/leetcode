import java.util.logging.Handler;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: System_ID
 * Date: 2017-10-14
 * Time: 21:34
 */
public class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ptr = head;
        for (int i = 0; i < n - 1; i++) ptr = ptr.next;

        ListNode delNode = head;
        ListNode preDelNode = delNode;

        while (ptr.next != null) {
            ptr = ptr.next;
            preDelNode = delNode;
            delNode = delNode.next;
        }

        if (delNode == preDelNode) return delNode.next;
        else {
            preDelNode.next = delNode.next;
            return head;
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}