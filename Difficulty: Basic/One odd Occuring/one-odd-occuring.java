class Solution {
    // Method to find the element with odd occurrence in given array
    int getOddOccurrence(int[] arr) {
        // code here
        Map<Integer,Integer> map = new HashMap<>();
        for(int val:arr){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue()%2!=0){
                return e.getKey();
            }
        }
        return 0;
    }
}