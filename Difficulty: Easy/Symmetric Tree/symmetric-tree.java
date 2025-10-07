/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    public boolean isSymmetric(Node root) {
        // code here
        if(root==null) return true;
        return isMirror(root.left,root.right);
    }
    private boolean isMirror(Node root1,Node root2){
        if(root1==null && root2==null) return true;
         if(root1==null || root2==null) return false;
         if(root1.data!=root2.data) return false;
         return isMirror(root1.left,root2.right) && isMirror(root1.right,root2.left);
    }
    
}