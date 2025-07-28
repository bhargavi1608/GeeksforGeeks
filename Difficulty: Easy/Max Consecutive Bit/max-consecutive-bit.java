class Solution {
    public int maxConsecBits(int[] arr) {
        // code here
        if(arr.length==1) return 1;
       int maxcount=0;
       int currentCount=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                currentCount++;
            }else{
                maxcount=Math.max(currentCount,maxcount);
                currentCount=1;
            }
            maxcount=Math.max(currentCount,maxcount);
            
       
    }
    return maxcount;
    }
}
