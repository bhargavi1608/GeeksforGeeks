/*class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/

class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        //  code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            ArrayList<Integer> level = new ArrayList<>();
            for(int i=0;i<size;i++){
                Node current = queue.poll();
                level.add(current.data);
                if(current.left!=null) queue.add(current.left);
                if(current.right!=null) queue.add(current.right);
            }
            res.add(level);
        }
        return res;
    }
}