/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    private int checkSumTree(Node root){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return root.data;
        }
        int leftSum =checkSumTree(root.left);
        int rightSum = checkSumTree(root.right);
        
        //if either of the substree is not a subtree, then the whole tree fails
        if(leftSum==-1 || rightSum == -1){
            return -1;
        }
        if(root.data !=leftSum + rightSum){
            return -1;
        }
        return root.data+leftSum+rightSum;
    }
    
    boolean isSumTree(Node root) {
        // Your code here
        return checkSumTree(root)!=-1;
        
        
    }
}