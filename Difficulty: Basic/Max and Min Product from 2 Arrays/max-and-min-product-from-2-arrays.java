// User function Template for Java

class Solution {
    // Function to find the maximum element from array arr1 and
    // the minimum element from array arr2 and return their product.
    public long findMultiplication(int[] arr1, int[] arr2) {
        // code here
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>max){
                max = arr1[i];
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr2.length;i++){
            if(arr2[i]<min){
                min = arr2[i];
            }
        }
        return max*min;
    }
}