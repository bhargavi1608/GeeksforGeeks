class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        int n = arr.length;
        int minidx=0;
        for(int i=1;i<n;i++){
            if(arr[i]<arr[minidx]){
                minidx=i;
            }
            
            
        }
        return minidx;
       
    }
        
}