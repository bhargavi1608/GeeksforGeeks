class Solution {
    // Function to find the nodes that are common in both BST.
    public static ArrayList<Integer> findCommon(Node r1, Node r2) {
        // code here
        Set<Integer> bst1 = new HashSet<>();
        Set<Integer> bst2 = new HashSet<>();
        // store set1 elements in to common
        inorder(r1,bst1);
        inorder(r2,bst2);
        TreeSet<Integer> common = new TreeSet<>(bst1);
        common.retainAll(bst2);
        return new ArrayList<>(common);
        
        
    }
    private static void inorder(Node root,Set<Integer> set){
        if(root==null) return;
        inorder(root.left,set);
        set.add(root.data);
        inorder(root.right,set);
        
    }
    
    
}