/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node swapKth(Node head, int k) {
        // code here
        if(head==null) return head;
        int length=0;
        Node temp=head;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        if(k>length) return head;
        Node first=head;
        for(int i=1;i<k;i++){
            first=first.next;
        }
        Node second=head;
        for(int i=1;i<(length-k+1);i++){
            second=second.next;
        }
        int tempData=first.data;
        first.data=second.data;
        second.data=tempData;
        return head;
    }
}
