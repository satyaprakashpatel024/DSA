package pwskills.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutation_Array {
    private static void swap(int i,int j,int []arr){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
    public static void optimizeHelper(int arr[],int indx,List<List<Integer>> ans){
        if(indx==arr.length-1){
            List<Integer> l = new ArrayList<>();
            for(var ele:arr){
                l.add(ele);
            }
            ans.add(l);
            return;
        }
        for(int i=indx; i<arr.length; i++){
            swap(i,indx,arr);
            optimizeHelper(arr,indx+1,ans);
            swap(i,indx,arr);
        }
    }
    private static void helper(int []arr,List<Integer> l,boolean isVisited[],List<List<Integer>> ans){
        if(l.size()==arr.length){
            List<Integer> ll = new ArrayList<Integer>(l);
            ans.add(ll);
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(!isVisited[i]){
                l.add(arr[i]);
                isVisited[i] = true;
                helper(arr,l,isVisited,ans);
                isVisited[i] = false;
                l.removeLast();
            }
        }
    }
    public static List<List<Integer>> printArrayPermutation(int[] arr) {
//        boolean isVisited[] = new boolean[arr.length];
        List<List<Integer>> result = new ArrayList<>();
//        List<Integer> l = new ArrayList<>();
//        helper(arr, l, isVisited, result);
        optimizeHelper(arr, 0, result);
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        List<List<Integer>> result = printArrayPermutation(arr);
        for(var l:result){
            System.out.println(l);
        }
    }
}
