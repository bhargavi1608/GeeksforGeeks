/*
class Node {
   int data;
   Node next;

  Node(int data) {
      this.data = data;
  }
}
*/
class Solution {
    Node compute(Node head) {
        // your code here
        head=reverse(head);
        Node curr = head;
        Node maxNode = head;
        while(curr!=null && curr.next!=null){
            if(curr.next.data<maxNode.data){
                curr.next=curr.next.next;
            }else {
                curr = curr.next;
                maxNode = curr;
            }
          
        }
        head = reverse(head);
        return head;
        
       
    }
    private Node reverse(Node head){
    
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            Node newNode = curr.next;
            curr.next=prev;
            
            
            // update
            prev=curr;
            curr=newNode;
        }
        return prev;
    }
}