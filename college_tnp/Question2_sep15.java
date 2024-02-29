package college_tnp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question2_sep15 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Enter a Number : ");
        int num = Integer.parseInt(br.readLine());
        br.close();
        if(num<=9){
            System.out.println(" One digit number.");
        }
        else if(num<=99){
            System.out.println(" two digit number.");
        }
        else if(num<=999){
            System.out.println(" three digit number.");
        }
        else if(num<=9999){
            System.out.println(" four digit number.");
        }
        else{
            System.out.println(" more than four digit.");
        }
    }
}
