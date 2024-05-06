package pwskills.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations_String {
    public static void printPermutation(String str,String ans,List<String> l){
        if(str.length()==0){
            l.add(ans);
            return ;
        }
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            String left = str.substring(0,i);
            String right = str.substring(i+1);
            printPermutation(left+right,ans+c,l);
        }
    }
    public static List<String>  permute(String str) {
        List<String> l = new ArrayList<>();
        printPermutation(str,"",l);
        return l;
    }
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(permute(str));
    }
}
