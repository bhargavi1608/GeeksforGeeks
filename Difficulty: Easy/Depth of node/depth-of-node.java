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
    public static int depthOfOddLeaf(Node root) {
        // code here
        if (root == null) return 0;
        int level =1;
        int maxDepth =0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                Node current = q.poll();
                if(current.left==null && current.right==null && level%2!=0){
                   maxDepth = level;
                }
                if(current.left!=null) q.add(current.left);
                if(current.right!=null) q.add(current.right);
            }
           level++;
           
        }
        return maxDepth;
    }
}