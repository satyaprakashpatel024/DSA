package self_PracticeJava;

public class SecondLargest {
//    second smallest number in an array
    static int secondSmallest(int arr[]){
        int min1=0,min2=0;
        if(arr[0]<arr[1]){
            min1=arr[0];
            min2=arr[1];
        }
        else{
            min1=arr[1];
            min2=arr[0];
        }

        for(int i=2; i<arr.length; i++){
            if(arr[i]<min1){
                min2 = min1;
                min1 = arr[i];
            }
            else if(arr[i]<min2){
                min2 = arr[i];
            }
        }
        return min2;
    }
//    second largest number in an array
    static int secondLargest(int arr[]){
        int max1=0,max2=0;
        if(arr[0]>arr[1]){
            max1=arr[0];
            max2=arr[1];
        }
        else{
            max1=arr[1];
            max2=arr[0];
        }

        for(int i=2; i<arr.length; i++){
            if(arr[i]>max1){
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i]>max2){
                max2 = arr[i];
            }
        }
        return max2;
    }
    public static void main(String[] args) {
        int arr[] = {20,25,53,56,85,75,49,89};
        System.out.println(secondLargest(arr));
        System.out.println(secondSmallest(arr));
    }
}
