package pwskills.Backtracking;

public class Rat_In_Maze_3 {
    public static void main(String[] args) {
        int r = 3;
        int c = 4;
        boolean [][]flag = new boolean[r][c];
        int maze[][] = {{1,0,1,1},
                        {1,1,1,1},
                        {1,1,0,1}};
//        mazePathTwoDir(0,0,r-1,c-1,"",maze);
        mazePathOptimizeFourDir(0,0,r-1,c-1,"",maze);
    }
    public static void mazePathTwoDir(int sr,int sc,int er,int ec,String path,int [][]maze){
        if(sr<0 || sc<0 ) return ;
        if(sr>er || sc>ec) return ;
        if(sr==er && sc==ec){
            System.out.println(path);
            return ;
        }
        if(maze[sr][sc]==0) return ;
//        go right
        mazePathTwoDir(sr,sc+1,er,ec,path+" R",maze);
//        go Down
        mazePathTwoDir(sr+1,sc,er,ec,path+" D",maze);
    }
    public static void mazePathFourDir(int sr,int sc,int er,int ec,String path,int [][]maze,boolean [][]isVisited){
        if(sr<0 || sc<0) return ;
        if(sr>er || sc>ec ) return;
        if(maze[sr][sc]==0) return ;
        if(isVisited[sr][sc]) return;
        if(sr==er && sc==ec){
            System.out.println(path);
            return ;
        }
        isVisited[sr][sc] = true;
//        go Down
        mazePathFourDir(sr+1,sc,er,ec,path+"D ",maze,isVisited);
//        go right
        mazePathFourDir(sr,sc+1,er,ec,path+"R ",maze,isVisited);
//        go left
        mazePathFourDir(sr,sc-1,er,ec,path+"L ",maze,isVisited);
//        go up
        mazePathFourDir(sr-1,sc,er,ec,path+"U ",maze,isVisited);
//        marking visited way to false for backtracking
        isVisited[sr][sc] = false;
    }
    public static void mazePathOptimizeFourDir(int sr,int sc,int er,int ec,String path,int [][]maze){
        if(sr<0 || sc<0) return ;
        if(sr>er || sc>ec ) return;
        if(maze[sr][sc]==0) return ;
        if(sr==er && sc==ec){
            System.out.println(path);
            return ;
        }
        if(maze[sr][sc]==-1) return ;
        maze[sr][sc]=-1;
//        go Down
        mazePathOptimizeFourDir(sr+1,sc,er,ec,path+"D ",maze);
//        go right
        mazePathOptimizeFourDir(sr,sc+1,er,ec,path+"R ",maze);
//        go left
        mazePathOptimizeFourDir(sr,sc-1,er,ec,path+"L ",maze);
//        go up
        mazePathOptimizeFourDir(sr-1,sc,er,ec,path+"U ",maze);
//        marking visited way to false for backtracking
        maze[sr][sc]=1;
    }
}
