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
}
