package org.example.tree;

public class Tree {
    private Node root;

    public Tree() {
        root = null;
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node root, int value) {
        if (root == null) {
            root = new Node(value);
        } else if (value < root.data) {
            root.left = insert(root.left, value);
        } else if (value > root.data) {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public void preorderTraversal() {
        preorderTraversal(root);
    }

    private void preorderTraversal(Node node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }

    public void inorderTraversal() {
        inorderTraversal(root);
    }

    private void inorderTraversal(Node node) {
        if (node == null) return;
        inorderTraversal(node.left);
        System.out.print(node.data + " ");
        inorderTraversal(node.right);
    }

    public void postorderTraversal() {
        postorderTraversal(root);
    }

    private void postorderTraversal(Node node) {
        if (node == null) return;
        inorderTraversal(node.left);
        inorderTraversal(node.right);
        System.out.print(node.data + " ");
    }

    public boolean find(int value) {
        return find(root, value);
    }

    private boolean find(Node node, int value) {
        if (node == null)
            return false;
        if (value < node.data)
            return find(node.left, value);
        if (value > node.data)
            return find(node.right, value);
        return true;
    }

    public void printGivenLevel(int level) {
        printGivenLevel(root, level);
    }

    private void printGivenLevel(Node node, int level) {
        if (node == null || level < 1)
            return;
        if (level == 1) {
            System.out.print(node.data + " ");
        } else {
            printGivenLevel(node.left, level - 1);
            printGivenLevel(node.right, level - 1);
        }
    }

    public int height() {
        return height(root);
    }

    private int height(Node node) {
        if (node == null)
             return 0;
        return 1 + Math.max(height(node.left), height(node.right));
    }

    public void printLeaves() {
        printLeaves(root);
    }

    private void printLeaves(Node node) {
        if (node == null)
            return;
        if (node.isLeave())
            System.out.print(node.data + " ");
        printLeaves(node.left);
        printLeaves(node.right);
    }
}
