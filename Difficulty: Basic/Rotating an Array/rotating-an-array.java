// User function Template for Java

class Solution {
    void leftRotate(int arr[], int d) {
        // code here
        int n = arr.length;
        d=d%n;
        int k =0;
        int[] temp = new int[arr.length];
        for(int i=d;i<arr.length;i++){
            temp[k++]=arr[i];
        }
        for(int i=0;i<d;i++){
            temp[k++] = arr[i]; 
        }
        for(int i=0;i<temp.length;i++){
            arr[i]=temp[i];
        }
        
    }
}
