package college_tnp.ObjectOrientedProgramming;
import java.util.Scanner;

public class Student {
    String name;
    String enroll_N0;
    String Branch;
    int marks[]=new int[5];
    void getData(Scanner sc){
        System.out.print("Enter Student's name : ");
        name = sc.nextLine();
        System.out.print("Enter Student's Enroll NUmber : ");
        enroll_N0 = sc.nextLine();
        System.out.print("Enter Student's Branch : ");
        Branch = sc.nextLine();
        sc.next();
        System.out.println("Enter Student's subject's marks : ");
        for(int i=0; i<5; i++){
            System.out.print("Enter marks of "+(i+1)+" subject : ");
            marks[i] = sc.nextInt();
        }
    }
    void showData(){
        System.out.println("Student's name : "+name);
        System.out.println("Student's enroll no. : "+enroll_N0);
        System.out.println("Student's branch : "+Branch);
        System.out.print("Student's marks : ");
        for(int i=0; i<5; i++) {
            System.out.print(marks[i] + " ");
        }
    }

    int getTotalMarks(){
        int total = 0;
        for(int i=0; i<5; i++){
            total+=marks[i];
        }
        return total;
    }

    float getPercentage(){
        float per = 0.0f;
        for(int i=0; i<5; i++){
            per+=marks[i];
        }
        return (per*100/500);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        s.getData(sc);
        sc.close();
        s.showData();
        int t = s.getTotalMarks();
        System.out.println("\nTotal Marks : "+t);
        float p = s.getPercentage();
        System.out.println("Percentage of student : "+p);
    }
}
