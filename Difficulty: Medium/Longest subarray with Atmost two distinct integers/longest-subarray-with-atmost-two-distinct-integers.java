class Solution {
    public int totalElements(int[] arr) {
        // code here
        Map<Integer,Integer> map = new HashMap<>();
        int left =0;
        int max =0;
        
        for(int right =0;right<arr.length;right++){
            map.put(arr[right],map.getOrDefault(arr[right],0)+1);
           
            while(map.size()>2){
                int count = map.get(arr[left])-1;
                if(count==0){
                    map.remove(arr[left]);
                }else{
                    map.put(arr[left],count);
                }
                left++;
            }
            max=Math.max(max,right-left+1);
        }
        return max;
        
    }
}