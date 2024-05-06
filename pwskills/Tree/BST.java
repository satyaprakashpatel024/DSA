package pwskills.Tree;

import java.util.Scanner;

public class BST {
    private class Node{
        int val;
        Node left;
        Node right;
        Node(){}
        Node(int val){this.val=val;}
    }
    public Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
        if (value < root.val) {
            root.left = insert(root.left, value);
        } else if (value > root.val) {
            root.right = insert(root.right, value);
        }
        return root;
    }

    private Node minValueNode(Node node) {
        Node current = node;
        while (current != null && current.left != null) {
            current = current.left;
        }
        return current;
    }


    public Node deleteNode(Node root, int key) {
        if (root == null) {
            return root;
        }
        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {
            if (root.left == null) {
                Node temp = root.right;
                root = null;
                return temp;
            } else if (root.right == null) {
                Node temp = root.left;
                root = null;
                return temp;
            }
            Node temp = minValueNode(root.right);
            root.val = temp.val;
            root.right = deleteNode(root.right, temp.val);
        }
        return root;
    }

    static void preorder(Node root) {
        if (root != null) {
            System.out.print(root.val + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static void main(String[] args) {
        BST b = new BST();
        Scanner sc = new Scanner(System.in);
        Node root = null;
        System.out.print("Enter the number of nodes in the BST: ");
        int n = sc.nextInt();
        System.out.print("Enter the values of the nodes: ");
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            root = b.insert(root, value);
        }
        System.out.print("Preorder traversal of the BST: ");
        preorder(root);
        System.out.println();
        System.out.print("Enter the value to be deleted: ");
        int key = sc.nextInt();
        root = b.deleteNode(root, key);
        System.out.print("Preorder traversal of the modified BST: ");
        preorder(root);
        System.out.println();
    }
}
