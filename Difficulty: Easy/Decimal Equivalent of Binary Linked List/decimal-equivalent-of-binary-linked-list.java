/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
 Linked List class
class LinkedList
{
    Node head;  // head of list
}
This is method only submission.  You only need to complete the method. */

class Solution {
    static final long MOD = 1000000007;
    long DecimalValue(Node head) {
        long sum=0;
        Node temp = head;
        while(temp!=null){
        sum=(sum*2+temp.data)%MOD;
        temp=temp.next;
        }
        return sum;
    }
}