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
    public ArrayList<Integer> nodesAtOddLevels(Node root) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        boolean level = true;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            
            for(int i=0;i<size;i++){
                Node current = q.poll();
                if(level){
                    list.add(current.data);
                }
                if(current.left!=null) q.add(current.left);
                if(current.right!=null) q.add(current.right);
            }
            level=!level;
        }
        return list;
    }
}