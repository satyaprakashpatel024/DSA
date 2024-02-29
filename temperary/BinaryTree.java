package temperary;

class Node{
    int data;
    Node left;
    Node right;
    public Node(){}
    public Node(int data){
        this.data = data;
        left = right = null;
    }
}

public class BinaryTree{
    Node root ;
    private Node insert(int arr[], int indx){
        Node root = null;
        if (indx < arr.length) {
            root = new Node(arr[indx]);
            root.left = insert(arr, 2 * indx + 1);
            root.right = insert(arr, 2 * indx + 2);
        }
        return root;
    }

    public void CreateTree(int []arr,int indx){
        root = insert(arr,indx);
    }

    private void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }

    public void inOrderTraversal(){
        inorder(root);
    }
}
