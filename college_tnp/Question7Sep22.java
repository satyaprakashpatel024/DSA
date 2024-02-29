package college_tnp;

import java.util.Scanner;

public class Question7Sep22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        sc.close();
        int temp = num;
        int ans = 0;
        int c = 0;
        while(temp>0){
            c++;
            temp = temp/10;
        }
        int pow = c;
        temp = num;
        while(temp>0){
            int r = temp%10;
            int a = 1;
            c = pow;
            while(c>0){
                a = a*r;
                c--;
            }
            ans = ans+a;
            temp = temp/10;
        }
        if(ans==num) {
            System.out.println("armstrong number.");
        }else {
            System.out.println("not a armstrong number.");
        }
    }
}
