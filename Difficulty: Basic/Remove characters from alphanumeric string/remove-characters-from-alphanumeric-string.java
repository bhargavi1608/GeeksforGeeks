// User function Template for Java

class Solution {
    String removeCharacters(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}