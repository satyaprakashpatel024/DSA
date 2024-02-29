package pwskills.Recursion;

public class Frog_Jump {
    static int printMinJump(int []h,int n,int indx){
        if(indx==n-1){
            return 0;
        }
        int op1 =  Math.abs(h[indx]-h[indx+1])+printMinJump(h,n,indx+1);
        if(indx==n-2) return op1;
        int op2 = Math.abs(h[indx]-h[indx+2])+printMinJump(h,n,indx+2);
        return Math.min(op1,op2);
    }
    public static void main(String[] args) {
        int h [] = {10,30,40,20};
        int ans = printMinJump(h,h.length,0);
        System.out.println("minimum jump to reach n : "+ans);
    }
}
