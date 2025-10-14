/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Solution {
    int getLevelDiff(Node root) {
        // code here
        ArrayList<Integer> EvenList = new ArrayList<>();
        ArrayList<Integer> OddList = new ArrayList<>();
        int sum=0;
        int level =1;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                Node current = q.poll();
                sum+=current.data;
                if(current.left!=null) q.add(current.left);
                if(current.right!=null) q.add(current.right);
            }
            if(level%2==0){
                EvenList.add(sum);
            }else{
                OddList.add(sum);
            }
            level++;
            sum=0;
        }
        int EvenSum=0;
        for(int i=0;i<EvenList.size();i++){
            EvenSum+=EvenList.get(i);
        }
        int OddSum=0;
        for(int i=0;i<OddList.size();i++){
            OddSum+=OddList.get(i);
        }
        return OddSum-EvenSum;
    }
}