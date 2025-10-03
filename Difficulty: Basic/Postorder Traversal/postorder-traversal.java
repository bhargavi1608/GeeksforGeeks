/*
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    ArrayList<Integer> postOrder(Node root) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        
        postOrderHelper(root,list);
        return list;
    }
    public void postOrderHelper(Node root, ArrayList<Integer> list){
        if(root==null) return;
        
        postOrderHelper(root.left,list);
        postOrderHelper(root.right,list);
        list.add(root.data);
    }
}