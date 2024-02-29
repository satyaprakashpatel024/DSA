package temperary;

public class Solution {
    static int min(int a, int b){
        return Math.max(a, b);
    }
    static int maxArea(int[] arr) {
        int count = arr.length-1;
        int low = 0;
        int high = arr.length-1;
        int area = count*min(arr[0],arr[high]);
        System.out.println("low= "+low+" high= "+high+" area = "+area);
        while(low<high){
            count--;
            low++;
            area = count*min(arr[0],arr[high]);
            System.out.println("low= "+low+" high= "+high+" area = "+area);
            low--;
            high--;
            area = count*min(arr[low],arr[high]);
            System.out.println("low= "+low+" high= "+high+" area = "+area);
            low++;
        }
        return area;
    }

    public static void main(String[] args) {
        int []arr = {2,3,4,5,18,17,6};
        System.out.println(maxArea(arr));
    }
}
