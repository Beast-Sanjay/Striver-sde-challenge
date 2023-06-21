/****************************************************************

 Following is the class structure of the Node class:

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

 *****************************************************************/

public class Intersection_of_Two_Linked_Lists {
    public static int size(Node head){
        int size=0;
        while(head != null){
            size++;
            head = head.next;
        }
        return size;
    }
     public static Node movePointer(Node head, int steps) {
        while (steps > 0 && head != null) {
            head = head.next;
            steps--;
        }
        return head;
    }
    public static int findIntersection(Node firstHead, Node secondHead) {
        
        int currSize = size(firstHead);
        int currSecSize =size(secondHead);
        int diff = Math.abs(currSize - currSecSize);

        if (currSize > currSecSize) {
            firstHead = movePointer(firstHead, diff);
        } else {
            secondHead = movePointer(secondHead, diff);
        }

        while(firstHead != null && secondHead!= null){
             if(firstHead == secondHead){
                 return firstHead.data;
             }   
                firstHead = firstHead.next;
                secondHead = secondHead.next;
            }
              return 0;
        }
      
    }
