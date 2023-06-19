import java.util.ArrayList;
import java.util.List;

import javax.xml.crypto.Data;

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
 }


public class Linked_List_Cycle_II {
    public static Node firstNode(Node head) {
          List<Node> arr = new ArrayList<>();

        Node curr =head;
        while(curr != null){
            if(arr.contains(curr)){
                return curr;
            }
            arr.add(curr);
            curr = curr.next;
        }
        return curr;

    }
}