
class Solution {
    public static boolean isFrequencyUnique(int n, int[] arr) {
        // code here
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        Set<Integer> set = new HashSet<>();
        for(int val:map.values()){
            if(set.contains(val)){
                return false;
            }
            set.add(val);
        }
        return true;
    }
}
