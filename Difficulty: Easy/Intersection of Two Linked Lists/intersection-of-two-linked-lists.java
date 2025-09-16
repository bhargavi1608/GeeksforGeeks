/* structure of list Node:

class Node
{
    int data;
    Node next;

    Node(int a)
        {
            data = a;
            next = null;
        }
}

*/

class Solution {
    // Function to find the intersection of two linked lists
    public Node findIntersection(Node head1, Node head2) {
        // add your code here
        HashSet<Integer> set = new HashSet<>();
        Node curr2 = head2;
        while(curr2!=null){
            set.add(curr2.data);
            curr2=curr2.next;
        }
        Node dummy = new Node(0);
        Node temp = dummy;
        Node curr1=head1;
        while(curr1!=null){
            if(set.contains(curr1.data)){
                temp.next = new Node(curr1.data);
                temp = temp.next;
            }
            curr1=curr1.next;
        }
        return dummy.next;
        
    }
}