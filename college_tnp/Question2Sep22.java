package college_tnp;
// wap in java to print the no of digits in a given number
import java.util.Scanner;
public class Question2Sep22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();
        sc.close();
        int count = 0;
        while(n>0){
            count++;
            n=n/10;
        }
        System.out.println("number of digits : "+count);
    }
}
