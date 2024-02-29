package self_PracticeJava;

import java.util.Arrays;
class Geeks {
    public static void main(String []args){
        int n = 13;
        int []arr = { 9 ,14, 10, 10 ,1 ,2 ,1 ,7 ,10, 10, 14, 19, 9};
        System.out.println(new Solution().majorityElement(arr, n));
    }
}
class Solution {
    void printArr(int []arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    int majorityElement(int []arr, int n){
        if(n==1){
            return arr[0];
        }
        int count = 1;
        int maxcount = 1;
        int ans = -1;
        int k = n/2;
        Arrays.sort(arr);
        for(int i=0; i<n-1; i++){
            if(arr[i]==arr[i+1]){
                count++;
            }else if(count>maxcount){
                count = maxcount;
                ans = arr[i];
            }else{
                count=1;
            }
        }
        return ans;
    }
}