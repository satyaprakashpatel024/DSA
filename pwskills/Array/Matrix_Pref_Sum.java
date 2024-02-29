package pwskills.Array;
import java.util.*;

public class Matrix_Pref_Sum {
                                //    approach 2:
    static void printMatrix(int [][]a){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    /*
    static void prefixSum(int [][]a){
        int r = a.length;
        int c = a[0].length;

        for(int i=0; i<r; i++){
            for(int j=1; j<c; j++){
                a[i][j]+=a[i][j-1];
            }
        }
    }
    public static int findSum2(int[][] a, int l1, int l2, int r1, int r2){
        int sum = 0;
        prefixSum(a);
        for(int i=l1; i<=l2; i++){
            if(r1>=1){
                sum+=a[i][r2]-a[i][r1-1];
            }else{
                sum+=a[i][r2];
            }
        }
        return sum;
    }
*/

                                //    approach 3:
     static void prefixsum(int [][]a){
         int r = a.length;
         int c = a[0].length;
         for(int i=0; i<r; i++){
             for(int j=1; j<c; j++){
                 a[i][j] +=a[i][j-1];
             }
         }
         System.out.println("row sum : ");
        printMatrix(a);
         for(int i=1; i<r; i++){
             for(int j=0; j<c; j++){
                 a[i][j] +=a[i-1][j];
             }
         }
         System.out.println("with col sum : ");
        printMatrix(a);
     }
    public static int findSum3(int[][] a, int l1, int l2, int r1, int r2)
    {
        int sum = 0;
        prefixsum(a);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int row = sc.nextInt();
        System.out.println("Enter the no of columns");
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        System.out.println("Enter the 9 values of matrices");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter the value of l1 : ");
        int l1 = sc.nextInt();
        System.out.print("Enter the value of l2 : ");
        int r1 = sc.nextInt();
        System.out.print("Enter the value of r1 : ");
        int l2 = sc.nextInt();
        System.out.print("Enter the value of r2 : ");
        int r2 = sc.nextInt();
//        System.out.println(findSum2(matrix,l1,l2,r1,r2));
//        rows and column wise prefix sum

        System.out.println(findSum3(matrix,l1,l2,r1,r2));
        printMatrix(matrix);
    }
}
