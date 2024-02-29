package college_tnp;
// wap to print sum of all even digits of a given number
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Question3Sep22 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter a number : ");
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        while(n>0){
            if((n%10)%2==0){
                sum+=n%10;
            }
            n = n/10;
        }
        System.out.println("even digit sum : "+sum);
    }
}
