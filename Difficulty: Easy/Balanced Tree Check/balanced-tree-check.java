/*
class Node {
    int data;
    Node left, right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
} */

class Solution {
    public boolean isBalanced(Node root) {
        // code here
        return checkHeight(root)!=-1;
        
        
    }
    private int checkHeight(Node root){
        if(root==null) return 0;
        int leftHeight = checkHeight(root.left);
        if(leftHeight==-1) return -1;
        int rightHeight = checkHeight(root.right);
        if(rightHeight==-1) return -1;
        
        if(Math.abs(leftHeight-rightHeight)>1){
            return -1;
        }
        return 1+Math.max(leftHeight,rightHeight);
    }
}