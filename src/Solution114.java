import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: System_ID
 * Date: 2017-12-15
 * Time: 13:42
 */
public class Solution114 {
    public void flatten(TreeNode root) {
        postOrder(root);
    }

    void postOrder(TreeNode node) {
        if (node == null) return;

        postOrder(node.right);
        postOrder(node.left);

        node.right = pre;
        node.left = null;

        pre = node;
    }

    private TreeNode pre = null;
}

