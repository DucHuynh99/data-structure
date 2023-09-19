package org.example.linked_list;

public class SinglyLinkedList {
    private final Node head;

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
}
