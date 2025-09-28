/*
class NodeLL {
    int data;
    NodeLL next;

    NodeLL(int x) {
        data = x;
        next = null;
    }
}

class Node {
    int data;
    Node left, right;

    Node(int x) {
        data = x;
        left = right = null;
    }
}
*/
class Solution {
    public Node linkedListToBinaryTree(NodeLL head) {
        // code here
        if(head==null) return null;
        
        Node root = new Node(head.data);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        head=head.next;
        while(head!=null){
            Node parent = q.poll();
            Node leftNode = new Node(head.data);
            parent.left=leftNode;
            q.add(leftNode);
            head=head.next;
            if(head!=null){
                Node rightNode = new Node(head.data);
                parent.right = rightNode;
                q.add(rightNode);
                head=head.next;
            }
        }
        return root;
    }
}
