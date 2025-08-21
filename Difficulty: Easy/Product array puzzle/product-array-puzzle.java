// User function Template for Java
class Solution {
    public static int[] productExceptSelf(int arr[]) {
        // code here
        int n = arr.length;
        int[] output = new int[n];
        output[0]=1;
        for(int i=1;i<n;i++){
            output[i]=output[i-1]*arr[i-1];
        }
        int right=1;
        for(int i=n-1;i>=0;i--){
            output[i]=output[i]*right;
            right*=arr[i];
        }
        return output;
    }
}
