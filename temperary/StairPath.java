package temperary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class StairPath {
    static ArrayList<String> stairpath(int n){
        if(n<=0){
            ArrayList<String> list = new ArrayList<>();
            if(n==0){
                list.add("");
            }
            return list;
        }
        ArrayList<String> path1 = stairpath(n-1);
        ArrayList<String> path2 = stairpath(n-2);
        ArrayList<String> path3 = stairpath(n-3);
        ArrayList<String> mypath = new ArrayList<>();
        for(String s: path1){
            mypath.add("1"+s);
        }
        for(String s: path2){
            mypath.add("2"+s);
        }
        for(String s: path3){
            mypath.add("3"+s);
        }
        return mypath;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<String> list = stairpath(n);
        System.out.println(list);
    }
}
