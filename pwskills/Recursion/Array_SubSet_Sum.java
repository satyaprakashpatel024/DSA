package pwskills.Recursion;

public class Array_SubSet_Sum {
    static void printSubsetSum(int []arr,int indx,int ans){
//        base case
        if(indx>=arr.length){
            System.out.print(ans+",");
            return ;
        }
        int currNum = arr[indx];
        printSubsetSum(arr,indx+1,ans);
        printSubsetSum(arr,indx+1,ans+currNum);
    }
    public static void main(String[] args) {
        int []arr = {2,4,5};
        printSubsetSum(arr,0,0);
    }
}
