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
    private Integer leafLevel = null;
    boolean check(Node root) {
        // Your code here
        return dfs(root,1);
        
    }
    private boolean dfs(Node root,int level){
        if(root==null) return true;
        if(root.left==null && root.right==null){
            if(leafLevel==null){
                leafLevel = level;
            }else if(leafLevel!=level){
                return false;
            }
            return true;
        }
        return dfs(root.left,level+1) && dfs(root.right,level+1);
    }
}