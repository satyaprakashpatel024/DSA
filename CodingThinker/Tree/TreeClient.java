package CodingThinker.Tree;

public class TreeClient {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
//        bt.Display();
        int ans = bt.getMax();
        int ans1 = bt.getMin();
        System.out.println("Maximum Value is : "+ans1);
        System.out.println(bt.SearchInTree(100));
    }
}













