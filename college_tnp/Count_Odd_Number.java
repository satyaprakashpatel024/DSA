package college_tnp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Count_Odd_Number {
    static int Odd_Count(int l, int h){
        int count = 0;
        for(int i=l; i<=h; i++){
            if(i%2==1){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        int h = Integer.parseInt(br.readLine());
        br.close();
        int ans = Odd_Count(l,h);
        System.out.println(ans);
    }
}
