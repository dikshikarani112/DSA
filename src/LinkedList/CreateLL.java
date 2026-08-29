package LinkedList;

public class CreateLL {
    int data;
    CreateLL next;

    CreateLL(int data) {
        this.data = data;
        this.next = null;
    }

    CreateLL(int data, CreateLL next) {
        this.data = data;
        this.next = next;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 7};

        //create first node
        CreateLL y = new CreateLL(arr[0]);

        //print memory reference of node
        System.out.println(y);

        // Print data stored in node
        System.out.println(y.data);
    }
}
