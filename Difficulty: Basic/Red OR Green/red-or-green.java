// User function template for Java

class Solution {
    static int RedOrGreen(int N, String S) {
        // code here
        int GC = 0;
        int RC = 0;
        for(int i=0;i<N;i++){
            if(S.charAt(i)=='G'){
                GC++;
            }else{
                RC++;
            }
        }
        return Math.min(GC,RC);
    }
}