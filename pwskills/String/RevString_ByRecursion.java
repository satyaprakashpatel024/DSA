package pwskills.String;

public class RevString_ByRecursion {
    static String revstring(String str){
        if(str.length()==0){
            return "";
        }
        String ans = revstring(str.substring(1));
        return ans+=str.charAt(0);
    }
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(revstring(str));
    }
}
