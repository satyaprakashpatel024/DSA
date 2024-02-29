package college_tnp;
//wap to check whether the given number is palindrome or not.
import java.util.Scanner;
public class Question6Sep22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        sc.close();
        int temp = num;
        int rnum = 0;
        while(num>0){
            rnum = rnum*10 + num%10;
            num = num/10;
        }
        if(temp == rnum){
            System.out.println(" palindrome.");
        }else{
            System.out.println("Not a palindrome.");
        }
    }
}
