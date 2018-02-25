import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: System_ID
 * Date: 2017-11-12
 * Time: 14:03
 */
public class Solution54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> collect = new ArrayList<Integer>();
        if (matrix.length==0||matrix[0].length==0) return collect;
        spiral(matrix, 0, matrix.length - 1,0,matrix[0].length-1, collect);
        return collect;
    }

    void spiral(int[][] matrix, int top, int buttom, int left, int right, List<Integer> collect) {
        if (left < right && top < buttom) {
            for (int i = left; i < right; i++) {
                collect.add(matrix[top][i]);
            }
            for (int i = top; i < buttom; i++) {
                collect.add(matrix[i][right]);
            }
            for (int i = right; i > left; i--) {
                collect.add(matrix[buttom][i]);
            }
            for (int i = buttom; i > top; i--) {
                collect.add(matrix[i][left]);
            }
            spiral(matrix, top + 1, buttom - 1,left + 1,right - 1, collect);
        }
        if (left == right || top == buttom) {
            if (left == right) {
                for (int i = top; i <= buttom; i++) {
                    collect.add(matrix[i][left]);
                }
            } else {
                for (int i = left; i <= right; i++) {
                    collect.add(matrix[top][i]);
                }
            }
        }
    }
}
