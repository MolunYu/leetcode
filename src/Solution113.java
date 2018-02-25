import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: System_ID
 * Date: 2017-12-14
 * Time: 20:55
 */
public class Solution113 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        ArrayList<List<Integer>> collect = new ArrayList<List<Integer>>();
        Stack<Integer> element = new Stack<Integer>();

        if (root == null) return collect;

        getSum(collect, root, element, 0, sum);
        return collect;
    }

    void getSum(ArrayList<List<Integer>> collect, TreeNode node, Stack<Integer> element, int result, int target) {
        if (node == null) return;

        element.push(node.val);

        if (result + node.val == target) {
            if (node.left == null && node.right == null)
                collect.add((List<Integer>) element.clone());
            element.pop();
            return;
        }

        if (result > target) {
            element.pop();
            return;
        }

        getSum(collect, node.left, element, result + node.val, target);
        getSum(collect, node.right, element, result + node.val, target);
        element.pop();
    }
}
