class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int r=0; r<9; r++) {
            for(int c=0; c<9; c++) {
                if(board[r][c] != '.' && !isValidPlace(board,r,c,board[r][c])) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean isValidPlace(char[][] board, int row, int col, char ch) {

        //Column
        for(int c=0; c<9; c++){
            if(col != c && board[row][c] == ch) {
                return false;
            }
        }
        for(int r=0; r<9; r++){
            if(row != r && board[r][col] == ch) {
                return false;
            }
        }
    int stCol = (col/3) * 3;
		int stRow = (row/3) * 3;
        for(int r =0; r< 3; r++) {
            for(int c=0; c< 3; c++) {
                if(row != r+stRow && col != c+stCol && board[r+stRow][c+stCol] == ch) {
                    return false;
                }
            }
        }
        return true;
    }
}
