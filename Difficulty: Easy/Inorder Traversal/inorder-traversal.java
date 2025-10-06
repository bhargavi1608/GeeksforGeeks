/*
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<Integer> inOrder(Node root) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        inorderTraversal(root,list);
        return list;
    }
    private void  inorderTraversal(Node root, ArrayList<Integer> list){
        if(root==null) return;
        inorderTraversal(root.left,list);
        list.add(root.data);
        inorderTraversal(root.right,list);
        
    }
}