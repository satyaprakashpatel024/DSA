package college_tnp.ObjectOrientedProgramming;
//import college_tnp.ObjectOrientedProgramming.AccessSpecifier;
import java.util.Scanner;
class Rectange{
    int x;
    int y;
//    void setvalue(){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the length of rectangle: ");
//        this.x = sc.nextInt();
//        System.out.print("Enter the width of rectangle: ");
//        this.y = sc.nextInt();
//        sc.close();
//    }
    void setvalue(int a, int b){
        this.x = a;
        this.y = b;
    }

    int getarea(){
        return (x*y);
    }
}
public class ClassObject {
//    class is a set of member function and data member;
//    in java there are two types of constructor
//    1. default constructor
//    2. parametrized constructor
    private int x;
    private int y;
    ClassObject(){
        Rectange r = new Rectange();
        r.setvalue(x,y);
        int x = r.getarea();
        System.out.println("Area of Rectangle : " + x);
    }

    public void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of rectangle: ");
        this.x = sc.nextInt();
        System.out.print("Enter the width of rectangle: ");
        this.y = sc.nextInt();
    }
//
//    public int getArea(){
//        return x*y;
//    }

//    public int getPerimeter(){
//        return 2*(x+y);
//    }

    public static void main(String[] args) {
        ClassObject c = new ClassObject();
//        c.getInput();
//        System.out.println("Area of rectangle : " + c.getArea());
//        System.out.println("Perimeter of rectangle : " + c.getPerimeter());
    }
}
