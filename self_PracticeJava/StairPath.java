package self_PracticeJava;

import java.util.ArrayList;

public class StairPath {
    static void stairpath(int n,String str,ArrayList<String> list){
        if(n<0)
            return;
        if(n==0) {
            list.add(str);
            return;
        }
        stairpath(n-1,str+"1",list);
        stairpath(n-2,str+"2",list);
        stairpath(n-3,str+"3",list);
    }
    public static void main(String[] args) {
        int n = 3;
        ArrayList<String> list = new ArrayList<>();
        stairpath(n,"",list);
        System.out.println(list);
    }
}
