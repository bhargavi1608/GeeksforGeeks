/* Structure of the node*/
/* class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
} */

class Solution {
    Node mergeResult(Node node1, Node node2) {
        // Your code here
        Node dummy = new Node(0);
        Node result=dummy;
        node1 = reverse(node1);
        node2 = reverse(node2);
        Node curr1 = node1;
        Node curr2 = node2;
        while(curr1!=null && curr2!=null){
            if(curr1.data>=curr2.data){
                result.next=curr1;
                curr1=curr1.next;
            }else{
                result.next=curr2;
                curr2=curr2.next;
            }
            result=result.next;
        }
        if(curr1!=null) result.next=curr1;
        if(curr2!=null) result.next=curr2;
        return dummy.next;
    }
    Node reverse(Node head){
        if(head==null || head.next==null) return head;
        Node prev = null;
        Node curr = head;
        while(curr!=null){
            Node nextNode = curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
            
        }
        return prev;
    }
}