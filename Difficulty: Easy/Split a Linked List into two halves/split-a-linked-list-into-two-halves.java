/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    public Pair<Node, Node> splitList(Node head) {
        // Code here
        if(head==null){
            return new Pair<Node,Node>(null,null);
        }
        Node slow = head;
        Node fast = head;
        while(fast.next!=head && fast.next.next!=head){
            
            fast=fast.next.next;
            slow=slow.next;
            
        }
        if(fast.next.next==head){
            fast=fast.next;
        }
        Node head1 = head;
        Node head2=slow.next;
        fast.next = slow.next;
        slow.next = head;
        return new Pair<Node,Node>(head1,head2);
        
    }
}