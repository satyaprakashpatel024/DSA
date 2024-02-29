package self_PracticeJava;
import java.util.ArrayList;
import java.util.Collections;

public class PermutationString {
    static void permutation(String str,String ans,ArrayList<String> list){
        if(str.isEmpty()){
            list.add(ans);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            String ros = str.substring(0,i)+str.substring(i+1);
            permutation(ros,ans+ch,list);
        }
    }
    static ArrayList<String> getperm(String str){
        ArrayList<String> list = new ArrayList<>();
        permutation(str,"",list);
        Collections.sort(list);
        return list;
    }
    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> list = getperm(str);
        System.out.println(list);
    }
}
