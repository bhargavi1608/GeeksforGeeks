class Solution {
    public int kthSmallest(int[][] mat, int k) {
        // code here
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                q.add(mat[i][j]);
            }
        }
        int ans =0;
        for(int i=0;i<k;i++){
            ans = q.poll();
        }
        return ans;
    }
}
