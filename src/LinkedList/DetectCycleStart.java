package LinkedList;

import java.util.HashSet;
import java.util.Set;

public class DetectCycleStart {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    ListNode head;

    public void insertAtTail(int data){
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
       current.next = newNode;
    }

    private void printList() {

        ListNode current = head;
        while (current.next != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public ListNode detectCycle(ListNode head) {
       Set<ListNode> visited = new HashSet<ListNode>();
       while(head != null) {
           if(visited.contains(head)) {
               return head;
           }
           visited.add(head);
           head = head.next;
       }
       return null;
    }

    public ListNode detectLenghtCycle(ListNode head) {
        Set<ListNode> visited = new HashSet<ListNode>();
        while(head != null) {
            if(visited.contains(head)) {
                return head;
            }
            visited.add(head);
            head = head.next;
        }
        return null;
    }

    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        DetectCycleStart list = new DetectCycleStart();
        for(int i = 0; i < arr.length; i++){
            list.insertAtTail(arr[i]);
        }

//        ListNode three = list.head.next.next;  // 3
//        ListNode five = three.next.next;       // 5
//
//        five.next = three;                     // 5 -> 3

        ListNode cycleStart = list.detectCycle(list.head);
        if (cycleStart != null) {
            System.out.println("Cycle starts at node with value: " + cycleStart.val);
        } else {
            System.out.println("No cycle detected.");
        }
        //list.printList();

    }


}
