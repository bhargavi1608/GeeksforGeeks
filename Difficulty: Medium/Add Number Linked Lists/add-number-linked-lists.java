import java.util.Stack;

class Solution {
    public Node addTwoLists(Node head1, Node head2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        
        head1 = skipLeadingZeros(head1);
        head2 = skipLeadingZeros(head2);
       
        while (head1 != null) { s1.push(head1.data); head1 = head1.next; }
        while (head2 != null) { s2.push(head2.data); head2 = head2.next; }

        int carry = 0;
        Node result = null;

        // Add digits
        while (!s1.isEmpty() || !s2.isEmpty() || carry != 0) {
            int x = s1.isEmpty() ? 0 : s1.pop();
            int y = s2.isEmpty() ? 0 : s2.pop();
            int sum = x + y + carry;
            carry = sum / 10;

            // Prepend new node
            Node newNode = new Node(sum % 10);
            newNode.next = result;
            result = newNode;
        }

        return result;
    }
    private Node skipLeadingZeros(Node head) {
        while (head != null && head.data == 0) head = head.next;
        return head == null ? new Node(0) : head; // if number is 0
    }
}
