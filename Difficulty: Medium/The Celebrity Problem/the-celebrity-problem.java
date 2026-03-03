class Solution {
    public int celebrity(int mat[][]) {
        // code here
        Stack<Integer> s = new Stack<>();
         int n = mat.length;
         for(int i=0;i<n;i++){
             s.push(i);
         }
        
        while(s.size()>1){
            int row = s.pop();
            int col = s.pop();
            if(mat[row][col]==1){
                s.push(col);
            }else{
                s.push(row);
            }
           
        }
        
        // verify candidate
        int cand = s.pop();
        for(int i=0;i<n;i++){
            if(i!=cand){
                 if(mat[cand][i]==1 || mat[i][cand]==0){
                     return -1;
                 }
            }
        }
        return cand;
        
    }
}