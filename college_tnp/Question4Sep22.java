package college_tnp;
// wap to print the difference of maximum and minimum digit of any number
import java.util.Scanner;
public class Question4Sep22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        sc.close();
        int min = 9;
        int max = 0;
        while(n>0){
            int r = n%10;
            if(r>max){
                max = r;
            }
            else{
                min = r;
            }
            n = n/10;
        }
        System.out.println(max-min);
    }
}
