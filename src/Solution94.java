import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: System_ID
 * Date: 2017-12-07
 * Time: 16:11
 */
public class Solution94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> collect = new ArrayList<Integer>();
        inoder(collect, root);
        return collect;
    }

    void inoder(List<Integer> collect, TreeNode node) {
        if (node == null) {
            return;
        }

        inoder(collect, node.left);
        collect.add(node.val);
        inoder(collect, node.right);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}