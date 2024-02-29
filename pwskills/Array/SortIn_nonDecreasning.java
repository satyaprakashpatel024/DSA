package pwskills.Array;

public class SortIn_nonDecreasning {
    static  void printarr(int []arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverser(int arr[]){
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    static int[] squareSorted(int []arr){
        int []ans = new int[arr.length];
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int j = n-1;
        while(left<=right){
            if(Math.abs(arr[left])>Math.abs((arr[right]))){
                ans[j--] = arr[left]*arr[left];
                left++;
            }else{
                ans[j--] = arr[right]*arr[right];
                right--;
            }
        }
//        reverser(ans);
        return ans;
    }

    public static void main(String[] args) {
        int []arr = {-9,-8,-4,-3,-1};
        System.out.print("original array : ");
        printarr(arr);
        int []ans = squareSorted(arr);
        System.out.print("square array : ");
        printarr(ans);

    }
}
