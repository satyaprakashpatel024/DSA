package pwskills.Recursion;

public class K_Multiples {
    static void printMultiple(int n, int k){
        if(k==0){
            return ;
        }
        printMultiple(n,k-1);
        System.out.print(n*k+" ");
    }
    public static void main(String[] args) {
        int num = 15;
        int k = 10;
        printMultiple(num,k);
    }
}
