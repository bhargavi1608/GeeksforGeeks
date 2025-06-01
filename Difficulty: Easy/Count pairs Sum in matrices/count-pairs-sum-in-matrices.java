class Solution {
    int countPairs(int[][] mat1, int[][] mat2, int x) {
        // code here
        int n=mat1.length;
        int[] flat1 = new int[n*n];
        int[] flat2 = new int[n*n];
        int idx=0;
        for(int[] row:mat1){
            for(int val:row){
                flat1[idx++]=val;
            }
        }
        idx=0;
        for(int[] row : mat2){
            for(int val:row){
                flat2[idx++]=val;
            }
        }
        int i=0;
        int count=0;
        int j=flat2.length-1;
        while(i<flat1.length && j>=0){
            if(flat1[i]+flat2[j]==x){
                count++;
                i++;
                j--;
            }
            else if(flat1[i]+flat2[j]<x){
                i++;
            }
            else{
                j--;
            }
        }
        return count;
        
        
    }
}