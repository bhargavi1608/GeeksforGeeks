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
    Node mergeKLists(Node[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            Node curr = arr[i];
            while(curr!=null){
                list.add(curr.data);
                curr=curr.next;
            }
        }
        Collections.sort(list);
        Node head = new Node(list.get(0));
        Node curr=head;
        for(int i=1;i<list.size();i++){
            Node newNode = new Node(list.get(i));
            curr.next=newNode;
            curr=curr.next;
            
        }
        return head;
    }
}