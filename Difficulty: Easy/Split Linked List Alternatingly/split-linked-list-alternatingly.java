/*
struct Node
{
    int data;
    struct Node* next;

    Node(int x){
        data = x;
        next = NULL;
    }

};
*/

class Solution {
    // Function to append a new node with newData at the end of a linked list
    Node[] alternatingSplitList(Node head) {
        // code here
        Node[] res = new Node[2];
        Node head1 = head;
        Node head2 = head.next;
        res[0]=head1;
        res[1]=head2;
        Node curr1 = head1;
        Node curr2=head2;
        while(curr1!=null && curr2!=null){
            if(curr2.next!=null){
                curr1.next = curr2.next;
                curr1=curr1.next;
            }else{
                curr1.next=null;
                break;
            }
            if(curr1.next!=null){
                curr2.next=curr1.next;
                curr2=curr2.next;
            }else{
                curr2.next=null;
                break;
            }
        }
        return res;
    }
}