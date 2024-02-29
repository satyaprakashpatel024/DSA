package temperary;

public class TreeClient {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        bt.CreateTree(arr,0);
        bt.inOrderTraversal();
    }
}
