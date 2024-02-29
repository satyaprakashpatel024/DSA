package pwskills.oopm.ProblemOnOOPs;

public class Fraction {
    public static int gcd(int num, int den){
        int min = Math.min(num,den);
        for(int i=min; i>=1; i--){
            if(num%i == 0 && den%i == 0){
                return i;
            }
        }
        return min;
    }

    public static void add2(fraction f1, fraction f2){
        int numerator = f1.num*f2.den+f2.num*f1.den;
        int denominator = f1.den*f2.den;

        f1 = new  fraction(numerator,denominator);
    }

    public static fraction add(fraction f1, fraction f2){
        int numerator = f1.num*f2.den+f2.num*f1.den;
        int denominator = f1.den*f2.den;

        return new fraction(numerator,denominator);
    }

    public static fraction sub(fraction f1, fraction f2){
        int numerator = f1.num*f2.den-f2.num*f1.den;
        int denominator = f1.den*f2.den;

        return new fraction(numerator,denominator);
    }
    public static fraction mul(fraction f1, fraction f2){
        int numerator = f1.num*f2.num;
        int denominator = f1.den*f2.den;

        return new fraction(numerator,denominator);
    }
    public static class fraction{
        int num;
        int den;
        public fraction(int n, int d){
            this.num=n;
            this.den=d;
            simplify();
        }
        public  void simplify(){
            int hcf = gcd(num,den);
            num = num/hcf;
            den = den/hcf;
        }
    }

    public static void main(String[] args) {
        fraction f1 = new fraction(3,9);
        System.out.println(f1.num+"/"+f1.den);
        fraction f2 = new fraction(3,6);
        System.out.println(f2.num+"/"+f2.den);

//        addition of two fraction
        fraction f3 = add(f1,f2);
        System.out.println("addition of two fraction : "+f3.num+"/"+f3.den);

//        multiplication of two fraction
        fraction f4 = mul(f1,f2);
        System.out.println("multiplication of two fraction : "+f4.num+"/"+f4.den);

//        Subtraction of two fraction
        fraction f5 = sub(f1,f2);
        System.out.println("Subtraction of two fraction : "+f5.num+"/"+f5.den);


    }
}
