package com.company;

class Node {
    Node left, right;
    int data;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {

    Node root;
    static int max_level = 0;
    int level = 1;

    void printData(Node node, int level) {
        if (node == null)
            return;
        if (max_level < level) {
            System.out.println("Tree left view" + node.data);
            max_level=level;
        }
        printData(node.left, level + 1);
        printData(node.right, level + 1);
    }

    void viewTree() {
        printData(root, 1);

    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.right.left = new Node(4);
        tree.root.right.right = new Node(5);
        tree.viewTree();
    }


}