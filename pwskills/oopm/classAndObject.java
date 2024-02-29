package pwskills.oopm;

public class classAndObject {

    public static void main(String[] args) {
        Student s = new Student("asdfghjk",12,12.5);
        Student s1= new Student();
        Student s2= new Student();
        Student s3= new Student();
        System.out.println(s.getNoOfStudents());
        System.out.println(s1.getNoOfStudents());
        System.out.println(s2.getNoOfStudents());
        System.out.println(s3.getNoOfStudents());
    }
}
