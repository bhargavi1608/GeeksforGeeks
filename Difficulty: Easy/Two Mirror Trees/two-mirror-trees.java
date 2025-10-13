// FUNCTION CODE
/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

class Solution {
    boolean areMirror(Node a, Node b) {
        // Your code here
        if(a==null && b==null) return true;
        if(a==null || b==null) return false;
        if(a.data!=b.data){
            return false;
        }
        return areMirror(a.left,b.right) && areMirror(a.right,b.left);
    }
}