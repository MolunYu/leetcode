/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: System_ID
 * Date: 2017-12-15
 * Time: 16:33
 */
public class Solution116 {
    public void connect(TreeLinkNode root) {
        if (root == null) return;
        TreeLinkNode level = root;
        TreeLinkNode deep = root;

        while (deep != null && deep.left != null) {
            level = deep;
            while (level != null) {
                level.left.next = level.right;
                if (level.next != null) {
                    level.right.next = level.next.left;
                }
                level = level.next;
            }

            deep = deep.left;
        }
    }
}

class TreeLinkNode {
    int val;
    TreeLinkNode left, right, next;

    TreeLinkNode(int x) {
        val = x;
    }
}