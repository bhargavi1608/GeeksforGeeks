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
     private boolean Ismirror(Node node1, Node node2) {
        // code here
        if(node1==null && node2==null){
            return true;
        }
        if(node1==null || node2==null){
            return false;
        }
        return(node1.data==node2.data) && Ismirror(node1.left,node2.right) && Ismirror(node1.right,node2.left);
       
        
    }
    public boolean isSymmetric(Node root) {
        // Code here
        if(root==null){
            return true;
        }
        return Ismirror(root.left,root.right);
        
    }
}