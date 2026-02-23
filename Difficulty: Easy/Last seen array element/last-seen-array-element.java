// User function Template for Java

class Solution {

    public static int lastSeenElement(int arr[]) {
        // Complete the function
       Map<Integer,Integer> map = new HashMap<>();
       for(int i=0;i<arr.length;i++){
           map.put(arr[i],i);
       }
       int min_idx=Integer.MAX_VALUE;
       int ans = -1;
       for(Map.Entry<Integer,Integer> e:map.entrySet()){
           if(e.getValue()<min_idx){
               min_idx=e.getValue();
               ans=e.getKey();
           }
       }
       return ans;
        
    }
}
