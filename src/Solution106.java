import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: System_ID
 * Date: 2017-12-09
 * Time: 20:17
 */
public class Solution106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (postorder.length == 0 || inorder.length == 0) return null;

        HashMap<Integer, Integer> mInorder = new HashMap<Integer, Integer>();
        for (int i = 0; i < inorder.length; i++) {
            mInorder.put(inorder[i], i);
        }

        return build(postorder, mInorder, 0, postorder.length - 1, 0);
    }

    TreeNode build(int[] postorder, HashMap<Integer, Integer> mInorder, int postBegin, int postEnd, int inIndex) {
        if (postBegin > postEnd) return null;

        TreeNode node = new TreeNode(postorder[postEnd]);
        node.left = build(postorder, mInorder, postBegin, postBegin + mInorder.get(postorder[postEnd]) - inIndex-1, inIndex);
        node.right = build(postorder, mInorder, postBegin + mInorder.get(postorder[postEnd]) - inIndex, postEnd - 1, mInorder.get(postorder[postEnd]) + 1);

        return node;
    }
}
