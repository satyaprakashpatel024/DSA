package CodingThinker.Tree;

import java.util.Scanner;

public class BinaryTree {
    private class Node{
        int data;
        Node left;
        Node right;

        public Node(){}

        public Node(int val){
            this.data = val;
            this.right = null;
            this.right = null;
        }
    }

    private Node root;

    public BinaryTree(){
        this.root = createTree();
    }
        Scanner sc = new Scanner(System.in);
    private Node createTree(){
        int x = sc.nextInt();
        Node newNode = new Node(x);
        if(sc.nextBoolean()){
            newNode.left = createTree();
        }
        if(sc.nextBoolean()){
            newNode.right = createTree();
        }
        return newNode;
    }

    public void Display(){
        DisplayBinaryTree(this.root);
    }

    private void DisplayBinaryTree(Node root1) {
        if(root1==null){
            return ;
        }
        String str = "<--"+root1.data+"-->";
        if(root1.left!=null){
            str=root1.left.data+str;
        }else{
            str="null"+str;
        }
        if(root1.right!=null){
            str=str+root1.right.data;
        }else{
            str=str+"null";
        }

        DisplayBinaryTree(root1.left);
        System.out.println(str);
        DisplayBinaryTree(root1.right);
    }

    public int getMax(){
        return MaxOfTree(this.root);
    }

    private int MaxOfTree(Node root){
        if(root==null){
            return Integer.MAX_VALUE;
        }

        int leftmax = MaxOfTree(root.left);
        int rightMax = MaxOfTree(root.right);

        return Math.max(leftmax,Math.max(rightMax,root.data));
    }

    public int getMin(){
        return MaxOfTree(this.root);
    }

    private int MinOfTree(Node root){
        if(root==null){
            return Integer.MIN_VALUE;
        }

        int leftmax = MinOfTree(root.left);
        int rightMax = MinOfTree(root.right);

        return Math.min(leftmax,Math.min(rightMax,root.data));
    }

    public boolean SearchInTree(int val){
        return IsPresent(this.root, val);
    }

    private boolean IsPresent(Node root, int val){
        if(root==null){
            return false;
        }
        return (root.data == val || (IsPresent(root.left,val) || IsPresent(root.right, val)));
    }
}
