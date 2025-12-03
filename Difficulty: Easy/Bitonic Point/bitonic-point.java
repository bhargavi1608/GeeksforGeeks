// User function Template for Java

class Solution {
    public int findMaximum(int[] arr) {
        // code here
      for(int i=1;i<arr.length;i++){
          if(arr[i-1]>arr[i]){
              return arr[i-1];
          }
      }
     return -1;
    }
}