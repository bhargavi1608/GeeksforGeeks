class Solution {
    public static int[] decrementArrayElements(int[] arr) {
        // Code here
        int n = arr.length;
        for(int i=0;i<n;i++){
            arr[i]=arr[i]-1;
        }
        return arr;
    }
}