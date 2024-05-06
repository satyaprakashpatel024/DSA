package pwskills.Backtracking;

public class Rat_In_Maze_2 {
    public static void main(String[] args) {
        int r = 3;
        int c = 3;
        boolean [][]flag = new boolean[r][c];
        mazePath(0,0,r-1,c-1,"",flag);
    }
    public static void mazePath(int sr,int sc,int er,int ec,String path,boolean[][] isVisited) {
        if(sr<0 || sc<0){
            return ;
        }
        if(sr>er || sc>ec ) {
            return;
        }
        if(isVisited[sr][sc]){
            return;
        }
        if(sr==er && sc==ec){
            System.out.println(path);
            return ;
        }
        isVisited[sr][sc] = true;
//        go Down
        mazePath(sr+1,sc,er,ec,path+"D ",isVisited);
//        go right
        mazePath(sr,sc+1,er,ec,path+"R ",isVisited);
//        go left
        mazePath(sr,sc-1,er,ec,path+"L ",isVisited);
//        go up
        mazePath(sr-1,sc,er,ec,path+"U ",isVisited);
//        marking visited way to false for backtracking
        isVisited[sr][sc] = false;
    }
}
