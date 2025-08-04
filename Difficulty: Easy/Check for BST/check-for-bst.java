/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    // Function to check whether a Binary Tree is BST or not.
    boolean check(Node root,int min,int max){
        if(root==null) return true;
        if(root.data>max || root.data<min) return false;
        return check(root.left,min,root.data) && check(root.right,root.data,max);
    }
    boolean isBST(Node root) {
        // code here.
        return check(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
        
    
   
    }
}