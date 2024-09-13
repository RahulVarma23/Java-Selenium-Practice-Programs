package binarytree.maxofbinarytree;

public class Node {
    int data;
    Node left, right = null;

    public Node(int data) {
        this.data=data;
    }
}

class Solution {

    static int max(Node root) {
        if(root==null) return 0;

        int maxBetnLeftRight = Math.max(max(root.left), max(root.right));
        int max = Math.max(root.data, maxBetnLeftRight);

        return max;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println(max(root));
    }
}