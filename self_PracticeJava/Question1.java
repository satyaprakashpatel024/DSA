package self_PracticeJava;

//import java.util.Arrays;
//import java.util.Scanner;

public class Question1 {
//    public static int pairMatch(int []arr, int n){
//        int count = 0;
//        Arrays.sort(arr);
//
//        int i=1;
//        while(i<n){
//            if(arr[i-1]==arr[i]){
//                count++;
//                i+=2;
//            }
//            else{
//                i++;
//            }
//        }
//        return count;
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("enter no of socks : ");
//        int n = sc.nextInt();
//        System.out.println();
//        int []arr = new int[n];
//        System.out.println("enter color of each socks : ");
//        for(int i=0; i<n; i++){
//            arr[i] = sc.nextInt();
//        }
//
//        System.out.println("No. of Pairs : "+pairMatch(arr,n));
//    }
public static void main(String[] args) {
    String str1[] = {"ab","c"};
    String str2[] = {"ac","b"};

    StringBuilder sb1 = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb1.append(str1[0]);
    sb1.append(str1[1]);

    sb2.append(str2[0]);
    sb2.append(str2[1]);

//    System.out.println(sb1+"qwertyuio"+sb2);
    System.out.println((sb1.toString()).equals(sb2.toString()));
}
}
