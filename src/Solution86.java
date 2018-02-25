/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: System_ID
 * Date: 2017-12-01
 * Time: 19:44
 */
public class Solution86 {
    public ListNode partition(ListNode head, int x) {
        if (head == null) return head;

        ListNode left = new ListNode(0);
        ListNode right = new ListNode(0);

        ListNode ptr = head;
        ListNode ptrL = left;
        ListNode ptrR = right;

        while (ptr != null) {
            if (ptr.val < x) {
                ptrL.next = new ListNode(ptr.val);
                ptrL = ptrL.next;
            }
            if (ptr.val >= x) {
                ptrR.next = new ListNode(ptr.val);
                ptrR = ptrR.next;
            }

            ptr = ptr.next;
        }

        if (left == null && right == null) return null;

        if (left == null && right != null) return right.next;

        if (left != null && right == null) return left.next;

        ptrL.next = right.next;

        return left.next;
    }
}
