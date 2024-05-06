package pwskills.Tree;

public class BinarySearchTree {
    static class Node{
        int val;
        Node left;
        Node right;
        public Node(){}
        public Node(int val){
            this.val = val;
        }
    }
    public static Node insertInBST(Node root ,int val){
        if(root==null) return new Node(val);
        if(root.val>val){
            if(root.left==null) root.left=insertInBST(root.left,val);
            else insertInBST(root.left,val);
        }else{
            if(root.right==null) root.right=insertInBST(root.right,val);
            else insertInBST(root.right,val);
        }
        return root;
    }
    public static void display(Node root){
        if(root==null) return;
        display(root.left);
        System.out.print(root.val+" ");
        display(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root = insertInBST(root,5);
        root = insertInBST(root,15);
        root = insertInBST(root,3);
        root = insertInBST(root,7);
        root = insertInBST(root,12);
        root = insertInBST(root,18);
        display(root);
    }
}
