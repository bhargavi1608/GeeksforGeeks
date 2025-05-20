/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}  */
class Solution {
     private static Node mapParents(Node root, int target, Map<Node, Node> parentMap) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        Node targetNode = null;
        
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            if (current.data == target) {
                targetNode = current;
            }
            if (current.left != null) {
                parentMap.put(current.left, current);
                queue.add(current.left);
            }
            if (current.right != null) {
                parentMap.put(current.right, current);
                queue.add(current.right);
            }
        }
        
        return targetNode;
    }
    
    // Function to burn the tree starting from the target node
    private static int burnTree(Node targetNode, Map<Node, Node> parentMap) {
        Queue<Node> queue = new LinkedList<>();
        Set<Node> visited = new HashSet<>();
        
        queue.add(targetNode);
        visited.add(targetNode);
        int time = 0;
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean burnedSomething = false;
            
            for (int i = 0; i < size; i++) {
                Node current = queue.poll();
                
                // Left child
                if (current.left != null && !visited.contains(current.left)) {
                    queue.add(current.left);
                    visited.add(current.left);
                    burnedSomething = true;
                }
                
                // Right child
                if (current.right != null && !visited.contains(current.right)) {
                    queue.add(current.right);
                    visited.add(current.right);
                    burnedSomething = true;
                }
                
                // Parent
                if (parentMap.containsKey(current) && !visited.contains(parentMap.get(current))) {
                    queue.add(parentMap.get(current));
                    visited.add(parentMap.get(current));
                    burnedSomething = true;
                }
            }
            
            if (burnedSomething) {
                time++;
            }
        }
        
        return time;
    }
    
    public static int minTime(Node root, int target) {
        Map<Node, Node> parentMap = new HashMap<>();
        Node targetNode = mapParents(root, target, parentMap);
        return burnTree(targetNode, parentMap);
    
        
      
    }
}