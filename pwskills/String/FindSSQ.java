package pwskills.String;

import java.util.ArrayList;

public class FindSSQ {
//    method 1: returning all subSequence of string by recursion
    static ArrayList<String> printSSQ(String str){
        ArrayList<String> ans = new ArrayList<>();
//        base case
        if(str.length()==0){
            ans.add("");
            return ans;
        }
        char currChar = str.charAt(0);
        ArrayList<String> faith = printSSQ(str.substring(1));
        for(String s: faith){
            ans.add(s);
            ans.add(currChar+s);
        }
        return ans;
    }

//    method 2: printing all subSequence of a string by recursion
    static void printSSQ2(String str,String ans){
        if(str.length()<=0){
            System.out.println(ans);
            return ;
        }
        char currChar = str.charAt(0);
        printSSQ2(str.substring(1),ans);
        printSSQ2(str.substring(1),ans+currChar);
    }
    public static void main(String[] args) {
        String str = "abc";
//        System.out.println(printSSQ(str));
        printSSQ2(str,"");
    }
}
