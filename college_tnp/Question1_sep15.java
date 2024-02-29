package college_tnp;
// wap  a java program to check given character is upper case of lowercase or digit or special character
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Question1_sep15 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Enter any character : ");
        char c = (char)br.read();
        br.close();
        if(c>='a' && c<='z'){
            System.out.println(" lower case character.");
        }
        else if(c>='A' && c<='Z'){
            System.out.println(" Upper case character.");
        }
        else if(c>='0' && c<='9'){
            System.out.println(" Numbers.");
        }
        else{
            System.out.println(" Special character.");
        }
    }
}
