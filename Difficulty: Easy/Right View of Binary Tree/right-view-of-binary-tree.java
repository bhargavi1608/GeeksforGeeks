/*
class Node
{
    int data;
    Node left, right;
    public Node(int data)
    {
        this.data = data;
         left = right = null;
    }
}*/

class Solution {
    ArrayList<Integer> rightView(Node root) {
        // code here.
        ArrayList<Integer> list = new ArrayList<>();
        if(root==null) return list;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<=size-1;i++){
                Node current = queue.poll();
                if(i==size-1){
                    list.add(current.data);
                    
                }
                if(current.left!=null) queue.add(current.left);
                if(current.right!=null) queue.add(current.right);
            }
        }
        return list;
        
    }
}