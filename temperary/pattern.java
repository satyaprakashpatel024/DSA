package temperary;

public class pattern {
    static void printPattern1(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print("  ");
            }
            for(int j=0; j<=i; j++){
                if(j==0){
                    System.out.print("1 ");
                    continue;
                }
                System.out.print("* ");
            }

            for(int j=0; j<i; j++){
                if(j==i-1){
                    System.out.print("1 ");
                    continue;
                }
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<n-i; j++){
                if(j==1){
                    System.out.print("1 ");
                    continue;
                }
                System.out.print("* ");
            }
            for(int j=1; j<n-i-1; j++){
                if(j==n-i-2){
                    System.out.print("1 ");
                    continue;
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 7;
        printPattern1(n);
    }
}
