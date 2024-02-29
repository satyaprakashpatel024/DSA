package pwskills.Array;

public class SqrtBy_BinarySearch {
    static int SQRT(int n){
        int ans = 0;
        int low = 0;
        int high = n;
        while(low<=high){
            int mid = (high-low)/2+low;
            if(mid*mid==n){
                ans = mid;
                break;
            } else if (mid*mid>n) {
                high = mid-1;
            }else{
                ans = mid;
                low = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int num = 29;
        System.out.println(SQRT(num));
    }
}
