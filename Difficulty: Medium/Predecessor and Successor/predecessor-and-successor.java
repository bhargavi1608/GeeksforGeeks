/* BST Node
class Node {
    int data;
    Node left, right;
    Node(int x) {
        data = x;
        left = right = null;
    }
} */

class Solution {
    public ArrayList<Node> findPreSuc(Node root, int key) {
        // code here
        List<Node> list = new ArrayList<>();
      
        inorder(root,list);
        Node pre=null, succ=null;
        boolean flag = false;
        for(int i=0;i<list.size();i++){
            if(list.get(i).data>=key){
               if(i>0) pre = list.get(i-1);
               if(list.get(i).data==key && i+1<list.size()){
                   succ = list.get(i+1);
               }else if(list.get(i).data>key){
                   succ = list.get(i);
               }
               flag=true;
               break;
            }
        }
        if(!flag && list.get(list.size()-1).data<key){
            pre = list.get(list.size()-1);
            
        }else if(!flag){
            succ = list.get(list.size()-1);
        }
       ArrayList<Node> result = new ArrayList<>();
       result.add(pre);
       result.add(succ);
       return result;
        
        
    }
    public void inorder(Node node, List<Node> list){
        if(node==null) return;
        inorder(node.left,list);
        list.add(node);
        inorder(node.right,list);
    }
}