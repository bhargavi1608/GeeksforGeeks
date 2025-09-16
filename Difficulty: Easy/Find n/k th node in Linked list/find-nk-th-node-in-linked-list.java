/*
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
    public static int fractional_node(Node head, int k) {
        // Your code here
        
        int length = getLength(head);
        
        Node temp = head;
        int pos = (int) Math.ceil((double) length / k);

        for(int i=1;i<pos;i++){
            temp = temp.next;
        }
        return temp.data;
        
    }
    private static int getLength(Node head){
        int length = 0;
        Node temp = head;
        while(temp!=null){
            length++;
            temp = temp.next;
        }
        return length;
    }
}