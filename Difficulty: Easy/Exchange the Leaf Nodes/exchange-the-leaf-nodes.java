/*
class Node {
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
    }
}*/

class Solution {
    
    public void collectLeaves(Node root,List<Node> leaves){
        if(root==null) return;
        if(root.left==null && root.right==null){
            leaves.add(root);
            return;
            
        }
        collectLeaves(root.left,leaves);
        collectLeaves(root.right,leaves);
    }
    
    
    
    public void pairwiseSwap(Node root) {
        // code here
        List<Node> leaves = new ArrayList<>();
        collectLeaves(root,leaves);
        
        for(int i=0;i+1<leaves.size();i+=2){
            int temp = leaves.get(i).data;
            leaves.get(i).data=leaves.get(i+1).data;
            leaves.get(i+1).data=temp;
        }
        
      
    }
}