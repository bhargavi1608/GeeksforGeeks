// User function Template for Java

class Solution {
    public long[] findElements(long arr[]) {
        // Your code goes here
        long first_max = Long.MIN_VALUE;
        long second_max = Long.MIN_VALUE;
        for(long val:arr){
            if(val>first_max){
            second_max=first_max;
            first_max = val;
                
            }else if(val<first_max && val>second_max){
                second_max=val;
            }
        }
        ArrayList<Long> list = new ArrayList<>();
        for(long val:arr){
            if(val!=first_max && val!=second_max){
                list.add(val);
            }
        }
        long[] ans= new long[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        Arrays.sort(ans);
        return ans;
    }
}