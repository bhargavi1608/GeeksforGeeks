class Solution {
    public ArrayList<Integer> nextFreqGreater(int[] arr) {
        // code here
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        ArrayList<Integer> res = new ArrayList<>();
        int n = arr.length;
        int[] nums = new int[n];
        Arrays.fill(nums,-1);
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && map.get(arr[s.peek()])<map.get(arr[i])){
                
                nums[s.pop()]=arr[i];
                
            }
            s.add(i);
        }
        
        for(int num:nums){
            res.add(num);
        }
        return res;
    }
}