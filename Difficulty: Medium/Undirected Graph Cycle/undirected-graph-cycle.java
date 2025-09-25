class Solution {
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
            
        }
        for(int[] e:edges){
            int u = e[0], v=e[1];
            adj.get(u).add(v); 
            adj.get(v).add(u);
           
        }
        boolean[] visited = new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i]){
                if(hasCycle(adj,visited,i,-1)){
                    return true;
                }
            }
        }
        return false;
    }
        private boolean hasCycle(List<List<Integer>> adj, boolean[] visited, int node, int parent){
            visited[node]=true;
            for(int neighbour:adj.get(node)){
                if(!visited[neighbour]){
                    if(hasCycle(adj,visited,neighbour,node)){
                        return true;
                    }
                }else if(neighbour!=parent){
                    return true;
                }
            }
            return false;
        }
        
    
}