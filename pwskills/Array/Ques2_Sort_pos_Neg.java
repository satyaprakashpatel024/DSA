package pwskills.Array;

public class Ques2_Sort_pos_Neg {
    static void printarr(int arr[]){
        for(int e:arr){
            System.out.print(e+" ");
        }
        System.out.println();
    }
    static void Pos_Neg(int []arr){
        int l = 0;
        int r = arr.length-1;
        while(l<r){
            while(arr[l]<0){
                l++;
            }
            while(arr[r]>0){
                r--;
            }
            if(l<r){
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                r--;
                l++;
            }
        }
    }
    public static void main(String[] args) {
        int []arr = { 19, -20, 7, -4, -13, 11, -5, 3};
        printarr(arr);
        Pos_Neg(arr);
        printarr(arr);
    }
}
