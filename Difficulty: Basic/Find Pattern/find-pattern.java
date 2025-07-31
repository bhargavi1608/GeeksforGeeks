// User function Template for Java
class Solution {
    // function should find if the string p is
    // in the string s. Return the starting index
    // of the string p in s. Return -1 if the
    // string doesnot exists in s.
    public static int findPattern(String s, String p) {
        // code here
        int m = s.length();
        int n = p.length();
        for(int i=0;i<=m-n;i++){
            int j;
            for( j=0;j<n;j++){
                if(s.charAt(i+j)!=p.charAt(j)){
                    break;
                }
            }
            if(j==n){
                return i;
            }
            
        }
        return -1;
    }
}
