/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: System_ID
 * Date: 2017-11-24
 * Time: 14:37
 */
public class Solution74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) {
            return false;
        }

        int begin=0;
        int end = matrix.length * matrix[0].length - 1;
        while (begin <= end) {
            int mid = (begin + end) / 2;
            if (getMatrix(matrix, mid) == target) {
                return true;
            } else if (getMatrix(matrix, mid) < target) {
                begin = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }

    int getMatrix(int[][] matrix, int index) {
        int row = index / matrix[0].length;
        int col = index % matrix[0].length;
    }
}
