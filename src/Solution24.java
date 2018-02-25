import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: System_ID
 * Date: 2017-10-15
 * Time: 16:34
 */
public class Solution24 {
    public ListNode swapPairs(ListNode head) {
        ListNode trueHead = null;
        if (head != null) trueHead = head.next;
        if (head == null) return head;
        if (head.next == null) return head;

        ListNode ptr = head;
        ListNode temp1 = ptr;
        ListNode temp2 = ptr;
        while (ptr != null && ptr.next != null) {
            if (ptr.next.next == null || ptr.next.next.next == null) {
                temp1 = ptr.next;
                ptr.next = temp1.next;
                temp1.next = ptr;
                ptr = ptr.next;
            } else {
                temp1 = ptr.next;
                temp2 = temp1.next;
                ptr.next = temp1.next.next;
                temp1.next = ptr;
                ptr = temp2;
            }
        }
        return trueHead;
    }
}


