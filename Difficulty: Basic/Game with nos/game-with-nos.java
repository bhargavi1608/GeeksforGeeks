// User function Template for Java

class Complete {

    // Function for finding maximum and value pair
    public static int[] game_with_number(int arr[], int n) {
        // Complete the function
        int[] ans = new int[n];
        for(int i=0;i<n-1;i++){
            ans[i] = arr[i]^arr[i+1];
        }
        ans[n - 1] = arr[n - 1];
        return ans;
    }
}
