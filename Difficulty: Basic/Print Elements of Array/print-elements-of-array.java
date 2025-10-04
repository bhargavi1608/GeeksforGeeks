// User function Template for Java

class Solution {
    // Just print the space seperated array elements
    void printArray(int arr[]) {
        //   code here
        print(arr,0);
        
    }
    private void print(int[] arr, int idx){
        if(idx==arr.length) return;
        System.out.print(arr[idx]+" ");
        print(arr,idx+1);
    }
    
}