/*
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        // code here
        // if(head==null || head.next==null) return head;
        // Node curr = head;
        // Node temp=null;
        // while(curr!=null){
        //     temp=curr.prev;
        //     curr.prev=curr.next;
        //     curr.next =temp;
        //     curr=curr.prev;
        // }
        // return temp.prev;
        
        //approch 2
        
        Stack<Integer> stack = new Stack<>();
        Node temp = head;
        while(temp!=null){
            stack.push(temp.data);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            temp.data=stack.peek();
            stack.pop();
            temp=temp.next;
        }
        return head;
    }
}