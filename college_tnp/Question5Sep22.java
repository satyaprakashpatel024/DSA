package college_tnp;
// wap in java to reverse a number.
import java.util.Scanner;
public class Question5Sep22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        sc.close();
        int rnum = 0;
        while(n>0){
            rnum = rnum*10 + n%10;
            n = n/10;
        }
        System.out.println( "reverse num : "+rnum);
    }
}
