/*
// A Binary Tree node
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
    /*you are required to complete this function */
    boolean hasPathSum(Node root, int target) {
        // Your code here
       if(root==null) return false;
       if(root.left==null && root.right==null){
           return root.data==target;
       }
       int targetSum = target-root.data;
       return hasPathSum(root.left,targetSum) || hasPathSum(root.right,targetSum);
    }
}