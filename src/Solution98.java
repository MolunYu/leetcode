/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: System_ID
 * Date: 2017-12-08
 * Time: 16:26
 */
public class Solution98 {
    public boolean isValidBST(TreeNode root) {
        return isValid(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }

    boolean isValid(TreeNode node, long partMax, long partMin) {
        if (node == null) return true;

        boolean left = isValid(node.left, node.val, partMin) && node.val < partMax && node.val > partMin;
        boolean right = isValid(node.right, partMax, node.val) && node.val < partMax && node.val > partMin;

        return left && right;
    }
}
