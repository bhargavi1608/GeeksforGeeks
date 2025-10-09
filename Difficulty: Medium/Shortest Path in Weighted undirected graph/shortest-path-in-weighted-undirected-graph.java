class Solution {
    public List<Integer> shortestPath(int n, int m, int edges[][]) {
        //  Code Here.
        List<List<int[]>> adj = new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int[] e:edges){
            int u = e[0],v=e[1], w = e[2];
            
            adj.get(u).add(new int[]{v,w});
            adj.get(v).add(new int[]{u,w});
        }
        
        
        //Dikstras algorithm
        
        int INF = (int)1e9;
        int[] dist = new int[n+1];
        int[] parent = new int[n+1];
        
        Arrays.fill(dist,INF);
        for(int i=1;i<=n;i++){
            parent[i]=i; // each node is parent to itself [1,2,3,4,5]
            
        }
        
        dist[1]=0; // src =1 dist [1,inf,inf,inf,inf,inf]
        //min heap
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0]-b[0]);
        
        pq.offer(new int[]{0,1}); // distance =0 src=1
        
        while(!pq.isEmpty()){ // pq=[0,1]
            int[] curr = pq.poll();
            int d = curr[0], u = curr[1]; // dist=0, v=1
            if(d>dist[u]) continue;
            
           // edges = [[1, 2, 2], [2, 5, 5], [2, 3, 4], [1, 4, 1], [4, 3, 3], [3, 5, 1]]
            for(int[] e:adj.get(u)){ // 1-> [2,2],[4,1]
                int v = e[0], w=e[1]; // v=2, w=2
                if(dist[u]+w<dist[v]){
                    dist[v] = dist[u]+w;
                    parent[v]=u; // [1,1,3,1,5];
                    pq.offer(new int[]{dist[v],v});
                }
            }
            
        }
            // check if path exists 
            
            if(dist[n]==INF){
                return Arrays.asList(-1);
            }
            // dist = [inf,0,2,4,1,5] parent = [1,1,4,1,3]
            
            // reconstruct the path from parent array
            
            List<Integer> path = new ArrayList<>();
            int node = n;
            while(parent[node]!=node){
                path.add(node);
                node = parent[node];
            }
            path.add(1); // 5 3 4 1
            
           // 1 4 3 5
            // build the result
            
            
        Collections.reverse(path); 
        List<Integer> result = new ArrayList<>();
        result.add(dist[n]);
        result.addAll(path);
        return result;
       
        
        
    }
}