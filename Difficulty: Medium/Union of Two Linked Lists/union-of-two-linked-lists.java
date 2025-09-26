/*
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Solution {
    public static Node findUnion(Node head1, Node head2) {
        Set<Integer> set = new HashSet<>();
        
        // Add all nodes from first list
        Node curr = head1;
        while (curr != null) {
            set.add(curr.data);
            curr = curr.next;
        }
        
        // Add all nodes from second list
        curr = head2;
        while (curr != null) {
            set.add(curr.data);
            curr = curr.next;
        }
        
        // Sort the set
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        
        // Build new linked list
        Node dummy = new Node(0);
        Node tail = dummy;
        for (int val : list) {
            tail.next = new Node(val);
            tail = tail.next;
        }
        
        return dummy.next;
    }
}
