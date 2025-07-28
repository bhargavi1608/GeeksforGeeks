// User function Template for Java
class Solution {
    String isVowel(char c) {
        // code here
        c=Character.toLowerCase(c);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') return "YES";
        return "NO";
    }
}
