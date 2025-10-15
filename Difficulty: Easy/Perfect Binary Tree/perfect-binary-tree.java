/*
class Node {
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
    }
}
*/

class Solution {
    public int findDepth(Node node){
        int d=0;
        while(node!=null){
            d++;
            node=node.left;
        }
        return d;
    }
    public boolean isPerfect(Node root) {
        int depth = findDepth(root);
        return isPerfectRec(root,depth,0);
     
    }
    boolean isPerfectRec(Node node, int depth, int level){
        if(node==null) return true;
        if(node.left==null && node.right==null){
            return (depth==level+1);
        }
        if(node.left==null || node.right==null){
            return false;
        }
        return isPerfectRec(node.left,depth,level+1) && isPerfectRec(node.right,depth,level+1);
        
    }
}