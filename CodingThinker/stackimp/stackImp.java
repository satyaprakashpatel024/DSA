package CodingThinker.stackimp;

public class stackImp {
    private int stack[];
    private int top = -1;
    private int size = 0;

    public stackImp(){
        this.stack = new int[5];
    }
    public stackImp(int n){
        this.stack = new int[n];
    }

    public void push(int val){
        if(top==this.stack.length){
            System.out.println("UnderFlow : Stack is empty.");
            return;
        }
        this.stack[++this.top] = val;
        size++;
    }

    public int peek(){
        if(top==-1){
            System.out.println("UnderFlow : Stack is empty.");
            return -1;
        }
        return this.stack[this.top];
    }

    public int pop(){
        if(this.top==-1){
            System.out.println("UnderFlow : Stack is empty.");
            return -1;
        }
        this.size--;
        return this.stack[this.top--];
    }

    public int getSize(){
        return this.size;
    }
}
