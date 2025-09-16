/*
Node class is as follows:

class Node {
    int data;
    Node next;

    public Node (int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {

    // Return the sum of last k nodes
    public int sumOfLastN_Nodes(Node head, int n) {
        // write code here
        head = reverse(head);
        Node temp = head;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=temp.data;
            temp = temp.next;
        }
        return sum;
        
    }
    private Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        while(curr!=null){
            Node newNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr=newNode;
        }
        return prev;
    }
}