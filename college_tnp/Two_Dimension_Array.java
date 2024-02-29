package college_tnp;

import java.util.Scanner;
public class Two_Dimension_Array {
    void printArr(int [][]arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    int[][] addmatrix(int [][]a,int [][]b){
        int [][]c = new int[3][3];
        for(int i=0; i<a.length; i++){
            for(int j=0; j<b[0].length; j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        return c;
    }

    int[][] multiplymatrix(int [][]a,int [][]b){
        int [][]c = new int[a.length][b[0].length];
        for(int i=0; i<a.length; i++){
            for(int j=0; j<b.length; j++){
                c[i][j]=0;
                for(int k=0; k<a.length; k++){
                    c[i][j] += a[i][k]*b[k][i];
                }
            }
        }


        return c;
    }
    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);
        int [][]matrix1 = new int[3][3];
        int [][]matrix2 = new int[3][3];
        Two_Dimension_Array obj = new Two_Dimension_Array();
        System.out.println("enter the elements of matrix1 : ");
        for(int i=0; i<matrix1.length; i++){
            for(int j=0; j<matrix1[0].length; j++){
                matrix1[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the elements of matrix2 : ");
        for(int i=0; i<matrix2.length; i++){
            for(int j=0; j<matrix2[0].length; j++){
                matrix2[i][j]=sc.nextInt();
            }
        }
        sc.close();
        System.out.println("Matrix 1 : ");
        obj.printArr(matrix1);
        System.out.println("Matrix 2 : ");
        obj.printArr(matrix2);
        int [][]matrix3 = obj.multiplymatrix(matrix1,matrix2);
//        int [][]matrix3 = obj.addmatrix(matrix1,matrix2);
        System.out.println("Matrix 3 : ");
        obj.printArr(matrix3);

    }
}
