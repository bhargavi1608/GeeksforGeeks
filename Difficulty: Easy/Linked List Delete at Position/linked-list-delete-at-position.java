// User function Template for Java

/*
class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = next;
    }
}
*/

class Delete {
    Node deleteAtPosition(Node head, int pos) {
        // your code here
        if(pos==1){
            head=head.next;
            return head;
        }
        Node temp = head;
        for(int i=1;i<pos-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}
