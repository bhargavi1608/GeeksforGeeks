/* Link list Node
class Node
{
    Node next;
    int data;
    Node(int d)
    {
        data = d;
        next = null;
    }
}*/
class Solution {
    /*You are required to complete this method*/
    Node deleteK(Node head, int k) {
        // Your code here
      
      if(k==1){
          return null;
      }
      if(head==null || k<=0) return head;
      
      Node current = head;
      int count=1;
      while(current!=null && current.next!=null){
          if(count==k-1){
              current.next=current.next.next;
              current=current.next;
              count=1;
          }else{
              current=current.next;
              count++;
          }
      }
      return head;
    }
}