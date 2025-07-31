// User function Template for Java
class Solution {
    public static int nFactorial(int n) {
       if(n==0 || n==1){
           return 1;
       }
       return n*nFactorial(n-1);
    }
}