// User function Template for Java

class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        HashSet seen = new HashSet<>();
        int n = arr.length;
       for(int num:arr){
           int complement = target-num;
           if(seen.contains(complement)){
               return true;
           }
           seen.add(num);
       }
       return false;
        
    }
}