package pwskills.Recursion;

public class Sum_Of_Digits_Of_A_Number {


    static int printDigitSum(int n){
        if(n>=0 && n<=9){
            return n;
        }
        return (n%10)+printDigitSum(n/10);
    }

    static int countDigits(int n){
        if(n>=0 && n<=9){
            return 1;
        }
        return 1+countDigits(n/10);
    }
    public static void main(String[] args) {
        int num = 4444;
//        System.out.println(printDigitSum(num));
        System.out.println(countDigits(num));
    }
}
