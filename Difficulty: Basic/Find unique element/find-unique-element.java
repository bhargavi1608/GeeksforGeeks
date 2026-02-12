class Solution {
    public int findUnique(int k, int[] arr) {
        // code here
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue()==1){
                return e.getKey();
            }
        }
        return -1;
    }
}