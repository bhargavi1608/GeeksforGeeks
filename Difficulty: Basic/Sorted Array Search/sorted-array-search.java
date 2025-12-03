class Solution {
    static boolean searchInSorted(int arr[], int k) {
        // Your code here
        int left=0;
        int right =arr.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]==k){
                return true;
            }
            if(arr[mid]>k){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return false;
    }
}