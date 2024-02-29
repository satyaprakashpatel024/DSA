package pwskills.Array;

public class SortIn_Linear {
    static void printarr(int arr[]){
        for(int e:arr){
            System.out.print(e+" ");
        }
        System.out.println();
    }
    static void SortArray(int arr[]){
        int x = -1;
        int y = arr.length-1;
        for(int i=1; i<arr.length; i++){
            if(arr[i-1]>arr[i]){
                if(x==-1){
                    x = i-1;
                }
                else{
                    y = i;
                }
            }
        }
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {3, 8, 6, 7, 5, 9, 10};
        printarr(arr);
        SortArray(arr);
        printarr(arr);
    }
}
