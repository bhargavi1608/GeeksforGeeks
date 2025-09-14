

class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                second = largest;
                largest = arr[i];
               
            }
            else if(arr[i]<largest && arr[i]>second){
                second=arr[i];
            }
        }
        if(second==Integer.MIN_VALUE){
            return -1;
        }
        return second;
        
    }
}