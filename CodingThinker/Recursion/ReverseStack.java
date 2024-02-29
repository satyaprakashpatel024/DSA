package CodingThinker.Recursion;

import java.util.Stack;

public class ReverseStack {
    static void pushData(int x,Stack<Integer> s){
        if(s.isEmpty()){
            s.push(x);
            return;
        }
        int n = s.pop();
        pushData(x,s);
        s.push(n);
    }
    static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int x = s.pop();
        reverse(s);
        pushData(x,s);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println(s);
        reverse(s);
        System.out.println(s);
    }
}




