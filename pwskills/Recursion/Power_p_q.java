package pwskills.Recursion;

public class Power_p_q {
    static int Exponent(int b, int e){
        if(e==1){
            return b;
        }

        return b*Exponent(b,e-1);
    }
    public static void main(String[] args) {
        int base = 4;
        int power = 3;
        System.out.println(Exponent(base,power));
    }
}
