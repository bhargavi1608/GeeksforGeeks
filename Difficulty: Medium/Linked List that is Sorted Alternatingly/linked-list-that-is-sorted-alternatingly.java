/*
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
    public Node sort(Node head) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
       
        Node temp=head;
        while(temp!=null){
            list.add(temp.data);
            temp=temp.next;
        }
        Collections.sort(list);
        head = new Node(list.get(0));
        Node temp1 = head;
        for(int i=1;i<list.size();i++){
            Node newNode = new Node(list.get(i));
            temp1.next=newNode;
            temp1=temp1.next;
        }
        return head;
    }
}