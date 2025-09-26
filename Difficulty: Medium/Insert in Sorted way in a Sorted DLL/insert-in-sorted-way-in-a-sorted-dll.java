/*class of the node of the DLL is as
/*
class Node {
    int data;
    Node prev, next;
    Node(int data) {
        this.data = data;
        this.prev = this.next = null;
    }
}
*/
class Solution {
    public Node sortedInsert(Node head, int x) {
        // add your code here
        
        Node newNode = new Node(x);
        if(head==null){
            newNode.next=null;
            return newNode;
        }
        if(x<head.data){
            newNode.next=head;
            head.prev=newNode;
            return newNode;
        }
        Node temp=head;
        while(temp.next!=null && temp.next.data<x){
            temp=temp.next;
        }
        newNode.next=temp.next;
        newNode.prev=temp;
        if(temp.next!=null){
            temp.next.prev=newNode;
        }
        temp.next=newNode;
        return head;
    }
}