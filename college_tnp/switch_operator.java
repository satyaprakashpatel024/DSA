package college_tnp;

import java.net.StandardSocketOptions;
import java.util.Scanner;

public class switch_operator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter any character: ");
        char ch=sc.next().charAt(0);
        switch (ch){
                case 'a':
                case 'A':
                System.out.println("It's vowel");
                break;
            case 'e':
                case 'E':
                System.out.println("It's vowel");
                break;
            case 'i':
            case 'I':
                System.out.println("It's vowel");
                break;
            case 'o':
            case 'O':
                System.out.println("It's vowel");
                break;
            case 'u':
            case 'U':
                System.out.println("It's vowel");
                break;
            default:
                System.out.println("It's Contstant");


        }


    }
}
