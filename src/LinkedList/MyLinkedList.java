package LinkedList;

public class MyLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    public void insertAtHead(int data) {

        // 1. New node banao
        Node newNode = new Node(data);

        // 2. New node ka next = current head
        newNode.next = head;

        // 3. Head ko new node bana do
        head = newNode;
    }

    public void deleteAtHead() {
        if (head == null) {
            return;
        }

        head = head.next;
    }

    public void printList() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    public int linkedListLength() {
        Node current = head;
        int count = 0;
        while (current != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    public boolean search(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public static void main(String[] args) {

        // LinkedList create
        MyLinkedList list = new MyLinkedList();

        // Head par elements add
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);

        // Print
        list.printList();
        System.out.println("Lenght of Linked List ::" + list.linkedListLength());
        list.deleteAtHead();
        list.printList();
        System.out.println("Lenght of Linked List ::" + list.linkedListLength());
        System.out.println("element is present ::" + list.search(10));
    }
}
