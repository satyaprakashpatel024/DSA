package CodingThinker.stackimp;

public class UseStack {
    public static void main(String[] args) {
        stackImp s = new stackImp();
        s.push(1);
        System.out.println(s.getSize());
        s.push(2);
        System.out.println(s.getSize());
        s.push(3);
        System.out.println(s.getSize());
        s.pop();
        System.out.println(s.peek());
        System.out.println(s.getSize());
    }
}
