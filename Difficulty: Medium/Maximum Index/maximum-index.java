class Solution {
    int maxIndexDiff(int[] arr) {
        // code here
        int n = arr.length;
        int[] Lmin = new int[n];
        int[] Rmax = new int[n];
        
        Lmin[0]=arr[0];
        for(int i=1;i<n;i++){
            Lmin[i]=Math.min(arr[i],Lmin[i-1]);
        }
        Rmax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            Rmax[i]=Math.max(arr[i],Rmax[i+1]);
        }
        int i=0,j=0,maxDiff=0;
        while(i<n && j<n){
            if(Lmin[i]<=Rmax[j]){
                maxDiff=Math.max(maxDiff,j-i);
                j++;
            }else{
                i++;
               
            }
        }
        return maxDiff;
    }
}