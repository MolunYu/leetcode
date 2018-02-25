import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: System_ID
 * Date: 2017-12-09
 * Time: 18:41
 */
public class Solution105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0) return null;

        HashMap<Integer, Integer> mInorder = new HashMap<Integer, Integer>();
        for (int i = 0; i < inorder.length; i++) {
            mInorder.put(inorder[i], i);
        }

        return build(preorder, mInorder, 0, preorder.length - 1,0);
    }

    TreeNode build(int[] preorder, HashMap<Integer, Integer> mInorder, int preBegin, int preEnd, int inIndex) {
        if (preBegin > preEnd) return null;

        TreeNode node = new TreeNode(preorder[preBegin]);
        node.left = build(preorder, mInorder, preBegin + 1, preBegin + mInorder.get(preorder[preBegin]) - inIndex, inIndex);
        node.right = build(preorder, mInorder, preBegin + mInorder.get(preorder[preBegin]) + 1 - inIndex, preEnd, mInorder.get(preorder[preBegin])+1);

        return node;
    }
}
