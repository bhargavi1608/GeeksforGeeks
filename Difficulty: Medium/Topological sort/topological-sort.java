class Solution {
    public static ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        //Built adjacenecy list;
       ArrayList<List<Integer>> adj = new ArrayList<>();
       for(int i=0;i<V;i++){
           adj.add(new ArrayList<>());
       }
       for(int[] e:edges){
           adj.get(e[0]).add(e[1]);
           
       }
       
       // compute the indegree
       
       int[] indegree = new int[V];
       for(int u=0;u<V;u++){
           for(int v:adj.get(u)){
               indegree[v]++;
           }
       }
       
       //Initiasize the queue and insert whose indegreee is 0
       Queue<Integer> q = new LinkedList<>();
       for(int i=0;i<V;i++){
           if(indegree[i]==0){
               q.add(i);
           }
       }
       
       // BFS traversal
       ArrayList<Integer> t = new ArrayList<>();
       while(!q.isEmpty()){
           int node = q.poll();
           t.add(node); // t=[1,]
           for(int n:adj.get(node)){
               indegree[n]--;
               if(indegree[n]==0){
                   q.add(n);
               }
           }
       }
       return t;
    }
}