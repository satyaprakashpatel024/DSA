package pwskills.SortingAlgorithm;

public class RadixSort {
    static void display(int arr[]){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    static int findMax(int arr[]){
        int ans = arr[0];
        for(int ele : arr){
            if(ele>ans){
                ans = ele;
            }
        }
        return ans;
    }
    static void CountSort(int []arr,int place){
        int n = arr.length;
        //creating frequency array : on the basis of place value
        int []freq = new int[10];
        for(int i=0; i<arr.length; i++){
            freq[(arr[i]/place)%10]++;
        }
        //prefix sum
        for(int i=1; i<freq.length; i++){
            freq[i] = freq[i]+freq[i-1];
        }

        int k  = 0;
        int ans[] = new int[n];
        for(int i=n-1; i>=0; i--){
            int indx = freq[(arr[i]/place)%10]-1;
            ans[indx] = arr[i];
            freq[(arr[i]/place)%10]--;
        }
        for(int i=0; i<ans.length; i++){
            arr[i] = ans[i];
        }
    }
    static void Radix_sort(int arr[]){
        int max = findMax(arr);
        for(int place=1; max/place>0; place*=10){
            CountSort(arr,place);
        }
    }
    public static void main(String[] args) {
        int arr[] = {170,45,75,90,802,2};
        System.out.println("Unsorted array : ");
        display(arr);
        Radix_sort(arr);
        System.out.println("Unsorted array : ");
        display(arr);
    }
}
