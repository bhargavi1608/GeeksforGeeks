/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}*/
class Solution {
    public static void rearrange(Node odd) {
        // add your code here
        if(odd==null || odd.next==null) return;
        
        Node even = odd.next;
        Node EvenHead = even;
        
        while(odd.next!=null && even.next!=null){
            odd.next=even.next;
            odd=odd.next;
            if(odd.next!=null){
                even.next=odd.next;
                even=even.next;
            }else{
                even.next=null;
            }
            
        }
        even.next=null;
        Node reversedEven = reverse(EvenHead);
        odd.next=reversedEven;
    } 
    private static Node reverse(Node head){
        if(head==null || head.next==null) return head;
        Node curr = head;
        Node prev = null;
        while(curr!=null){
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
   
}