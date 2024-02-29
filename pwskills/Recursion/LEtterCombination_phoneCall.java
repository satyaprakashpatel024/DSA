package pwskills.Recursion;

public class LEtterCombination_phoneCall {
    static void combination(String digit,String[] kp,String ans){
        if(digit.length()==0){
            System.out.print(ans+" ");
            return;
        }
        int indx = digit.charAt(0)-'0';
        String currChoice = kp[indx];
        for(int i=0; i<currChoice.length(); i++){
            combination(digit.substring(1),kp,ans+currChoice.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str = "23";
        String []kp = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
//                      0  1   2     3      4    5     6      7      8      9
        combination(str,kp,"");
    }
}
