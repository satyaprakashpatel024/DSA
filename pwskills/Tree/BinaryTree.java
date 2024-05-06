package pwskills.Tree;

import java.util.*;

public class BinaryTree {
    static class Node {
        int val;
        Node left;
        Node right;

        public Node() {
        }

        public Node(int val) {
            this.val = val;
        }
    }
    public static void display(Node root) {
        if (root == null)
            return;
        if (root.left != null)
            System.out.print(root.left.val + " <--");
        else
            System.out.print("N <--");
        System.out.print(root.val);
        if (root.right != null)
            System.out.println("--> " + root.right.val);
        else
            System.out.println("--> N");
        display(root.left);
        display(root.right);
    }
//  count no of nodes in tree
    public static int noOfNodes(Node root) {
        if (root == null)
            return 0;
        int lS = noOfNodes(root.left);
        int rS = noOfNodes(root.right);
        return 1 + lS + rS;
    }
//  find sum of tree nodes
    public static int treeSum(Node root) {
        if (root == null)
            return 0;
        int lsum = treeSum(root.left);
        int rsum = treeSum(root.right);
        return root.val + lsum + rsum;
    }
//  maximum element of tree
    public static int maxElement(Node root) {
        if (root == null)
            return Integer.MIN_VALUE;
        int lmax = maxElement(root.left);
        int rmax = maxElement(root.right);
        return Math.max(root.val, Math.max(lmax, rmax));
    }
//  height of tree
    public static int height(Node root) {
        if (root == null || (root.left == null && root.right == null))
            return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }
//  time complexity O(n*n) not an optimized approach
    public static int diameterOfBST(Node root) {
        if (root == null || (root.left == null && root.right == null))
            return 0;
        int leftDia = diameterOfBST(root.left);
        int rightDia = diameterOfBST(root.right);
        int diaWithRoot = height(root.left)+height(root.right);
        if(root.left != null) diaWithRoot++;
        if(root.right != null) diaWithRoot++;
        return Math.max(Math.max(leftDia, rightDia) , diaWithRoot);
    }
//  time complexity O(n) optimized approach
    static class pair{
        int d;
        int h;
        pair(int d,int h){
            this.d = d;
            this.h = h;
        }
    }
    public static pair helper(Node root){
        if(root==null){
            return new pair(0,-1);
        }
        pair l = helper(root.left);
        pair r = helper(root.right);
        int currDia = l.h+r.h+2;
        int maxDia = Math.max(currDia,Math.max(l.d,r.d));
        int h = Math.max(l.h,r.h)+1;
        return new pair(maxDia,h);
    }
    public static int diameterOfBST2(Node root) {
        return helper(root).d;
    }
//  inorder traversal
    public static void inOrder(Node root) {
        if (root == null)
            return;
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }
//  preorder traversal
    public static void preOrder(Node root) {
        if (root == null)
            return;
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
//  postOrder traversal
    public static void postOrder(Node root) {
        if (root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }
//  nth level print : from right->left
    public static void nthLevelRtoL(Node root,int level){
    if(root==null) return;
    if(level==1) {
        System.out.print(root.val+" ");
        return;
    }
    nthLevelRtoL(root.right,level-1);
    nthLevelRtoL(root.left,level-1);
}
//  nth level print : from left->right
    public static void nthLevelLtoR(Node root,int level){
        if(root==null) return;
        if(level==1) {
            System.out.print(root.val+" ");
            return;
        }
        nthLevelLtoR(root.left,level-1);
        nthLevelLtoR(root.right,level-1);
    }
//  level order traversal
    public static void levelOrderTraversal(Node root) {
        int height = height(root)+1;
        for(int i=1; i<=height; i++){
            nthLevelLtoR(root,i);
            System.out.println();
        }
    }
//  iterative approach : using queue
    public static void BFS( Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node temp = q.peek();
            if(temp.left!=null) q.add(temp.left);
            if(temp.right!=null) q.add(temp.right);
            System.out.print(temp.val+" ");
            q.remove();
        }
    }
//  iterative approach : using stack
    public static void DFS(Node root){
        if(root==null) return;
        Stack<Node> stack = new Stack<>();
        HashSet<Node> visited = new HashSet<>();
        stack.push(root);
        visited.add(root);
        while(!stack.isEmpty()){
            Node current = stack.pop();
            System.out.print(current.val + " ");

            if (current.left != null && !visited.contains(current.left)) {
                stack.push(current.left);
                visited.add(current.left);
            }

            if (current.right != null && !visited.contains(current.right)) {
                stack.push(current.right);
                visited.add(current.right);
            }
        }
    }
//  check balanced tree or not balance factor : abs(1,0,-1)
    public static boolean isBalanced(Node root) {
        if(root==null) return true;
        int lh = height(root.left);
        if(root.left!=null) lh++;
        int rh = height(root.right);
        if(root.right!=null) rh++;
        int bal = Math.abs(rh-lh);
        if(bal>1) return false;
        return (isBalanced(root.left) && isBalanced(root.right));
    }
//  check if the given two tree's are same or not
    public static boolean isSameTree(Node root1, Node root2) {
        if(root1==null && root2==null) return true;
        if(root1==null|| root2==null) return false;
        if(root1.val!=root2.val) return false;
        return isSameTree(root1.left,root2.left) && isSameTree(root1.right,root2.right);
    }
//  root to leaf node paths
    public static void pathHelper(Node root,String str,List<String> list){
        if(root==null) return;
        if(root.left==null && root.right==null) {
            str+=root.val;
            list.add(str);
            return;
        }
        pathHelper(root.left,str+root.val+"->",list);
        pathHelper(root.right,str+root.val+"->",list);
    }
    public static List<String> printAllPath(Node root){
        List<String> list = new ArrayList<>();
        pathHelper(root,"",list);
        return list;
    }
//  lowest common ancestor of Binary tree
    private static boolean contains(Node root, Node p) {
        if(root==null) return false;
        if(root==p) return true;
        return contains(root.left ,p) || contains(root.right,p);
    }
    public static Node lowestCommonAncestor(Node root, Node p, Node q) {
        if(root==p || root==q) return root;
        if(p==q) return p;
//        left ki call
        boolean lp = contains(root.left,p);
        boolean rq = contains(root.right,q);
        if(lp && rq) return root;
        if(lp && !rq) return lowestCommonAncestor(root.left,p,q);
        if(!lp && rq) return lowestCommonAncestor(root.right,p,q);
        return root;
    }
//  Invert Binary tree
    public static Node invertTree(Node root) {
        if(root==null) return null;
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
//  Symmatric tree or mirror tree : for this we use invertTree() method and sametree() method
    public static boolean isSymmetric(Node root) {
        if(root==null) return true;
        root.left = invertTree(root.left);
        return isSameTree(root.right,root.left);
    }
//  Zig-zag traversal of tree i.e root->right->left->right->left->right.............
    public static void zigZagTraversal(Node root){
        int height = height(root)+1;
        for(int i=1; i<=height; i++){
            if(i%2!=0) nthLevelLtoR(root,i);
            else nthLevelRtoL(root,i);
        }
    }
//  path sum 2

    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        root.left = a;
        Node b = new Node(3);
        root.right = b;
        Node c = new Node(5);
        a.left = c;
        Node d = new Node(6);
        a.right = d;
        Node e = new Node(7);
        b.left = e;
        Node f = new Node(8);
        b.right = f;
//         display(root);
//         System.out.println(noOfNodes(root));
//         System.out.println(treeSum(root));
//         System.out.println(maxElement(root));
//         int height = height(root);
//         System.out.println(height);
//         System.out.println(diameterOfBST(root));
//         inOrder(root);
//         System.out.println();
//         preOrder(root);
//         System.out.println();
//         postOrder(root);
//         System.out.println();
//         nthLevel(root,1);
//         BFS(root);
//         DFS(root);
//        System.out.println(diameterOfBST2(root));
//        System.out.println(isBalanced(root));
//        System.out.println(isSameTree(root,b));
//        System.out.println(printAllPath(root));
//        levelOrderTraversal(root);
//        root = invertTree(root);
//        levelOrderTraversal(root);
//        System.out.println(isSymmetric(root));
        levelOrderTraversal(root);
    }
}
