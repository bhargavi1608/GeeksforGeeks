/*
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        // code here
        if(head==null || head.next==null) return head;
        Node curr = head;
        Node temp=null;
        Node newHead=null;
        while(curr!=null){
            temp=curr.prev;
            curr.prev=curr.next;
            curr.next =temp;
          
            if(curr.prev==null){
                newHead=curr;
            }
            curr=curr.prev;
        }
        return temp.prev;
        
    
      
    }
}