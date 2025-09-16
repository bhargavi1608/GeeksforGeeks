// your task is to complete this function

/*class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    // Function to count pairs in two linked lists whose sum is equal to x
    public int countPairs(Node head1, Node head2, int x) {
        // add your code here
        int count=0;
        HashSet<Integer> set = new HashSet<>();
        Node curr2=head2;
        while(curr2!=null){
            set.add(curr2.data);
            curr2=curr2.next;
        }
        Node curr1=head1;
        while(curr1!=null){
            if(set.contains(x-curr1.data)){
                count++;
            }
            curr1=curr1.next;
        }
        return count;
    }
}