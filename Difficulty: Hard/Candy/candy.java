class Solution {
    public int minCandy(int arr[]) {
        // code here
        int[] candy = new int[arr.length];
        Arrays.fill(candy,1);
        int left =0;
        int right = arr.length-1;
        for(int i=1;i<=right;i++){
            if(arr[i-1]<arr[i]){
                candy[i]=candy[i-1]+1;
            }
        }
        
        for(int i=right-1;i>=left;i--){
            if(arr[i+1]<arr[i]){
                candy[i]=Math.max(candy[i],candy[i+1]+1);
            }
        }
        
        int minSum=0;
        for(int num:candy){
            minSum+=num;
        }
        return minSum;
    }
}
