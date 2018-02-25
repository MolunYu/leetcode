/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: System_ID
 * Date: 2017-11-29
 * Time: 20:37
 */
public class Solution79 {
    public boolean exist(char[][] board, String word) {
        char[] w = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (exist(board, i, j, w, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean exist(char[][] board, int x, int y, char[] word, int index) {
        if (index == word.length) {
            return true;
        }
        if (x < 0 || x >= board.length || y < 0 || y >= board[0].length) {
            return false;
        }
        if (board[x][y] != word[index]) {
            return false;
        }
        final int mask = 256;
        board[x][y] ^= mask;
        boolean exist = exist(board, x - 1, y, word, index + 1) ||
                exist(board, x, y - 1, word, index + 1) ||
                exist(board, x + 1, y, word, index + 1) ||
                exist(board, x, y + 1, word, index + 1);
        board[x][y] ^= mask;
        return exist;
    }
}
