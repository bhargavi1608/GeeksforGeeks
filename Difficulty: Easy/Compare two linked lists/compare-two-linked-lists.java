/*  Structure of Node
class Node
 {
    char data;
    Node next;

    // Constructor to create a new node
    Node(char d)
    {
       data = d;
       next = null;
    }
 }*/

class Solution {
    int compare(Node head1, Node head2) {
        // Your code here
        Node curr1 = head1;
        Node curr2 = head2;
        while(curr1!=null && curr2!=null){
            if(curr1.data!=curr2.data){
                return (curr1.data>curr2.data) ? 1:-1;
            }
            curr1=curr1.next;
            curr2=curr2.next;
        }
        if(curr1!=null) return 1;
        if(curr2!=null) return -1;
        return 0;
    }
}
