/*

class Node {

    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
This is method only submission.
You only need to complete the below method.
*/
class Solution {

    // Should rearrange given linked list such that all even
    // positioned Nodes are before odd positioned.
    // Returns nothing
    void rearrangeEvenOdd(Node head) {
        //  The task is to complete this method
        if(head==null || head.next==null) return;
        Node odd = head;
        Node even = odd.next;
        Node EvenHead = even;
        while(odd.next!=null && even.next!=null){
            odd.next = even.next;
            odd=odd.next;
            if(odd.next!=null){
                even.next=odd.next;
                even = even.next;
            }else{
                even.next=null;
            }
        }
        even.next=null;
        odd.next = EvenHead;
    }
}