class Solution {
    public Node rotateDLL(Node head, int p) {
        if (head == null || head.next == null || p == 0) return head;

        // Step 1: Find length and tail
        Node tail = head;
        int length = 1;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        // Step 2: Normalize p
        p = p % length;
        if (p == 0) return head;

        // Step 3: Choose optimal direction
        Node cutNode;
        if (p <= length / 2) {
            // Move forward from head
            cutNode = head;
            for (int i = 1; i < p; i++) {
                cutNode = cutNode.next;
            }
        } else {
            // Move backward from tail
            cutNode = tail;
            for (int i = 0; i < (length - p); i++) {
                cutNode = cutNode.prev;
            }
        }

        // Step 4: Rotate
        Node newHead = cutNode.next;
        cutNode.next = null;
        newHead.prev = null;

        tail.next = head;
        head.prev = tail;

        return newHead;
    }
}
