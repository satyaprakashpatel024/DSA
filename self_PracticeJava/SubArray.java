package self_PracticeJava;

public class SubArray {
    public static void main(String[] args) {
        int arr[] = {1 ,-2, 4, -5, 1};
        int count=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int sum = 0;
                for(int k=i; k<=j; k++){
                    sum+=arr[k];
                }
                if(sum<0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
