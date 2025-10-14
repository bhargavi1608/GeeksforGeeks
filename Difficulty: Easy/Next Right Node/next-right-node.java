class Solution {
    Node nextRight(Node root, int key) {
        if (root == null) return new Node(-1);
        
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        while (!q.isEmpty()) {
            int size = q.size(); // number of nodes at this level
            
            for (int i = 0; i < size; i++) {
                Node current = q.poll();
                
                // If this is the node with the given key
                if (current.data == key) {
                    // If it's not the last node in this level
                    if (i != size - 1) {
                        return q.peek();  // next node in queue (same level)
                    } else {
                        return new Node(-1); // last node in this level
                    }
                }
                
                // Add children for the next level
                if (current.left != null) q.add(current.left);
                if (current.right != null) q.add(current.right);
            }
        }
        
        // Key not found
        return new Node(-1);
    }
}
