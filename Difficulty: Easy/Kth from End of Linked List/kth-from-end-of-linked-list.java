/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    
    int getKthFromLast(Node head, int k) {
        // Your code here
        int length=0;
        Node temp = head;
        while(temp!=null){
           
            length++;
             temp=temp.next;
        }
        if(k>length) return -1;
       
        int stepToHead=length-k;
        Node newTail=head;
        for(int i=0;i<stepToHead;i++){
            newTail=newTail.next;
        }
    return newTail.data;
     
    }
}