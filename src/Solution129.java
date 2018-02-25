/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: System_ID
 * Date: 2018-01-15
 * Time: 20:27
 */
public class Solution129 {
    public int sumNumbers(TreeNode root) {
        return sum(root, 0);
    }

    int sum(TreeNode node, int result) {
        if (node == null) return 0;
        if (node.right == null && node.right == null) return result * 10 + node.val;
        return sum(node.left, result * 10 + node.val) + sum(node.right, result * 10 + node.val);
    }
}
