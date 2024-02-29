package college_tnp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class BufferReader_In_java {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Enter any character : ");
        char c = (char)br.read();
        br.close();
        System.out.println(c);
    }
}
