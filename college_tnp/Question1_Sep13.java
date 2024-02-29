package college_tnp;

import java.util.Scanner;
public class Question1_Sep13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if(n>0){
            System.out.println(" positive number.");
        }
        else{
            System.out.println("negative number\"");
        }
    }
}
