// Helper class to find largest number with minimum frequency
class Solution {
    // Function to find largest number with minimum frequency
    public static int LargButMinFreq(int arr[], int n) {
        // Your code here
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int maxN=Integer.MIN_VALUE;
        int minF= Integer.MAX_VALUE;
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            if(e.getValue()<minF || e.getValue()==minF && e.getKey()>maxN){
                maxN= e.getKey();
                minF = e.getValue();
            }
        }
        return maxN;
        
    }
}