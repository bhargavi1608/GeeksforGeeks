class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> res = new ArrayList<>();
        // finding the no.if vertices
        int V = adj.size();
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        visited.add(0);
        while(!queue.isEmpty()){
           int vertex = queue.poll();
           res.add(vertex);
           for(int n:adj.get(vertex)){
               if(!visited.contains(n)){
               queue.add(n);
               visited.add(n);
               }
           }
        }
        return res;
        
    }
}