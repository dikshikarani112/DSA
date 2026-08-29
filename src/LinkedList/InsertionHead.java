package LinkedList;

public class InsertionHead {
    int data;
    InsertionHead next;

    InsertionHead(int data) {
        this.data = data;
        this.next = null;
    }

    InsertionHead(int data, InsertionHead next) {
        this.data = data;
        this.next = next;
    }

    InsertionHead head;

    public void insertAtHead(int data) {
        InsertionHead node = new InsertionHead(data);
        if (head == null) {
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }

    public void printList() {
        InsertionHead curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 7};

        InsertionHead list = new InsertionHead(0);
        //create first node
        for (int i = 0; i < arr.length; i++) {
           list.insertAtHead(arr[i]);
        }

        list.printList();
    }
}
