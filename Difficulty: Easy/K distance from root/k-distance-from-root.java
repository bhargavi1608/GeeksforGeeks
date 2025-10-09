/*
class Node
{
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

class Tree {
    // Recursive function to print right view of a binary tree.
    ArrayList<Integer> Kdistance(Node root, int k) {
        // Your code here
        ArrayList<Integer> res = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int level =0;
        
        while(!queue.isEmpty()){
            int size = queue.size();
           
                if(level==k){
                    for(Node node:queue){
                        res.add(node.data);
                    }
                    break;
                }
                for(int i=0;i<size;i++){
                    Node current = queue.poll();
                
                    if(current.left!=null) queue.add(current.left);
                    if(current.right!=null) queue.add(current.right);
                }
            
            level++;
        }
        return res;
    }
}