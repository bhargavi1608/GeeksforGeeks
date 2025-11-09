// User function Template for Java

class Solution {

    int minProduct(int arr[], int k) {
        // Complete the function
        Arrays.sort(arr);
        long n = (long) 1e9;
        n=n+7l;
        long ans = 1l;
        
        for(int i=0;i<arr.length && i<k;i++){
            ans = (long) ans* (long) arr[i];
            ans= (long) ans%(long) n;
        }
        
        long a = (long) ans%(long)n;
        return (int) a;
    }
}
