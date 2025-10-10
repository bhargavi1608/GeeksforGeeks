/*Structure of the node class is
class Node
{
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
} */

class Solution {
    // The given root is the root of the Binary Tree
    // Return the root of the generated BST
    Node binaryTreeToBST(Node root) {
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root,list);
        Collections.sort(list);
        return constructBST(list,0,list.size()-1);
        
    }
    void inorder(Node root, ArrayList<Integer> list) {
    if (root == null) return;

    inorder(root.left, list);
    list.add(root.data);  
    inorder(root.right, list);
}

    Node constructBST(ArrayList<Integer> list,int left,int right){
        if(left>right) return null;
        int mid = (left+right)/2;
        Node root = new Node(list.get(mid));
        root.left=constructBST(list,left,mid-1);
        root.right = constructBST(list,mid+1,right);
        return root;
    }
    
    
    
}