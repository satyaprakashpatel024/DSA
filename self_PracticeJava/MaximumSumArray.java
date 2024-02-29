package self_PracticeJava;

public class MaximumSumArray {

    public static int MaxSubArraySum(int []arr,int n){
//        int Maxsum = 0;
//        for(int i=0; i<n; i++) {
//            int sum = 0;
//            for (int j = i; j <n; j++) {
//                sum += arr[j];
//                if (sum > Maxsum) {
//                    Maxsum = sum;
//                }
//            }
//        }
//        return Maxsum;

        int Maxsum = 0;
        int currSum = 0;
        for(int i=0; i<arr.length; i++){
            if(currSum>=0){
                currSum+=arr[i];
            }else {
                currSum = arr[i];
            }
            if(currSum>Maxsum){
                Maxsum=currSum;
            }
        }
        return Maxsum;
    }

    public static void main(String[] args) {
        int []arr= {1,-3,2,1,-1};
        int n = arr.length;

        int ans = MaxSubArraySum(arr,n);
        System.out.println("asdfghjkl  "+ans);
    }
}
