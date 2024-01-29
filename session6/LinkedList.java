package session6;

public class LinkedList {

    Node head; // the memory has not been instantiated

    LinkedList() {
        this.head = null;
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    void insertAtHead(int data) {
        // create a new node
        Node newNode = new Node(data);

        // check if the list is empty
        if (this.head == null) {
            // the list is empty
            this.head = newNode;
        } else {
            // the list is not empty
            newNode.next = this.head;
            this.head = newNode;
        }
    }

    void insertAtTail(int data) {

    }

    void deleteAtHead() {

    }

    void deleteAtTail() {

    }

    // returns the length of the linked list
    int length() {
        return 0;
    }

    // print the current linked list
    void printList() {

    }

    public static void main(String[] args) {
        // create a new linked list
        LinkedList list = new LinkedList();

        list.insertAtHead(3);
        list.insertAtHead(5);

        System.out.println(list.head.next.data);
    }

    // garbage collectors will clean up the allocated memories
}