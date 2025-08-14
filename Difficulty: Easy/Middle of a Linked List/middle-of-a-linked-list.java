/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    public int getLength(Node head){
        int length=0;
        while(head!=null){
            length++;
            head=head.next;
        }
        return length;
    }
    int getMiddle(Node head) {
        // Your code here.
        int length=getLength(head);
        int mididx = length/2;
        while(mididx>0){
            head=head.next;
            mididx--;
        }
        return head.data;
        
      }
}