/* Node of a linked list
 class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }

}
*/

class Solution {
    /* Function to print nodes in a given Circular linked list */
    void printList(Node head) {
        // Your code here
        if(head==null) return;
        Node temp=head;
        do{
            System.out.print(temp.data+" ");
            temp=temp.next;
        }while(temp!=head);
 
    }
}