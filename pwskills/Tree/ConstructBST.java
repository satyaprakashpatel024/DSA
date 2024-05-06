package pwskills.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class ConstructBST {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int x) { val = x; }
    }
//    construct Binary Search tree with given level order traversal
    public static TreeNode constructBT(String[] arr) {
        int x = Integer.parseInt(arr[0]);
        int n = arr.length;
        TreeNode root = new TreeNode(x);
        Queue<TreeNode> q = new LinkedList<>();
        int i=1;
        q.add(root);
        while(i<n-1){
            TreeNode newNode = q.poll();
            if(!arr[i].equals("N")) {
                TreeNode left = new TreeNode(Integer.parseInt(arr[i]));
                newNode.left = left;
                q.add(left);
            }
            if(!arr[i+1].equals("N")) {
                TreeNode right = new TreeNode(Integer.parseInt(arr[i+1]));
                newNode.right = right;
                q.add(right);
            }
            i+=2;
        }
        return root;
    }
//    traversing a tree with preorder
    static void preorder(TreeNode root){
        if(root!=null){
            System.out.print(root.val+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
//    deleting a node of tree
    static void deleteNode(TreeNode root, int target){
        if(root==null  || root.left==null && root.right==null) return;;
        if(root.val>target){ // value is less than root : go left
            if(root.left.val==target){
                if(root.left.left ==null && root.left.right == null) root.left = null;
                else if(root.left.left==null)  root.left = root.left.right;
                else if(root.left.right == null) root.left = root.left.left;
                else{
                    TreeNode curr = root.left;
                    TreeNode pred = curr.left;
                    while(pred.right!=null) pred = pred.right;
                    deleteNode(root,pred.val);
                    pred.left = curr.left;
                    pred.right = curr.right;
                    root.left = pred;
                }
            }
            else deleteNode(root.left, target);
        }
        else { // value is greater than root : go right
            if(root.right.val==target) {
                if(root.right.left == null && root.right.right == null) root.right = null;
                else if(root.right.left==null)  root.right = root.right.right;
                else if(root.right.right==null) root.right = root.right.left;
                else{
                    TreeNode curr = root.right;
                    TreeNode pred = curr.left;
                    while(pred.right!=null) pred = pred.right;
                    deleteNode(root,pred.val);
                    pred.left =  curr.left;
                    pred.right = curr.right;
                    root.right = pred;
                }
            }
            else deleteNode(root.right, target);
        }
    }

    public static void main(String[] args) {
//        String[] arr = {"1", "2", "3", "4", "5", "N", "6", "N", "7", "N", "N", "8", "N", "N", "N", "9", "N"};
//        String[] arr1 = {"1", "2", "3", "4", "5", "N", "6", "7", "N", "8", "N","9","10","N", "11","N","12","N","13","N","14", "15", "16","N","17","N", "N","18","N", "19", "N", "N", "N", "20","21", "22", "23","N","24","25","26","27","N","N","28","N","N"};
//        String arr2[]= {"10","5","15","2","8","12","17"}; BST 1
        String arr3[] = {"50","20","60","17","34","55","89","10","N","28","N","N","N","70","N","N","14"};
        TreeNode root = constructBT(arr3);
        preorder(root);
        System.out.println();
        deleteNode(root,89);
        preorder(root);
    }
}
