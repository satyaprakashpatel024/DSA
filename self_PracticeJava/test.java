package self_PracticeJava;

public class test {
    public static void main(String[] args) {
        String str = "aeiou";
        String s = "welcome to bhopal";
        int c = 0;
        for(int i=0; i<s.length(); i++) {
            String cha = s.substring(i,i+1);
            if(str.contains(cha)) c++;
        }
        System.out.println(c);
    }
}
