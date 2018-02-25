/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: System_ID
 * Date: 2017-12-04
 * Time: 16:59
 */
public class Solution92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null) return head;

        ListNode node = new ListNode(0);
        node.next = head;
        ListNode left = node;
        ListNode start = node;
        for (int i = 0; i < m - 1; i++) left = left.next;
        start = left.next;

        ListNode ptr = start;
        for (int i = m; i < n; i++) {
            ptr = start.next;
            start.next = ptr.next;
            ptr.next = left.next;
            left.next = ptr;
        }

        return node.next;
    }
}
