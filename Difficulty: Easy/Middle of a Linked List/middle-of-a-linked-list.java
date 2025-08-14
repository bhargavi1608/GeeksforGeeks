/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    int getMiddle(Node head) {
        // Your code here.
        ArrayList<Integer> list = new ArrayList<>();
        Node current = head;
        while(current!=null){
            list.add(current.data);
            current=current.next;
        }
        int mididx=list.size()/2;
        return list.get(mididx);
      }
}