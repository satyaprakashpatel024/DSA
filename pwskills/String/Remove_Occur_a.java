package pwskills.String;

public class Remove_Occur_a {
    static StringBuilder solve(String str,int indx,StringBuilder sb){
        if(indx==str.length()){
            return sb;
        }
        if(str.charAt(indx)!='a'){
            sb.append(str.charAt(indx));
        }
        return solve(str,indx+=1,sb);
    }
    static String removeA(String str,int indx){
        if(indx==str.length()){
            return "";
        }
        String faith = removeA(str,indx+1);
        char currChar = str.charAt(indx);
        if(currChar!='a'){
            faith=currChar+faith;
        }
        return faith;
    }
    public static void main(String[] args) {
        String str = "Raksha";
        System.out.println(removeA(str,0));
    }
}
