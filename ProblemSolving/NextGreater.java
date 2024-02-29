package ProblemSolving;

import java.util.Stack;

public class NextGreater {
    public static int [] nxtgreater(int arr[]){
        Stack<Integer> s = new Stack<>();
        int ans[] = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            while(!s.isEmpty() && arr[s.peek()]<arr[i]){
                ans[s.pop()] = arr[i];
            }
            s.push(i);
        }
        while(!s.isEmpty()){
            ans[s.pop()] = -1;
        }
        return ans;
    }
    public static void display(int []arr){
        for (int i : arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int []arr = {7,8,1,4};
        int [] a = nxtgreater(arr);
        display(a);
    }
}
