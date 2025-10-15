/*class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
 */

class Solution {
    int maxGCD(Node root) {
        // code here
        int maxGCD =0;
        int ans =0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node curr = q.poll();
            if(curr.left!=null ) q.add(curr.left);
            if(curr.right!=null) q.add(curr.right);
            if(curr.left!=null && curr.right!=null){
                int g = gcd(curr.left.data,curr.right.data);
                if(g>maxGCD){
                    maxGCD=g;
                    ans = curr.data;
                }else if(g==maxGCD && curr.data>ans){
                    ans=curr.data;
                }
            }
        }
        return ans;
    }
    int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}
