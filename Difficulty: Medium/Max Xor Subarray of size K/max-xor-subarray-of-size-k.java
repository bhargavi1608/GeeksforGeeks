class Solution {
    public int maxSubarrayXOR(int[] arr, int k) {
        // code here
        int windowXor=0;
        int maxXor =0;
        for(int i=0;i<arr.length;i++){
            windowXor^=arr[i];
            if(i>=k-1){
                maxXor=Math.max(windowXor,maxXor);
                windowXor^=arr[i-(k-1)];
            }
        }
        return maxXor;
    }
}
