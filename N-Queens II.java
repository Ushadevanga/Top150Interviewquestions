// Approach -1
class Solution {
    public int totalNQueens(int n) {
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        return dfs(0, board);
    }

    int dfs(int col, char[][] board) {
        if (col == board.length) {
            return 1;
        }

        int count = 0;
        for (int row = 0; row < board.length; row++) {
            if (isValid(row, col, board)) {
                board[row][col] = 'Q';
                count += dfs(col + 1, board);
                board[row][col] = '.';
            }
        }
        return count;
    }

    boolean isValid(int row, int col, char[][] board) {
        int dr = row;
        int dc = col;

        // Check upper diagonal on left side
        while (row >= 0 && col >= 0) {
            if (board[row][col] == 'Q') return false;
            row--;
            col--;
        }

        row = dr;
        col = dc;

        // Check left side
        while (col >= 0) {
            if (board[row][col] == 'Q') return false;
            col--;
        }

        row = dr;
        col = dc;

        // Check lower diagonal on left side
        while (row < board.length && col >= 0) {
            if (board[row][col] == 'Q') return false;
            row++;
            col--;
        }

        return true;
    }
}
