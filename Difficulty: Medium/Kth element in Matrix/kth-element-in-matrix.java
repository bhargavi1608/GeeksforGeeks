class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        // code here
        int n = matrix.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0]-b[0]);
        for(int i=0; i<n; i++)
            pq.offer(new int[]{matrix[i][0], i, 0});
        
        while(--k>0){
            int[] curr = pq.poll();
            if(curr[2]+1<n) pq.offer(new int[]{matrix[curr[1]][curr[2]+1], curr[1], curr[2]+1});
        }
        return pq.peek()[0];
    }
}