package college_tnp.string;

public class StringConstantPool {
    public static void main(String[] args) {
//        String s1 = "hello";
//        String s2 = "hello";
//        String s1 = new String("hello");
//        String s2 = new String("hello");
//        String s3 = s1;
//        System.out.println(s1==s2);
//        System.out.println(s1.equals(s2));
//        System.out.println("s3==s1 : "+(s1==s3));
//        System.out.println(s1.equals(s3));
        String str = "welcome";
        for(int i=0; i<str.length(); i+=2){
            System.out.print(str.charAt(i)+" ");
        }
    }
}
