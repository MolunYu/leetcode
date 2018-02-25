import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: System_ID
 * Date: 2017-12-14
 * Time: 20:40
 */
public class Solution109 {
    class Solution {
        public TreeNode sortedListToBST(ListNode head) {
            if (head == null) return null;

            ArrayList<Integer> data = new ArrayList<Integer>();
            ListNode ptr = head;
            while (ptr != null) {
                data.add(ptr.val);
                ptr = ptr.next;
            }

            return sortedBST(data, 0, data.size() - 1);
        }

        TreeNode sortedBST(ArrayList<Integer> data, int begin, int end) {
            if (begin > end) return null;

            int mid = (begin + end) / 2;
            TreeNode node = new TreeNode(data.get(mid));
            node.left = sortedBST(data, begin, mid - 1);
            node.right = sortedBST(data, mid + 1, end);

            return node;
        }
    }
}
