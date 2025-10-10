/*Complete the Given Function

Node is as follows:
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=null;
        right=null;
    }
}*/

class Solution {
    public void toSumTree(Node root) {
        // add code here.if(root==null) return;
        convert(root);
    }
    int convert(Node root){
        if(root==null) return 0;
        int leftSum = convert(root.left);
        int rightSum = convert(root.right);
        int oldVal = root.data;
        root.data = leftSum+rightSum;
        return oldVal+root.data;
    }
}