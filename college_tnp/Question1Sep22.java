package college_tnp;
// wap to print the sum of all digits of given number
import java.util.Scanner;
public class Question1Sep22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();
        sc.close();
        int sum = 0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        System.out.println("sum : "+sum);
    }
}
