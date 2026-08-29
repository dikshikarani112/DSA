package LinkedList;

import jdk.jshell.spi.SPIResolutionException;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
         val = x;
         next = null;
    }
}

public class ReverseList {

    private static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;

    }

    private static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + "->");
            curr = curr.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        System.out.println("Original List : ");
        printList(head);

        head = reverseList(head);
        System.out.println();
        System.out.println("Reversed List : ");
        printList(head);

    }




}
