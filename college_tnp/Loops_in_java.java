package college_tnp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loops_in_java {
    public static void main(String[] args) throws IOException {
        int n = 2;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter a base and power : ");
        n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        br.close();
//        Question1(n);
//        n=1;
//        Question2(n);
//        n=5;
//        Question3(n);
//        n=10;
//        Question4(n);
//        Question5(n);
//        Question6(n);
//        Question7(n);
//        Question8(n);
//        Question9(n);
//        Question10(n);
        Question12(n,m);
    }
//    static void Question1(int n){
//        while(n>0) {
//            System.out.println(n--);
//        }
//    }
//
//    static void Question2(int n){
//        do{
//            System.out.println(n);
//            n++;
//        }
//        while(n<=5);
//    }
//    static void Question3(int n){
//        do{
//            System.out.println(n);
//            n--;
//        }
//        while(n>0);
//    }
//
//    WAP to print even number from 10 to 20 with while and do while loop
//    static void Question4(int n){
//        System.out.println(" BY while loop :");
//        while(n<=20){
//            System.out.println(n);
//            n+=2;
//        }
//    }
//
//    static void Question5(int n){
//        System.out.println("BY do while loop : ");
//        do{
//            System.out.println(n);
//            n+=2;
//        }
//        while(n<=20);
//    }
// WAP to print even number using for loop
//    static void Question6(int n){
//        for(int i=1; i<=n; i++){
//            System.out.println(i);
//        }
//    }
//    static void Question7(int n){
//        for(int i=n; i>=1; i--){
//            System.out.println(i);
//        }
//    }
//    static void Question8(int n){
//        for(int i=1; i<=10; i++){
//            System.out.println(n +"  *  " +i+"  =  " +n*i);
//        }
//    }

//    static void Question9(int n){
//        System.out.println("multiple of 3 : ");
//        for(int i=n; i<=20; i++){
//            if(i%3==0){
//                System.out.println(i);
//            }
//        }
//    }

//    static void Question10(int n){
//        for(int i=n; i<50; i++){
//            if(i%3==0 && i%5==0){
//                System.out.println(i);
//            }
//        }
//    }

//    static void Question11(int n){
//        long ans = 1;
//        for(int i=1; i<=n; i++){
//            ans*=i;
//        }
//        System.out.println("factorial of "+n+" : "+ans);
//    }
//    static void Question12(int n){
//        int ans = n*(n+1)/2;
//        System.out.println(ans);
//        ans = 0;
//        for(int i=1;i<=n; i++){
//            ans+=i;
//        }
//        System.out.println(ans);
//    }
    static void Question12(int b,int p){
        int ans = 1;
        for(int i=p; i<=p; i++){
            ans = ans*b;
        }
        System.out.println(ans);
    }
}

