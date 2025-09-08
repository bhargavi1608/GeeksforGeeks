/*
class Node {
    int data;
    Node next;

    Node(int key) {
        data = key;
        next = null;
    }
}
*/

class Solution {
    
    public Node mergeSort(Node head) {
        // code here
        if (head == null || head.next == null) {
            return head;
        }

        Node middle = getMiddle(head);
        Node nextTomiddle = middle.next;
        middle.next=null;
        
        Node left = mergeSort(head);
        Node right=mergeSort(nextTomiddle);
        
        return sorted(left,right);
    }
    public Node sorted(Node a,Node b){
        if(a==null) return b;
        if(b==null) return a;
        Node result;
        if(a.data<b.data){
            result=a;
            result.next = sorted(a.next,b);
        }else{
            result=b;
            result.next = sorted(a,b.next);
        }
        return result;
        
    }
    public Node getMiddle(Node head){
       if (head == null) return head;
       Node slow=head;
       Node fast = head.next;
       while(fast!=null && fast.next!=null){
           slow=slow.next;
           fast=fast.next.next;
           
       }
       return slow;
    }
}