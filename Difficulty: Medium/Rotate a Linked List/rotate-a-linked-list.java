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
    public int Find_length(Node head){
        int length=0;
        while(head!=null){
            length++;
            head=head.next;
        }
        return length;
        
    }
    public Node rotate(Node head, int k) {
        // code here
        if(head==null || head.next==null) return head;
        int length = Find_length(head);
        k%=length;
        if(k==0) return head;
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=head;
   
        Node newTail = head;
        for(int i=1;i<k;i++){
            newTail=newTail.next;
        }
        Node newHead=newTail.next;
        newTail.next=null;
        return newHead;
    }
}