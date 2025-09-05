/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node deleteNode(Node head, int key) {
        // code here
      if(head==null) return null;
      if(head.data ==key){
          if(head.next.data==key){
              return null;
          }
          Node temp=head;
          while(temp.next!=head){
              temp=temp.next;
          }
          temp.next=head.next;
          head=head.next;
          return head;
      }
      Node prev = head;
      Node curr= head.next;
      while(curr!=head){
          if(curr.data==key){
              prev.next=curr.next;
              break;
          }
          prev = curr;
          curr=curr.next;
      }
      return head;
        
    }
}