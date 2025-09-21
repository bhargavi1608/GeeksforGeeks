class Solution {
    public static Node reverse(Node head, int k) {
        if (head == null || k <= 0) return head;

        Node temp = head;

        // Step 1: Traverse to kth node
        for (int i = 1; i < k && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) return head; // k >= length, no split

        // Step 2: Split into two parts
        Node secondPart = temp.next;
        temp.next = null;

        // Step 3: Reverse both halves (rev returns head & tail)
        Pair firstPart = rev(head);
        Pair second = rev(secondPart);

        // Step 4: Attach in O(1)
        firstPart.tail.next = second.head;

        return firstPart.head;
    }

    // Helper class to store head & tail of reversed list
    static class Pair {
        Node head, tail;
        Pair(Node h, Node t) { head = h; tail = t; }
    }

    private static Pair rev(Node head) {
        if (head == null) return new Pair(null, null);

        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        // prev = new head, head = new tail
        return new Pair(prev, head);
    }
}
