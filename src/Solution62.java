/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: System_ID
 * Date: 2017-11-21
 * Time: 20:59
 */
public class Solution62 {
    public int uniquePaths(int m, int n) {
        int[][] grid = new int[m + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            grid[0][i] = 0;
        }
        for (int i = 0; i <= m; i++) {
            grid[i][0] = 0;
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 & j == 1) {
                    grid[1][1] = 1;
                    continue;
                }
                grid[i][j] = grid[i][j - 1] + grid[i - 1][j];
            }
        }
        return grid[m][n];
    }
}
