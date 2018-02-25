/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: System_ID
 * Date: 2017-12-01
 * Time: 15:09
 */

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution82 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }

        LinkedHashMap<Integer, Integer> collect = new LinkedHashMap<Integer, Integer>();
        ListNode iter = head;
        while (iter != null) {
            if (collect.containsKey(iter.val)) {
                collect.put(iter.val, -1);
            } else {
                collect.put(iter.val, 1);
            }

            iter = iter.next;
        }

        ListNode result = new ListNode(0);
        ListNode ptr = result;

        for (Map.Entry<Integer, Integer> entry : collect.entrySet()) {
            if (entry.getValue() == 1) {
                ptr.next = new ListNode(entry.getKey());
                ptr = ptr.next;
            }
        }

        return result.next;
    }
}


