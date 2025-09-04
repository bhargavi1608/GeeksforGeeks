/*
class Node{
    int data;
    Node left,right;

    Node(int key)
    {
        data = key;
        left = right = null;
    }
}
*/
class Solution {
    public boolean isSumProperty(Node root) {
        //  code here
        if(root==null){
            return true; //empty tree valid
        }
        if(root.left==null && root.right==null){
            return true;
        }
        int leftval = (root.left!=null)? root.left.data:0;
        int rightval =(root.right!=null)? root.right.data:0;
        return (root.data==leftval+rightval) && isSumProperty(root.left) && isSumProperty(root.right);
        
    }
}