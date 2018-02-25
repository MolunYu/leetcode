import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: System_ID
 * Date: 2017-12-07
 * Time: 16:33
 */
public class Solution95 {
    public List<TreeNode> generateTrees(int n) {
        if (n == 0) return new ArrayList<TreeNode>();

        return creatTree(0, n);
    }

    List<TreeNode> creatTree(int begin, int end) {
        List<TreeNode> collect = new ArrayList<TreeNode>();

        if (begin == end) {
            collect.add(null);
            return collect;
        }

        for (int i = begin; i < end; i++) {
            List<TreeNode> left = creatTree(begin, i);
            List<TreeNode> right = creatTree(i + 1, end);

            for (TreeNode lnode : left) {
                for (TreeNode rnode : right) {
                    TreeNode node = new TreeNode(i + 1);
                    node.left = lnode;
                    node.right = rnode;
                    collect.add(node);
                }
            }
        }

        return collect;
    }
}
