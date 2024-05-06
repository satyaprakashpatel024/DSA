package pwskills.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ConstructBTfromLevelOrderTraversal {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int x) { val = x; }
    }
    public static int height(TreeNode root) {
        if (root == null || (root.left == null && root.right == null))
            return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }
    public static void nthLevelLtoR(TreeNode root, int level){
        if(root==null) return;
        if(level==1) {
            System.out.print(root.val+" ");
            return;
        }
        nthLevelLtoR(root.left,level-1);
        nthLevelLtoR(root.right,level-1);
    }
//  level order traversal
    public static void levelOrderTraversal(TreeNode root) {
        int height = height(root)+1;
        for(int i=1; i<=height; i++){
            nthLevelLtoR(root,i);
            System.out.println();
        }
    }
//    construct Binary tree
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
//    Boundary traversal
    public static void printLeftBoundary(TreeNode root) {
        if(root==null) return;
        if(root.left == null && root.right==null) return ;
        System.out.print(root.val+" ");
        if(root.left!=null)printLeftBoundary(root.left);
        else printLeftBoundary(root.right);
    }
    public static void printBottomBoundary(TreeNode root){
        if(root==null) return;
        if(root.left == null && root.right==null) {
            System.out.print(root.val + " ");
            return;
        }
        printBottomBoundary(root.left);
        printBottomBoundary(root.right);
    }
    public static void printRightBoundary(TreeNode root){
        if(root==null) return;
        if(root.left == null && root.right==null)
            return;
        if(root.right!=null)printRightBoundary(root.right);
        else printRightBoundary(root.left);
        System.out.print(root.val+" ");
    }
    public static void boundaryTraversal(TreeNode root) {
        printLeftBoundary(root);
//        System.out.println();
        printBottomBoundary(root);
//        System.out.println();
        printRightBoundary(root.right);
    }
//    right view of binary tree
    public static List<Integer> rightView(TreeNode root) {
        List<Integer> ans = new ArrayList<Integer>();
        int level = height(root)+1;
        for(int i=0; i<level; i++){
            ans.add(0);
        }
        rightViewHelper(root,ans,1);
        return ans;
    }
    private static void rightViewHelper(TreeNode root, List<Integer> ans, int i) {
        if(root==null) return;
        ans.set(i-1,root.val);
        if(root.right!=null)rightViewHelper(root.right,ans,i+1);
        if(root.left!=null)rightViewHelper(root.left,ans,i+1);
    }
//    flatten binary tree means binary tree to right skewed tree
    public static void flattenTree(TreeNode root){
        TreeNode curr = root;
        while(curr!=null){
            if(curr.left!=null){
                TreeNode pred = curr.left;
                while(pred.right!=null){
                    pred = pred.right;
                }
                pred.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }
            curr = curr.right;
        }
    }
//    path sum 2
    private void helperPathSum(List<List<Integer>> ans,List<Integer> arr,TreeNode root,int target){
    if(root==null) return;
    if(root.left==null && root.right==null) {
        arr.add(root.val);
        if(target==root.val) {
            List<Integer> l = new ArrayList<>();
            for(var ele:arr){
                l.add(ele);
            }
            ans.add(l);
        }
        arr.remove(arr.size()-1);
        return;
    }
    arr.add(root.val);
    helperPathSum(ans,arr,root.left,target-root.val);
    helperPathSum(ans,arr,root.right,target-root.val);
    arr.remove(arr.size()-1);
}
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>>  list = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        helperPathSum(list,arr,root,targetSum);
        return list;
    }
//    path sum 3
    private int noOfPaths(TreeNode root,long x){
    if(root==null) return 0;
    int count = 0;
    if((long)root.val==x) count++;
    return count + noOfPaths(root.left,x-(long)root.val)+noOfPaths(root.right,x-(long)root.val);
}
    public int pathSum3(TreeNode root, int targetSum) {
        if(root==null) return 0;
        int count = noOfPaths(root,(long)targetSum);
        count+= (pathSum3(root.left,targetSum)+pathSum3(root.right,targetSum));
        return count;
    }

    public static void main(String[] args) {
        String[] arr = {"1", "2", "3", "4", "5", "N", "6", "N", "7", "N", "N", "8", "N", "N", "N", "9", "N"};
        String[] arr1 = {"1", "2", "3", "4", "5", "N", "6", "7", "N", "8", "N","9","10","N", "11","N","12","N","13","N","14", "15", "16","N","17","N", "N","18","N", "19", "N", "N", "N", "20","21", "22", "23","N","24","25","26","27","N","N","28","N","N"};
        TreeNode root = constructBT(arr1);
//        levelOrderTraversal(root);
        boundaryTraversal(root);
    }
}

//        ArrayList<String> l = new ArrayList();
//        l.add("1");
//        l.add("2");
//        l.add("3");
//        l.add("4");
//        l.add("5");
//        l.add("N");
//        l.add("6");
//        l.add("N");
//        l.add("7");
//        l.add("N");
//        l.add("N");
//        l.add("8");
//        l.add("N");
//        l.add("N");
//        l.add("N");
//        l.add("9");
//        l.add("N");
//        System.out.println(l);