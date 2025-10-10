// User function Template for Java

class Solution {
    String removeVowels(String s) {
        // code here
        String vowels = "aeiouAEIOU";
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            if(vowels.indexOf(s.charAt(i))==-1){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}