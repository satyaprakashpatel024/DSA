package college_tnp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question4_sep15 {
    public static void main(String[] args) throws Exception {
        System.out.println(" enter your choice : ");
        System.out.println(" + for addition ");
        System.out.println(" - for subtraction ");
        System.out.println(" * for multiplication ");
        System.out.println(" / for division ");
        System.out.println(" % for remainder ");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char op = (char)br.read();
        br.readLine();
        System.out.print("Enter first Number : ");
        int a = Integer.parseInt(br.readLine());
        System.out.print("Enter second Number : ");
        int b = Integer.parseInt(br.readLine());
        br.close();
        if (op == '+') {
            System.out.println("Addition : "+a+b);
        }
        else if(op=='-'){
            System.out.println("Subtraction : "+(a-b));
        }
        else if(op=='*'){
            System.out.println("Multiplication : "+a*b);
        }
        else if(op=='/'){
            System.out.println("Division : "+a/b);
        }
        else if(op=='%'){
            System.out.println("Remainder : "+a%b);
        }
    }
}
