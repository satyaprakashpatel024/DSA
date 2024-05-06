package pwskills.Backtracking;

public class NQueens {
    private void printBoard(char[][] board) {

        for(int i=0; i<board.length; i++){
            for (int j=0; j<board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    private boolean isSafe(char[][] board, int row, int col) {
        int n = board.length;
//        check the row
        for(int j=0; j<n; j++ ){
            if(board[row][j] == 'Q')
                return false;
        }
//        check the column
        for(int i=0; i<n; i++ ){
            if(board[i][col] == 'Q')
                return false;
        }
//        diagonal check
//        1. upper-left diagonal || North-west diagonal
        int i=row;
        int j=col;
        while(i>=0 && j>=0){
            if(board[i][j] == 'Q')
                return false;
            i--;
            j--;
        }
//        2. upper-right diagonal || North-east diagonal
        i=row;
        j=col;
        while(i>=0 && j<n){
            if(board[i][j] == 'Q')
                return false;
            i--;
            j++;
        }
//        3. lower-left diagonal || South-west diagonal
        i=row;
        j=col;
        while(i<n && j>=0){
            if(board[i][j] == 'Q')
                return false;
            i++;
            j--;
        }

//        4. lower-right diagonal || South-east diagonal
        i=row;
        j=col;
        while(i<n && j<n){
            if(board[i][j] == 'Q')
                return false;
            i++;
            j++;
        }
//        find the safe place
        return true;
    }
    public void solveNQueens(char [][]board,int row){
        if(row==board.length){
            printBoard(board);
            return;
        }
        for(int j=0; j<board.length; j++){
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';
                solveNQueens(board,row+1);
                board[row][j] = '.';
            }
        }
    }
    public static void main(String[] args) {
        NQueens nQueens = new NQueens();
        int n = 4;
        char[][] board = new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }
        nQueens.solveNQueens(board,0);
    }
}
