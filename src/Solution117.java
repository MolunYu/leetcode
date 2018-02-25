/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: System_ID
 * Date: 2017-12-15
 * Time: 18:52
 */
public class Solution117 {
    public void connect(TreeLinkNode root) {
        if (root == null) return;
        TreeLinkNode preLevel = null;
        TreeLinkNode level = null;
        TreeLinkNode deep = root;

        while (deep != null) {
            level = deep;

            while (level != null) {
                if (level.left != null) {
                    if (preLevel != null) {
                        preLevel.next = level.left;
                    } else {
                        deep = level.left;
                    }
                    preLevel = level.left;
                }

                if (level.right != null) {
                    if (preLevel != null) {
                        preLevel.right = level.right;
                    } else {
                        deep = level.right;
                    }
                    preLevel = level.right;
                }

                level = level.next;
            }

            preLevel = null;
        }
    }
}
