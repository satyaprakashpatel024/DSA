package college_tnp;

import java.util.Scanner;

public class ArrayInJava {
    public static void main(String[] args) {
        // first method : statically declaration
        int[]num = new int[5];
        // second method : Dynamic declaration of array
//        int num1[]= new int[5];
//        num1[0] = 10;
//        num1[1] = 20;
//        num1[2] = 30;
//        num1[3] = 40;
//        num1[4] = 50;
                            // input in array without loop
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter element of index 0 : ");
//        num[0] = sc.nextInt();
//        System.out.print("Enter element of index 1 : ");
//        num[1] = sc.nextInt();
//        System.out.print("Enter element of index 2 : ");
//        num[2] = sc.nextInt();
//        System.out.print("Enter element of index 3 : ");
//        num[3] = sc.nextInt();
//        System.out.print("Enter element of index 4 : ");
//        num[4] = sc.nextInt();

                        // input with thw help of loop
        for(int i=0; i<num.length; i++){
            System.out.print("Enter element of index "+i+" : ");
            num[i] = sc.nextInt();
        }
        sc.close();

        System.out.print("Length of array : "+num.length+"\nArray elements : ");

//        System.out.println(num[0]);
//        System.out.println(num[1]);
//        System.out.println(num[2]);
//        System.out.println(num[3]);
//        System.out.println(num[4]);
        for(int i=0; i<num.length; i++){
            System.out.print(num[i]+" ");
        }
    }
}
