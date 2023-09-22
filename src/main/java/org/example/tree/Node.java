package org.example.tree;

public class Node {
    public final int data;
    public Node left, right;

    public Node(int value) {
        data = value;
        left = right = null;
    }

    public boolean isLeave() {
        return left == null && right == null;
    }
}
