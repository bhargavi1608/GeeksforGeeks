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
    public static ArrayList<Integer> treeTraversal(Node root){
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                Node current = q.poll();
                list.add(current.data);
                if(current.left!=null) q.add(current.left);
                if(current.right!=null) q.add(current.right);
            }
        }
        return list;
        
        
    }
    public static int findMax(Node root) {
        // code here
        ArrayList<Integer> list = treeTraversal(root);
        int max = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>max){
                max=list.get(i);
            }
        }
        return max;
        
    }

    public static int findMin(Node root) {
        
        ArrayList<Integer> list = treeTraversal(root);
        int min = Integer.MAX_VALUE;
        for(int i=0;i<list.size();i++){
            if(list.get(i)<min){
                min=list.get(i);
            }
        }
        return min;
    }
}