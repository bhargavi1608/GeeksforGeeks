/*
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
    int minDepth(Node root) {
        // code here
    Queue<Node> queue = new LinkedList<>();
    queue.add(root);
    int depth=1;
    while(!queue.isEmpty()){
        int size = queue.size();
        for(int i=0;i<size;i++){
            Node current = queue.poll();
            if(current.left==null && current.right==null){
                return depth;
            }
            if(current.left!=null) queue.add(current.left);
            if(current.right!=null) queue.add(current.right);
        }
        depth++;
    }
    return depth;
    } 
}