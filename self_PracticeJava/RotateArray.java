package self_PracticeJava;

public class RotateArray {

    public static void rotate(int []arr,int s,int e){
        while(s<=e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
    public static void RotateArr(int []arr,int k){
        k = k%arr.length;
        rotate(arr,(arr.length-k),arr.length-1);
        rotate(arr,0,(arr.length-k-1));
        rotate(arr,0,arr.length-1);
    }
    public static void printArr(int []arr){
        for(int num : arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int []arr  = {1,2,3,4,5,6,7};
        int k = 10;
        System.out.print(" Original Array : ");
        printArr(arr);

        RotateArr(arr,k);

        System.out.print("\n Rotated Array : ");
        printArr(arr);

    }
}
