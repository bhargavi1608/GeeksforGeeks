/*Complete the finction below
Node is as follows
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}*/
class Solution {
    public int maxLevelSum(Node root) {
        // add code here.
        int maxSum = Integer.MIN_VALUE;
        int level=0;
        int sum=0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                Node current = q.poll();
                sum+=current.data;
                if(current.left!=null) q.add(current.left);
                if(current.right!=null) q.add(current.right);
            }
            if(sum>maxSum){
                maxSum=sum;
            }
            sum=0;
            level++;
        }
        return maxSum;
    }
}