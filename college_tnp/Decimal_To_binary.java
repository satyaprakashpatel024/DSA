package college_tnp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Decimal_To_binary {
    static int DecimalBinary(int n){
        int []ans = new int[n/2+1];
        int indx = 0;
        while(n>0){
            int digit = n%2;
            ans[indx++] = digit;
            n = n/2;
        }
        int num = 0;
        for(int i=ans.length-1; i>=0; i--){
            num = num*10+ans[i];
        }
        return num;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int ans = DecimalBinary(n);
        System.out.println(ans);
    }
}
