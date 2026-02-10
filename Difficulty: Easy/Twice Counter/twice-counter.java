// User function Template for Java

class Solution {
    public int countWords(String list[], int n) {
        // code here
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(list[i],map.getOrDefault(list[i],0)+1);
            
        }
        int count=0;
        for(int val:map.values()){
            if(val==2){
                count++;
            }
        }
        return count;
    }
}