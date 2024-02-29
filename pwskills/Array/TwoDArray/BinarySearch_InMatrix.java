package pwskills.Array.TwoDArray;
//Binary search in a 2D array
public class BinarySearch_InMatrix {
    static boolean BinarySearch(int arr[][],int key){
        int n = arr.length;
        int m = arr[0].length;
        int strt = 0;
        int end = n*m-1;
        while(strt<=end){
            int mid = strt+(end-strt)/2;
            if(arr[mid/m][mid%m]==key){
                return true;
            }
            else if(arr[mid/m][mid%m]<key){
                strt=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [][]arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int key = 11;
        System.out.println(BinarySearch(arr,key));
    }
}
