// User function Template for Java

class Solution {
    // Complete the function
    // str: input string
    public static int countWords(String str) {
        // find and return the number of words
        // present in the string
      int count=1;
      for(int i=0;i<str.length();i++){
          if(str.charAt(i)==' '){
              count++;
          }
      }
      return count;
        
    }
}