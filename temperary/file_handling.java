package temperary;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class file_handling {
    public static void main(String[] args) throws IOException {
        File myfile = new File("text.txt");
        myfile.createNewFile();

        File myObj = new File("text.txt");
        Scanner sc = new Scanner(myObj);
        System.out.println(sc.nextLine());
        FileWriter myWriter = new FileWriter("text.txt");
        myWriter.write("hello satya prakash patel");
        myWriter.write("\nyou are learning file handling in java");
        myWriter.write("\ntoday is a good day for you and its going to be a great year");
        myWriter.close();
        System.out.println(sc.nextLine());
        System.out.println(sc.nextLine());
        System.out.println(sc.nextLine());
        sc.close();
    }
}
