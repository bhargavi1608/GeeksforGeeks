/* node class of the linked list

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution {
    // Function to pairwise swap elements of a linked list.
    // It should returns head of the modified list
    public Node pairwiseSwap(Node head) {
        // code here
        Node dummy = new Node(0);
        Node prev = dummy;
        dummy.next=head;
        while(head!=null && head.next!=null){
            Node first=head;
            Node second=head.next;
            prev.next=second;
            first.next=second.next;
            second.next=first;
            prev=first;
            head=first.next;
        }
        return dummy.next;
    }
}