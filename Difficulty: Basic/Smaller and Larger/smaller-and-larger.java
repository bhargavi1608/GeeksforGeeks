// User function Template for Java

class Solution {
    int[] getMoreAndLess(int[] arr, int target) {
        // code here
        int SC = 0;
        int LC =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=target){
                LC++;
            }
            if(arr[i]<=target){
                SC++;
            }
            
        }
        return new int[]{SC,LC};
    }
}