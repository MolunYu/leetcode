/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: System_ID
 * Date: 2017-10-25
 * Time: 15:51
 */
public class Solution36 {
    public boolean isValidSudoku(char[][] board) {
        int len = 9;

        boolean[] row = new boolean[len];
        boolean[][] line = new boolean[len][len];
        boolean[][] block = new boolean[len][len];

        for (int i = 0; i < row.length; i++) {
            row[i] = false;
        }
        for (int i = 0; i < line.length; i++) {
            for (int j = 0; j < line[i].length; j++) {
                line[i][j] = false;
            }
        }
        for (int i = 0; i < line.length; i++) {
            for (int j = 0; j < line[i].length; j++) {
                block[i][j] = false;
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                char c = board[i][j];
                int atBlock = i / 3 * 3 + j / 3;

                if (c == '.') continue;
                if (row[c - '1'] == true) return false;
                if (line[j][c - '1'] == true) return false;
                if (block[atBlock][c - '1'] == true) return false;

                row[c - '1'] = true;
                line[j][c - '1'] = true;
                block[atBlock][c - '1'] = true;
            }
            for (int k = 0; k < row.length; k++) {
                row[k] = false;
            }
        }
        return true;
    }
}
