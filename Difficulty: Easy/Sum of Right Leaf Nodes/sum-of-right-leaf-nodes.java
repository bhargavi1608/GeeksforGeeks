class Solution {
    int rightLeafSum(Node root) {
        // code here
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int sum=0;
        while(!q.isEmpty()){
            Node curr = q.poll();
            if(curr.right!=null){
                if(curr.right.left==null && curr.right.right==null){
                    sum+=curr.right.data;
                }
                q.add(curr.right);
            }
            if(curr.left!=null) q.add(curr.left);
           
        }
        return sum;
    }
}