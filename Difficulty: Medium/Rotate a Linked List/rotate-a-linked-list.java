/*
class Node {
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
   }
}
*/

class Solution {
    public Node rotate(Node head, int k) {
        // code here
       if (head == null || head.next == null || k == 0) return head;
        Node temp=head;
        int len=1;
        while(temp.next!=null){
            temp=temp.next;
            len++;
        }
        
        k%=len;
        if (k == 0) return head;
        temp.next=head;
        Node newTail = head;
       
        for(int i=1;i<k;i++){
            newTail=newTail.next;
        }
        Node newHead = newTail.next;
        newTail.next=null;
        return newHead;
    }
}