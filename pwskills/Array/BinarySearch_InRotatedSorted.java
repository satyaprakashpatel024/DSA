package pwskills.Array;

public class BinarySearch_InRotatedSorted {
//    Binary Search in Rotated Sorted arry - II : duplicates element present
    static boolean BinarySearch_In_rotated_arr2(int arr[],int key){
        int n = arr.length;
        int st = 0;
        int end = n-1;
        while(st<=end){
            int mid = (end+st)/2;
            if(arr[mid]==key){
                return true;
            }
            else if (arr[st]==arr[mid]&&arr[mid]==arr[end]){
                st++;
                end--;
            }
            else if(arr[mid]<=arr[end]){
                if(key > arr[mid] && key <= arr[end]){
                    st=mid+1;
                }else{
                    end=mid-1;
                }
            }else{
                if(key>=arr[st] && key<arr[mid]){
                    end=mid-1;
                }else{
                    st=mid+1;
                }
            }
        }

        return false;
    }

//    Binary search in rotated sorted arra y - I : no duplicates
    static boolean BinarySearch_In_rotated_arr(int arr[],int key){
        int n = arr.length;
        int l=0;
        int h = n-1;
        while(l<=h){
            int m = (h+l)/2;
            if(arr[m]==key){
                return true;
            }
            else if(arr[m]<arr[h]){
                if(arr[m]<key&&arr[h]<=key){
                    l=m+1;
                }else{
                    h=m-1;
                }
            }else{
               if(key>=arr[l]&&key<=arr[m]){
                   h=m-1;
               }else{
                   l=m+1;
               }
            }
        }
        return false;
    }
    static int Min_In_rotated_arr(int arr[]){
        int indx = -1;
        int l=0;
        int h=arr.length-1;
        while(l<=h){
            int m = (l+h)/2;
            if(arr[m]<=arr[arr.length-1]){
                indx = m;
                h=m-1;
            }else{
                l=m+1;
            }
        }
        return indx;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,1,1,1,1,2,2,3,1};
        System.out.println(BinarySearch_In_rotated_arr2(arr,31));
    }
}
