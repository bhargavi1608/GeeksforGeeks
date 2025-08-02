// User function Template for Java
class Solution {
    public static char extraChar(String s1, String s2) {

        // write your code here
        char[] s11 = s1.toCharArray();
        char[] s22 = s2.toCharArray();
        Arrays.sort(s11);
        Arrays.sort(s22);
        for(int i=0;i<s11.length;i++){
            if(s11[i]!=s22[i]){
                return s22[i];
            }
        }
        return s22[s22.length-1];
    }
}
