class Solution {
    public ArrayList<Integer> preorder(Node root) {
        //  code here
        ArrayList<Integer> list = new ArrayList<>();
        
        preorderHelper(root,list);
        return list;
    }
    
    public void preorderHelper(Node root, ArrayList<Integer> list){
        if(root==null) return;
        
        list.add(root.data);
        preorderHelper(root.left,list);
        preorderHelper(root.right,list);
    
        
    }
}