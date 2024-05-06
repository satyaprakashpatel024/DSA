package pwskills.Tree;

public class ConstructBinaryTree {
    class Node {
        int val;
        Node left;
        Node right;
        Node(){}
        Node(int val){
            this.val = val;
        }
    }
    public void inOrder(Node root){
        if(root==null) return;
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }
    private Node constructBTHelper(int []preOrder,int prelo,int prehi, int[] inOrder,int inlo,int inhi){
        if(prelo>prehi) return null;
        Node root = new Node(preOrder[prelo]);
        int i = inlo;
        while(inOrder[i] != preOrder[prelo]) i++;
        int left = i-inlo;
        root.left = constructBTHelper(preOrder,prelo+1,prelo+left,inOrder,inlo,i-1);
        root.right = constructBTHelper(preOrder,prelo+left+1,prehi,inOrder,i+1,inhi);
        return root;
    }
    public Node constructBinaryTreeFromPre_InOrder(int []preOrder, int []inOrder){
        int n = preOrder.length;
        return constructBTHelper(preOrder,0,n-1,inOrder,0,n-1);
    }
    public static void main(String[] args) {
        ConstructBinaryTree bt = new ConstructBinaryTree();
        int []preOrder = {1,2,4,5,3,6,7};
        int []inOrder = {4,2,5,1,6,3,7};
        Node root = bt.constructBinaryTreeFromPre_InOrder(preOrder,inOrder);
        bt.inOrder(root);
    }
}
