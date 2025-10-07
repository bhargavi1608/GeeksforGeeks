/*
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
    public ArrayList<Integer> reverseLevelOrder(Node root) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        Stack<Integer> s = new Stack<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node curr = queue.poll();
            s.push(curr.data);
            
            
            if(curr.right!=null) queue.add(curr.right);
            if(curr.left!=null) queue.add(curr.left);
            
        }
        while(!s.isEmpty()){
            list.add(s.pop());
        }
        return list;
    }
}