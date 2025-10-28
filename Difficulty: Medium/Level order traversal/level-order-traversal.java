/*
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // code here
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            ArrayList<Integer> level = new ArrayList<>();
            for(int i=0;i<q.size();i++){
                Node current = q.poll();
                level.add(current.data);
            
                if(current.left!=null) q.add(current.left);
                if(current.right!=null) q.add(current.right);
            }
            list.add(level);
        }
        return list;
    }
}