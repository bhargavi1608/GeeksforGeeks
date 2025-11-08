class Solution {
    public boolean findTriplet(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        for(int i=n-1;i>=2;i--){
            int left =0,right=i-1;
            while(left<right){
                long sum = (long) arr[left]+arr[right];
                if(sum==arr[i]){
                    return true;
                }else if(sum<arr[i]){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return false;
    }
}