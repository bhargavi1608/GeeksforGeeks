/*
class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Solution {
    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root, int k) {
        // Your code here
        Stack<Node> s = new Stack<>();
        Node curr = root;
        while(!s.isEmpty() || curr!=null){
            while(curr!=null){
                s.push(curr);
                curr=curr.right;
            }
           curr = s.pop();
            if(--k==0){
                return curr.data;
            }
            curr=curr.left;
        }
        return -1;
    }
}