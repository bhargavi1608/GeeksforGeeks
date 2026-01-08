class Solution {
    public int countSubarrays(int[] arr, int k) {
        // code here
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int prefixSum =0;
        int count =0;
        
        for(int num:arr){
            prefixSum+=(num%2!=0) ? 1 : 0;
            if(map.containsKey(prefixSum-k)){
                count+=map.get(prefixSum-k);
            }
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        }
        return count;
    }
}
