package binarytree.leftviewbinarytree;

import java.util.ArrayList;
import java.util.List;

public class Node {
    int data;
    Node left, right = null;

    Node(int data) {
        this.data = data;
    }
}

class Solution {

    private static void leftViewTree(Node root) {
        List<Node> list =  new ArrayList<>();
        leftViewTreeUtil(root, list, 0);

        for(Node curr: list) {
            System.out.print(curr.data+" ");
        }
    }

    private static void leftViewTreeUtil(Node root, List<Node> list, int level) {
        if(root ==null) return;

        if(level == list.size() ) {
            list.add(level, root);
        }

        leftViewTreeUtil(root.left, list, level+1);
        leftViewTreeUtil(root.right, list, level+1);
    }


    public static void main(String[] args) {
        Node root = new Node(5);
        root.left=new Node(1);
        root.right=new Node(7);
        root.left.left=new Node(2);
        root.left.right=new Node(4);
        root.left.right.left= new Node(3);
        root.left.right.right=new Node(6);

        leftViewTree(root);
    }
}
