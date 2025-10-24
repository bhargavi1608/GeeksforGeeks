// User function Template for Java

class Solution {
    String removeSpecialCharacter(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        if(sb.length()==0){
            return "-1";
        }
        return sb.toString();
    }
}