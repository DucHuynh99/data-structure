package org.example.linked_list;

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
}
