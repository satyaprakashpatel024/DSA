package self_PracticeJava;
//package javaprogram.Arrays.Data_structure;

public class test {
    public static void sort(int arr[]){
        int min = arr[0];
        int max = arr[0];
        for(int ele: arr){
            min = Math.min(min,ele);
            max = Math.max(max,ele);
        }
//        frequency
        int farr[] = new int[max-min+1];
        for(int i=0; i<arr.length; i++){
            farr[(arr[i] - min)]+=1;
        }
//        prefixsum
        for(int i=1; i<farr.length; i++){
            farr[i] = farr[i-1]+farr[i];
        }

        int ans[] = new int[arr.length];
        for(int i=arr.length-1; i>=0; i--){
            int ele = arr[i];
            int pos = farr[ele-min];
            ans[pos-1] = ele;
            farr[ele-min]--;
        }
        int indx = 0;
        for(int ele: ans){
            arr[indx++]  = ele;
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,2,1,2,1,3};
        System.out.println("Original array:");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        sort(arr);
        System.out.println();
        System.out.println("Sorted array:");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
