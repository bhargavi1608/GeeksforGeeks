// User function Template for Java
class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        StringBuilder sb = new StringBuilder();
       Arrays.sort(arr);
      String first=arr[0];
      String last= arr[arr.length-1];
      int n = Math.min(first.length(),last.length());
      for(int i=0;i<n;i++){
          if(first.charAt(i)==last.charAt(i)){
              sb.append(first.charAt(i));
               
      }
      else{
          break;
      }
      }
      return sb.toString();
   
    }
}