package LinkedList;

import java.util.Scanner;

class Node {
    int val;
    Node next;
    Node(int x) {
        val = x;
        next = null;
    }
}

public class MergeTwoSortedList {

    private static Node mergeTwoSortedList(Node head, Node head2) {

        Node dummy = new Node(-1);
        Node curr = dummy;

        while (head != null && head2 != null) {
            if(head.val <= head2.val) {
                curr.next = head;
                head = head.next;
            }else{
                curr.next = head2;
                head2 = head2.next;
            }
            curr = curr.next;
        }

        if (head != null) {
            curr.next = head;
        }else{
            curr.next = head2;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(5);

        Node head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(6);

        Node res = mergeTwoSortedList(head, head2);
        printList(res);
    }

    private static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val + "->");
            curr = curr.next;
        }
        System.out.println("NULL");
    }


}
