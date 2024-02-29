package college_tnp;

import java.util.Scanner;

public class Question3_sep13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter the first number : ");
        int n = sc.nextInt();
//        System.out.print(" enter the second number : ");
//        int m = sc.nextInt();
        if(n%2==0){
            System.out.println(n+" is even.");
        }
        else{
            System.out.println(n+" is odd.");
        }

    }
}
