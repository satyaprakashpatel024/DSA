package pwskills.SortingAlgorithm;

public class CountingSort {
    static void display(int arr[]){
        for( int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    static int findMax(int arr[]){
        int ans = arr[0];
        for(int ele:arr){
            if(ele>ans){
                ans = ele;
            }
        }
        return ans;
    }
//    Unstable Approach
    static void Count_Sort(int []arr){
//        find maximum number
        int max = findMax(arr);
//        creating frequency array
        int []freq = new int[max+1];
        for(int i :arr){
            freq[i]++;
        }
        int k  = 0;
        for(int i=0; i<freq.length; i++){
            for(int j=0; j<freq[i]; j++){
                arr[k++] = i;
            }
        }
    }

//    Stable Approach:
    static void Countsort(int []arr){
        int n = arr.length;
        //        find maximum number
        int max = findMax(arr);
        //        creating frequency array
        int []freq = new int[max+1];
        for(int i :arr){
            freq[i]++;
        }
//          prefix sum
        for(int i=1; i<freq.length; i++){
            freq[i] = freq[i]+freq[i-1];
        }

        int k  = 0;
        int ans[] = new int[n];
        for(int i=n-1; i>=0; i--){
            int indx = freq[arr[i]]-1;
            ans[indx] = arr[i];
            freq[arr[i]]--;
        }
        for(int i=0; i<ans.length; i++){
            arr[i] = ans[i];
        }
    }
    public static void main(String[] args) {
        int []arr = {5,1,1,2,4,5,3,4,3,2,1};
        System.out.print("unsorted array : ");
        display(arr);
//        Count_Sort(arr);
        Countsort(arr);
        System.out.print("unsorted array : ");
        display(arr);
    }
}
