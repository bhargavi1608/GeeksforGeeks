class Solution {
    public static int chocolates(int n, int[] arr) {
        // code here
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
