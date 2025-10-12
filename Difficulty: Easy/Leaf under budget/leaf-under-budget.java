/*
class Node {
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
    }
}
*/
class Solution {
    public int getCount(Node node, int bud) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        int no_of_nodes=1;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                Node current = q.poll();
                if(current.left==null && current.right==null){
                    list.add(no_of_nodes);
               
                }
                if(current.left!=null) q.add(current.left);
                if(current.right!=null) q.add(current.right);
            }
            no_of_nodes++;
        }
        int sum=0;
        int count=0;
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
         
            if(sum>bud){
                break;
            }
            count++;
        }
        return count;
    }
}