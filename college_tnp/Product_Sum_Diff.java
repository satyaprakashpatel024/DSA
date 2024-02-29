package college_tnp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Product_Sum_Diff {
    static int difference(int n){
        int sum = 0;
        int product = 1;
        while(n>0){
            int digit = n%10;
            sum+=digit;
            product*=digit;
            n = n/10;
        }
        return (product-sum);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        int ans = difference(n);
        System.out.println(ans);
    }
}
