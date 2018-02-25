import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: System_ID
 * Date: 2017-11-24
 * Time: 13:55
 */
public class Solution73 {
    public void setZeroes(int[][] matrix) {
        boolean[] rowFlag = new boolean[matrix.length];
        boolean[] colFlag = new boolean[matrix[0].length];

        Arrays.fill(rowFlag, false);
        Arrays.fill(colFlag, false);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    rowFlag[i] = true;
                    colFlag[j] = true;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (rowFlag[i] == true || colFlag[j] == true) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
