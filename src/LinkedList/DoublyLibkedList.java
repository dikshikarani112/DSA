package LinkedList;

public class DoublyLibkedList {
    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }

        Node(int data, Node next, Node prev){
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }
    Node head;

    public void insertAtHead(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void printList() {
        Node current = head;
        while (current != null){
            System.out.print(current.data+ " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void deleteAtHead(){
        if (head == null){
            return;
        }
        head = head.next;

        if (head != null) {
            head.prev = null;
        }
    }

    public void reverseDoublyList() {
        Node current = head;
        Node newHead = null;

        while (current != null) {
            Node temp = current.next;

            current.next = current.prev;
            current.prev = temp;

            newHead = current; // last processed node = old tail
            current = temp;
        }

        head = newHead;
    }

    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        DoublyLibkedList list = new DoublyLibkedList();
        for(int i = 0; i < arr.length; i++){
            list.insertAtHead(arr[i]);
        }
        list.printList();
        list.deleteAtHead();
        list.printList();
        list.reverseDoublyList();
        list.printList();
    }
}
