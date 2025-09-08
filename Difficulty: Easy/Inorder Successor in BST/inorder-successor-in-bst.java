/*Complete the function below
Node is as follows:
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/
class Solution {
    // returns the inorder successor of the Node x in BST (rooted at 'root')
    public int inorderSuccessor(Node root, Node x) {
        // add code here.
        ArrayList<Node> list = new ArrayList<>();
        
        inorder(root,list);
        int succ = -1;
        for(int i=0;i<list.size();i++){
            if(list.get(i)==x){
                if(i<list.size()-1) succ = list.get(i+1).data; 
                break;
            }
        }
        return succ;
        
    }
    public void inorder(Node node,ArrayList<Node> list){
        if(node==null) return;
        inorder(node.left,list);
        list.add(node);
        inorder(node.right,list);
        
    }
}