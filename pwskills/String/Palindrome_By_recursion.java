package pwskills.String;

public class Palindrome_By_recursion {

//    method 1:
    static  boolean isPalindrome(String str,int s,int e){
        if(s>=e){
            return true;
        }
        return (str.charAt(s)==str.charAt(e))&&isPalindrome(str,s+1,e-1);
    }
    public static void main(String[] args) {
        String str = "LEevEL";
        int s = 0;
        int e = str.length() -1;
        System.out.println(isPalindrome(str,s,e));
    }
}
