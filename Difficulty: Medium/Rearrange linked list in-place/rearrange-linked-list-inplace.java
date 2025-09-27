/*
The structure of linked list is the following

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
    public Node inPlace(Node root) {
        // Code Here//Position this line where user code will be pasted.
        
        Node slow = root;
        Node fast = root;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow=slow.next;
        }
        Node second = reverse(slow.next);
        slow.next=null;
        Node first = root;
        while(second!=null){
            Node temp1 = first.next;
            Node temp2 = second.next;
            
            first.next= second;
            second.next=temp1;
            
            first=temp1;
            second = temp2;
        }
        return root;
    }
    private Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        while(curr!=null){
            Node nextNode = curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        return prev;
    }
}