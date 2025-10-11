// User function Template for Java
class Solution {
    static String removeChars(String str1, String str2) {
        // code here
        StringBuilder sb = new StringBuilder();
        Set<Character> seen = new HashSet<>();
        for(char c: str2.toCharArray()){
            seen.add(c);
        }
        for(int i=0;i<str1.length();i++){
            if(!seen.contains(str1.charAt(i))){
                sb.append(str1.charAt(i));
            }
        }
        return sb.toString();
    }
}