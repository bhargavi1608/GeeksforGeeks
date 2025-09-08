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
        List<Integer> list = new ArrayList<>();
        inorder(root,list);
        return list.get(list.size()-k);
    }
    public void inorder(Node node,List<Integer> list){
        if(node==null) return;
        inorder(node.left,list);
        list.add(node.data);
        inorder(node.right,list);
       
    }
}