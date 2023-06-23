 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 };


public class Rotating_Linked_list {
    public static Node rotate(Node head, int k) {

            
   if (head == null || head.next == null || k <= 0) {
            return head;
        }

        int length = 0;
        Node current = head;
        while (current != null) {
            length++;
            current = current.next;
        }

        k = k % length;

        if (k == 0) {
            return head;
        }

        int newTailPosition = length - k;
        Node newTail = head;
        for (int i = 1; i < newTailPosition; i++) {
            newTail = newTail.next;
        }

        Node newHead = newTail.next;
        newTail.next = null;
        Node currentTail = newHead;
        while (currentTail.next != null) {
            currentTail = currentTail.next;
        }
        currentTail.next = head;

        return newHead;
    }
}