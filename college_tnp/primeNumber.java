package college_tnp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class primeNumber {
    static boolean checkPrimeNumber(int n){
        int i;
        for(i=2; i<n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        boolean check = checkPrimeNumber(n);
        if(check){
            System.out.println(" given number is prime number.");
        }
        else{
            System.out.println(" given number is not a prime number.");
        }
    }
}
