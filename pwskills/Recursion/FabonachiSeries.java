package pwskills.Recursion;

public class FabonachiSeries {
    static int fabonachi(int n){
        if(n==0 || n==1){
            return n;
        }
        return fabonachi(n-1)+fabonachi(n-2);
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(fabonachi(n));
    }
}
