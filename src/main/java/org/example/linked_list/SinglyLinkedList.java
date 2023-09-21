package org.example.linked_list;

import java.util.HashSet;
import java.util.Set;

public class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList(int data) {
        head = new Node(data);
    }

    public void add(int data) {
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void reverse() {
        Node pointer = head, previous = null, current;
        while (pointer != null) {
            current = pointer;
            pointer = pointer.next;

            current.next = previous;
            previous = current;
            head = current;
        }
    }

    public void reverseRecursive() {
        head = reverseRecursive(head);
    }

    private Node reverseRecursive(Node node) {
        if (node.next == null)
            return node;
        Node newHead = reverseRecursive(node.next);
        node.next.next = node;
        node.next = null;
        return newHead;
    }

    public boolean find(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data)
                return true;
            current = current.next;
        }
        return false;
    }

    public void removeDuplicate() {
        Set<Integer> hashSet = new HashSet<>();
        Node current = head;
        Node previous = null;
        while (current != null) {
            int data = current.data;
            if (hashSet.contains(data)) {
                previous.next = current.next;
            } else {
                hashSet.add(data);
                previous = current;
            }
            current = current.next;
        }
    }

    public int getLastNode(int n) {
        Node fast = head, slow = head;
        int start = 0;

        while (fast != null) {
            fast = fast.next;
            start++;
            if (start > n) {
                slow = slow.next;
            }
        }
        assert slow != null;
        return slow.data;
    }
}
