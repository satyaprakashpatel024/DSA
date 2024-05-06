package pwskills.Backtracking;

public class ValidSudoko {
        public static boolean isValid(char [][]board,int row,int col,char num){
            // check row
            for(int j=0; j<9; j++){
                if(board[row][j]==num) return false;
            }
            // check column
            for(int i=0; i<9; i++){
                if(board[i][col]==num) return false;
            }
            // 3X3 square box/matrix
            int x = (row/3)*3;
            int y = (col/3)*3;
            for(int i=x; i<x+3; i++){
                for(int j=y; j<y+3; j++){
                    if(board[i][j]==num){
                        return false;
                    }
                }
            }
            return true;
        }
        public static boolean isValidSudoku(char[][] board) {
            int n = board.length;
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if(board[i][j] == '.'){
                        continue;
                    }
                    char num = board[i][j];
                    board[i][j] = '.';
                    if (!isValid(board, i, j, num)) {
                        return false;
                    }
                    board[i][j] = num;
                }
            }
            return true;
        }

    public static void main(String[] args) {
        char [][]board;
        board = new char[][]{
                                {'5','3','.','.','7','.','.','.','.'},
                                {'6','.','.','1','9','5','.','.','.'},
                                {'.','9','8','.','.','.','.','6','.'},
                                {'8','.','.','.','6','.','.','.','3'},
                                {'4','.','.','8','.','3','.','.','1'},
                                {'7','.','.','.','2','.','.','.','6'},
                                {'.','6','.','.','.','.','2','8','.'},
                                {'.','.','.','4','1','9','.','.','5'},
                                {'.','.','.','.','8','.','.','7','9'}};
        isValidSudoku(board);
        }
}
