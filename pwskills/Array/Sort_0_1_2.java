package pwskills.Array;

public class Sort_0_1_2 {
    static void printarr(int arr[]){
        for(int e:arr){
            System.out.print(e+" ");
        }
        System.out.println();
    }
    static void swap(int arr[], int i,int j){
        int x = arr[i];
        arr[i] = arr[j];
        arr[j] = x;
    }
    static void sortArr(int arr[]){
        int low=0;
        int hi = arr.length-1;
        int mid = 0;
        while(mid<=hi){
            if(arr[mid]==0){
                swap(arr,mid,low);
                mid++;
                low++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(arr,mid,hi);
                hi--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {0 ,2 ,1 ,2 ,0 ,0};
        printarr(arr);
        sortArr(arr);
        printarr(arr);
    }
}
