// User function Template for Java

class Solution {
    int shortestDistance(ArrayList<String> s, String word1, String word2) {
        // code here
       int index1=-1,index2=-1;
       int minDist = Integer.MAX_VALUE;
       for(int i=0;i<s.size();i++){
           String word = s.get(i);
           if(word.equals(word1)){
               index1=i;
           }
           if(word.equals(word2)){
               index2=i;
           }
           if(index1!=-1 && index2!=-1){
               minDist=Math.min(minDist,Math.abs(index1-index2));
           }
       }
       return minDist;
    }
};