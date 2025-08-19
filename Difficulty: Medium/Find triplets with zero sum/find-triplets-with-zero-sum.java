class Solution {
    public boolean findTriplets(int[] arr) {
        // code here.
       Arrays.sort(arr);
       for(int i=0;i<arr.length-2;i++){
           int j=i+1;
          int  k=arr.length-1;
           while(j<k){
               if(arr[i]+arr[j]+arr[k]==0){
                   return true;
                   
               }else if(arr[i]+arr[j]+arr[k]<0){
                   j++;
               }else{
                   k--;
               }
           }
       }
       return false;
    }
}