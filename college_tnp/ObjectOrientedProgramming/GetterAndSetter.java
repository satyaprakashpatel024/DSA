package college_tnp.ObjectOrientedProgramming;

public class GetterAndSetter {
    private String Name;
    private String RollNo;
    private char Grade;
    private float per;

    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getRollNo() {
        return RollNo;
    }
    public void setRollNo(String rollNo) {
        RollNo = rollNo;
    }
    public char getGrade() {
        return Grade;
    }
    public void setGrade(char grade) {
        Grade = grade;
    }
    public float getPer() {
        return per;
    }
    public void setPer(float per) {
        this.per = per;
    }
    public static void main(String[] args) {

    }
}
