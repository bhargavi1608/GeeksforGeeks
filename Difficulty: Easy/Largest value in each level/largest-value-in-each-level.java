// User function Template for Java

class Solution {
    public ArrayList<Integer> largestValues(Node root) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int max = Integer.MIN_VALUE;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                Node current = q.poll();
                if(current.data>max){
                    max=current.data;
                }
                if(current.left!=null) q.add(current.left);
                if(current.right!=null) q.add(current.right);
                
            }
            list.add(max);
            max=Integer.MIN_VALUE;
        }
        return list;
    }
}