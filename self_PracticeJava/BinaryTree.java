package self_PracticeJava;

public class BinaryTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node() {
            left=null;
            right=null;
        }

        Node(int data) {
            this.data = data;
            left=null;
            right=null;
        }
    }

    public int getMax(Node root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        int lMAx = getMax(root.left);
        int rMAx = getMax(root.right);
        return Math.max(lMAx,Math.max(rMAx,root.data));
    }

    public void display(Node root){
        if(root==null){
            return ;
        }
        if(root.left!=null){
            System.out.print(root.left.data+"<--");
        }else{
            System.out.print("null<--");
        }
        System.out.print(root.data+" ");
        if(root.right!=null){
            System.out.println("-->"+root.right.data);
        }else{
            System.out.println("-->null");
        }
        display(root.left);
        display(root.right);
    }

    public static void main(String[] args) {
        Node p = new Node(20);
        p.left = new Node(75);
        p.left.left = new Node(45);
        p.left.right = new Node(10);
        p.right = new Node(55);
        p.right.left = new Node(50);
        p.right.right = new Node(56);

        BinaryTree bt = new BinaryTree();
        bt.display(p);
        System.out.println("\nMaximum value of tree is : "+bt.getMax(p));
    }
}
