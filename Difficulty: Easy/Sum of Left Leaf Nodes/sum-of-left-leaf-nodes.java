// class Node
// {
//     int data;
//     Node left, right;

//     public Node(int d)
//     {
//         data = d;
//         left = right = null;
//     }
// }

class Solution {

    public int leftLeavesSum(Node root) {
        // Write your code here
        if(root==null) return 0;
        int sum=0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                Node current = q.poll();
                if(current.left!=null &&current.left.left==null && current.left.right==null){
                    sum+=current.left.data;
                }
                if(current.left!=null) q.add(current.left);
                if(current.right!=null) q.add(current.right);
            }
        }
        return sum;
    }
}