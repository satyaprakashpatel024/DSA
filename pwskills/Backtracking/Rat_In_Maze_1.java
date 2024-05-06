package pwskills.Backtracking;

import temperary.MazePath;

public class Rat_In_Maze_1 {
    public static void main(String[] args) {
        int r = 6;
        int c = 4;
        mazePath(1,1,r,c,"");
        System.out.println(countMazePath(1,1,r,c));
    }

    private static void mazePath(int sr, int sc, int er, int ec,String str) {
        if(sr>er || sc>ec) {
            return;
        }
        if(sr==er&&sc==ec){
            System.out.println(str);
            return ;
        }
//        go Down
        mazePath(sr+1,sc,er,ec," D"+str);
//        go right
        mazePath(sr,sc+1,er,ec," R"+str);
    }
    public static int countMazePath(int sr,int sc,int er,int ec){
        if(sr>er || sc>ec) return 0;
        if(sr==er && sc==ec) return 1;
        return countMazePath(sr+1,sc,er,ec)+countMazePath(sr,sc+1,er,ec);
    }
}
