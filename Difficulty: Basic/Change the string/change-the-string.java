// User function Template for Java

class Solution {
    String modify(String s) {
        if(Character.isUpperCase(s.charAt(0))){
            s=s.toUpperCase();
        }
        if(Character.isLowerCase(s.charAt(0))){
            s=s.toLowerCase();
        }
        return s;
    }
}