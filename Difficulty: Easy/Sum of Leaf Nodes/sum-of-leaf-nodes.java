/*
// A Binary Tree node
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
    // Function to return sum of all nodes of a binary tree
    static int leafSum(Node root) {
        // Your code here
        int sum =0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                Node current = q.poll();
                if(current.left==null && current.right==null){
                    sum+=current.data;
                }
                if(current.left!=null) q.add(current.left);
                if(current.right!=null) q.add(current.right);
            }
        }
        return sum;
    }
}