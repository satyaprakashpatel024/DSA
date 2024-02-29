package self_PracticeJava;

public class MaxSum_SubArray_LC53 {
//    method 1:
    static int maxsum_subarray1(int arr[]){ //approach 1
        int maxsum = 0;
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = 0;
            for(int j=i; j<arr.length; j++){
                sum+=arr[j];
                if(sum>maxsum){
                    maxsum = sum;
                }
            }
        }
        return maxsum;
    }

//    method 2:
    static int maxSum_subarray2(int arr[]){ // approach 2
//    kadanes algorithm
        int Maxsum = arr[0];
        int currSum = arr[0];
        for(int i=1; i<arr.length; i++){
            currSum += arr[i];
            if(Maxsum <currSum){
                Maxsum = currSum;
            }
        }
        return Maxsum;
    }
    public static void main(String[] args) {
        int arr[] = {5,6,-3,7,-13,8,-2,5,-6,7,-11,3,10,-10,-6,-10,7,2};
//        System.out.println(maxsum_subarray1(arr));
        System.out.println(maxSum_subarray2(arr));
    }
}
