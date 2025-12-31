/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public boolean isPalindrome(Node head) {
        // code here
        Node slow = head;
        Node fast = head;
       
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        Node firstHalf = head;
        Node secondHalf = reverse(slow);
        while(secondHalf!=null){
            if(firstHalf.data!=secondHalf.data){
                return false;
            }
            firstHalf=firstHalf.next;
            secondHalf=secondHalf.next;
        }
        return true;
        
    }
    public Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        while(curr!=null){
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr=nextNode;
        }
        return prev;
    }
}