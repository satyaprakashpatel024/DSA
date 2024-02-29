package ProblemSolving;

import java.util.Stack;

public class StockSPan {
    static int[] span(int arr[] , int n){
        Stack<Integer> s = new Stack<>();
        int ans[] = new int[n];
        for(int i=0; i<n; i++){
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ans[i] = i+1;
            }else {
                ans[i] = i-s.peek();
            }
            s.push(i);
        }
        return ans;
    }
    static void display(int arr[]){
        for (int i : arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {100,80,60,70,60,75,85};
        int n = arr.length;
        int []ans = span(arr,n);
        display(ans);
    }
}
