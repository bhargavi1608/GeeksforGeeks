/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    public boolean isSorted(Node head) {
        // code here
        if(head==null || head.next==null) return true;
        Node temp = head;
        boolean increasing = false;
        boolean decreasing = false;
        while(temp.next!=null){
            if(temp.data>temp.next.data){
                decreasing = true;
            }if(temp.data<temp.next.data){
                increasing=true;
            }
            if(increasing && decreasing){
                return false;
            }
            temp = temp.next;
        }
        return true;
    }
}