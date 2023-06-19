class Node {
    public int data;
    public Node next;

    Node() {
        this.data = 0;
        this.next = null;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class  MiddleOfLinkedList{

    public int sizeOfLinkedList(Node head) {
        int size = 0;
        Node current = head;
        while (current != null) {
            current = current.next;
            size++;
        }
        return size;
    }

    public Node startAt(int position, Node head) {
        int count = 0;
        while (count < position && head != null) {
            head = head.next;
            count++;
        }
        return head;
    }

    public static Node findMiddle(Node head) {
        MiddleOfLinkedList solution = new MiddleOfLinkedList();
        int size = solution.sizeOfLinkedList(head);
        int position = size / 2;
        head = solution.startAt(position, head);
        return head;
        
    }

   
}
