// User function Template for Java

class Solution {
    static int numOfPerfectSquares(int a, int b) {
        // code here
       int start =(int) Math.ceil(Math.sqrt(a));
       int end = (int) Math.floor(Math.sqrt(b));
       if(start>end) return 0;
       return end-start+1;
    }
};