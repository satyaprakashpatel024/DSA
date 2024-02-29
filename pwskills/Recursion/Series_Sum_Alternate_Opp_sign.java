package pwskills.Recursion;

public class Series_Sum_Alternate_Opp_sign {
    static int seriesSum(int n){
        if(n<=1){
            return n;
        }

        int ans = seriesSum(n-1);
        if(n%2==0){
            ans = ans-n;
        }
        else{
            ans+=n;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 9;
        int ans = seriesSum(n);
        System.out.println(ans);
    }
}
