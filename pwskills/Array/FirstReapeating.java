package pwskills.Array;
import java.util.*;
public class FirstReapeating {
    static void printarr(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    static void firstRepeat(){
        int []arr = {1,2,3,4,3,2,4};
        int ans = -1;
        int n = arr.length;
        for(int i=n-1; i>0; i--){
            for(int j=i-1; j>0; j--){
                if(arr[i]==arr[j]){
                    ans = j;
                    break;
                }
            }
            if(ans!=-1){
                break;
            }
        }
        System.out.println("asdfghjkl   "+ans);
    }

    public static void main(String[] args) {
        firstRepeat();

    }
}
