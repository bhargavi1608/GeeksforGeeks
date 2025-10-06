/*  A Binary Tree nodea
class Node
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
class Tree {
    ArrayList<Integer> noSibling(Node node) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        if(node==null){
            res.add(-1); 
            return res;
        } 
        Stack<Node> s = new Stack<>();
        s.push(node);
        while(!s.isEmpty()){
            Node current = s.pop();
            if(current.left!=null && current.right==null){
                res.add(current.left.data);
            }
            if(current.left==null && current.right!=null){
                res.add(current.right.data);
            }
            if(current.left!=null){
                s.push(current.left);
            }
            if(current.right!=null){
                s.push(current.right);
            }
        }
        if(res.isEmpty()){
            res.add(-1);
            return res;
            
        }
        Collections.sort(res);
        return res;
    }
}