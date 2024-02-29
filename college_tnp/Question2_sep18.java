package college_tnp;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Question2_sep18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter any number: ");
        int n = sc.nextInt();
        switch (n % 2) {

            case 0:
                System.out.println("It's even");
                break;
            default:
                System.out.println("It's odd");
//            default:
                System.out.println("It's prime");
        }
    }
}