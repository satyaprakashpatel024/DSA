package pwskills.oopm;

public class Student{
    private String name;
    private int rollNo;
    private double percentage;
    private static int NoOfStudents;
    public Student(){
        NoOfStudents++;
    }
    public Student(String name,int roll,double per){
        this.name=name;
        this.rollNo=roll;
        this.percentage=per;
        NoOfStudents++;
    }

    public int getRollNo(){
        return this.rollNo;
    }
    public String getName(){
        return this.name;
    }
    public double getPercentage(){
        return this.percentage;
    }
    public int getNoOfStudents(){
        return this.NoOfStudents;
    }
}