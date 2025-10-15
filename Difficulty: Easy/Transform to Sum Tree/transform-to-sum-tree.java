// User function template for JAVA

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
        // add code here.
        convert(root);
        
    }
    public int convert(Node root){
        if(root==null) return 0;
        int leftSum = convert(root.left);
        int RightSum = convert(root.right);
        
        int OldValue = root.data;
        
        root.data = leftSum+RightSum;
        return root.data+OldValue;
        
    }
}