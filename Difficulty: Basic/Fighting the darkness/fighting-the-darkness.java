// User function Template for Java

class Solution {
    long maxDays(int arr[]) {
        // code here
        long max =Long.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}