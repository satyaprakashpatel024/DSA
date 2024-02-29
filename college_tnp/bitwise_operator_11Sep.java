package college_tnp;

import java.util.Scanner;

public class bitwise_operator_11Sep {
    public static void main(String[] args) {
//        bitwise not operator
//        0 0 0 0 0 1 1 0 => 6
//        1 1 1 1 1 0 0 1 =>~6
        // used or calculated when printing the value
//        1 0 0 0 0 1 1 0 => 1s complement
//        +             1 => 2`s complement
//        1 0 0 0 0 1 1 1 => -7 ans

        /* bitwise left shift */
//        int x = 4;
//        int y = x<<1;
//        0 1 0 0 => binary number(4)
//        1 0 0 0 => 1 bit left shift
//        System.out.println(y);
//        System.out.println(x<<2);

                // bitwise right shift //
//        int x = 7;
//        int y = x>>1;
//      0 1 1 1 => binary number(7)
//      0 0 1 1 => 4 1 bit right shift
//        System.out.println(y);

//         ternary operator in java
//        SYNTAX
//        (condition1)?(true: expression1 executed):(false: expression2 executed);
//        int n = sc.nextInt();
//        sc.close();
//        System.out.println((n%2==0)?"even number":"odd number");

//        Question 1: program to compare two number using ternary operator
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter number 1 : ");
        int  x= sc.nextInt();
        System.out.print(" enter number 2 : ");
        int y = sc.nextInt();
        sc.close();
        String str = (x>y)?"number1 is greater":(x==y)?"both are equal":"number2 is greater";
        System.out.println(str);

    }
}
