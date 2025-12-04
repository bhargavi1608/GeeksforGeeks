class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        // code here
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> res = new ArrayList<>();
        for(int i=1;i<=arr.length;i++){
            res.add(map.getOrDefault(i,0));
        }
        return res;
    }
}
