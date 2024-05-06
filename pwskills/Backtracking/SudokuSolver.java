package pwskills.Backtracking;

public class SudokuSolver {
        public boolean isValid(char[][] board, int row, int col, char num) {
            // check row
            for (int j = 0; j < 9; j++) {
                if (board[row][j] == num)
                    return false;
            }
            // check column
            for (int i = 0; i < 9; i++) {
                if (board[i][col] == num)
                    return false;
            }
            // 3X3 square box/matrix
            int x = (row / 3) * 3;
            int y = (col / 3) * 3;
            for (int i = x; i < x + 3; i++) {
                for (int j = y; j < y + 3; j++) {
                    if (board[i][j] == num) {
                        return false;
                    }
                }
            }
            return true;
        }

        private void solve(char[][] board, int row, int col) {

            if (board[row][col] != '.') { // call
                if (col != 8)
                    solve(board, row, col + 1);
                else
                    solve(board, row + 1, 0);
            } else {
                for (char c = '1'; c <= '9'; c++) {
                    if (isValid(board, row, col, c)) {
                        board[row][col] = c;
                        if (col != 8)
                            solve(board, row, col + 1);
                        else
                            solve(board, row + 1, 0);
                        board[row][col] = '.';
                    }
                }
            }
        }

        public void solveSudoku(char[][] board) {
            solve(board, 0, 0);
        }
    public static void main(String[] args) {

    }
}
