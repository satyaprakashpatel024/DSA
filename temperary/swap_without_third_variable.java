package temperary;

public class swap_without_third_variable {
    static void swap()
    {
        int a = 5;
        int b = 60;
        System.out.println("value of a before swapping : "+a);
        System.out.println("value of b before swapping : "+b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("value of a after swapping : "+a);
        System.out.println("value of b after swapping : "+b);
    }

    public static void main(String[] args) {
        swap();
    }
}
