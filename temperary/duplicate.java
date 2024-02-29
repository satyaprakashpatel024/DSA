package temperary;

import java.util.ArrayList;
import java.util.List;
public class duplicate {
    static int[] duplicate_arr(int arr[]){
        List<Integer> ans = new ArrayList<>();
        int k = 0;
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    ans.add(arr[i]);
                }
            }
        }
        int arr1[] = new int[ans.size()];
        for(int i:ans){
            arr1[k++] = i;
        }
        return arr1;
    }
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        int arr1[] = duplicate_arr(arr);
        if(arr1.length ==0){
            System.out.println("[]");
            return;
        }
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
