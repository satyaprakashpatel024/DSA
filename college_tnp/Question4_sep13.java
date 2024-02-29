package college_tnp;

import java.util.Scanner;
public class Question4_sep13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter the number : ");
        int n = sc.nextInt();
        if(n%5==0){
            System.out.println("divisible by 5.");
        }
        else {
            System.out.println(" not divisible by 5.");
        }
    }
}
