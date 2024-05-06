package pwskills.Tree;

public class BST_By_Inorder {
    Node root;
    class Node{
        int data;
        Node left;
        Node right;
        Node(){}
        Node(int data){
            this.data = data;
        }
    }
    private Node insertintoBST(int []arr,int l,int h){
        if(l>h) return null;
        int m = l+(h-l)/2;
        Node root = new Node(arr[m]);
        root.left = insertintoBST(arr,l,m-1);
        root.right = insertintoBST(arr,m+1, h);
        return root;
    }
    public void createBST(int []arr){
        root = insertintoBST(arr,0,arr.length-1);
    }

    private void displayInOrder(Node root){
        if(root==null) return ;
        displayInOrder(root.left);
        System.out.print(root.data+" ");
        displayInOrder(root.right);
    }

    private void displayPreOrder(Node root){
        if(root==null) return ;
        System.out.print(root.data+" ");
        displayPreOrder(root.left);
        displayPreOrder(root.right);
    }

    public void inorder(){
        displayInOrder(root);
    }
    public void preorder(){
        displayPreOrder(root);
    }
    public static void main(String[] args) {
        int arr[]= {10,15,21,24,27,30,35,40};
        BST_By_Inorder bt = new BST_By_Inorder();
        bt.createBST(arr);
        bt.inorder();
        System.out.println();
        bt.preorder();
    }
}
