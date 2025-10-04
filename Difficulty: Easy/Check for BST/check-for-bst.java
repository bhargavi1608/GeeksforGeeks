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
    boolean isBST(Node root) {
        // code here.
       return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
       
    }
    private boolean checkBST(Node node, int min, int max){
        if(node==null) return true;
        if(node.data<=min || node.data>=max) return false;
        return checkBST(node.left,min,node.data) && checkBST(node.right,node.data,max);
    }
}