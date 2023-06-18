
 class Node {
     public int data;
     public Node next;
     public Node prev;

     Node()
     {
         this.data = 0;
         this.next = null;
         this.prev = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
         this.prev = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
         this.prev = next;
     }
 };


public class removeFromLastKelement
{
    public static Node removeKthNode(Node head, int K)
    {
         if (head == null)
            return null;

        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        
        if (K <= 0 || K > length)
            return head;

        if (K == length)
            return head.next;

        int stepsToMove = length - K - 1;
        temp = head;
        for (int i = 0; i < stepsToMove; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return head;
    }
}
