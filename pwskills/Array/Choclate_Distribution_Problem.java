package pwskills.Array;

public class Choclate_Distribution_Problem {
    static boolean isDivisionPossible(int arr[],int m,int maxchoc){
        int choc= 0;
        int nos = 1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>maxchoc){
                return false;
            }
            if(choc+arr[i]<=maxchoc){
                choc+=arr[i];
            }
            else{
                nos++;
                choc=arr[i];
            }
        }
        return nos<=m;
    }
    static int MinChoclates(int arr[],int m){
        int strt = 1;
        int end = (int)1e9;
        int ans = 0;
        while(strt<=end){
            int mid = strt+(end-strt)/2;
            if(isDivisionPossible(arr,m,mid)){
                ans = mid;
                end = mid-1;
            }else{
                strt = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]= {12,34,67,90};
        int m = 2;
        System.out.println(MinChoclates(arr,m));
    }
}
