package college_tnp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question3_sep15 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(" enter a character : ");
        char ch = (br.readLine()).charAt(0);
        br.close();
        if(ch>='a'){
            if(ch<='z'){
                System.out.println(" lower case.");
            }
        }
        else if(ch>='A'){
            if(ch<='Z'){
                System.out.println(" upper case.");
            }
        }
        System.out.println((int)'8');
    }
}
