/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        Node ZeroDummy = new Node(-1), OneDummy=new Node(-1), TwoDummy= new Node(-1);
        Node ZeroTail=ZeroDummy, OneTail=OneDummy, TwoTail=TwoDummy;
        Node temp=head;
        while(temp!=null){
            if(temp.data==0){
                ZeroTail.next = temp;
                ZeroTail=ZeroTail.next;
            }else if(temp.data==1){
                OneTail.next=temp;
                OneTail=OneTail.next;
            }else if(temp.data==2){
                TwoTail.next=temp;
                TwoTail=TwoTail.next;
            }
            temp=temp.next;
        }
        ZeroTail.next = (OneDummy.next!=null) ? OneDummy.next : TwoDummy.next;
        OneTail.next=TwoDummy.next;
        TwoTail.next=null;
        return ZeroDummy.next;
    }
}