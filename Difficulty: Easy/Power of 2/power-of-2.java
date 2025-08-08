class Solution {
    public static boolean isPowerofTwo(int n) {
        // code here
        return n>0 && (n&(n-1))==0;
        // if(n<=0) return false;
        // while(n%2==0){
        //     n/=2;
        // }
        // return n==1;
        
        
    }
}