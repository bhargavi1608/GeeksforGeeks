class Solution {
    public static boolean prime(int n) {
        // Write your code here
        if(n==1) return false;
        if(n==2 || n==3) return true;
        if(n%2==0) return false;
        for(int i=3;i<=Math.sqrt(n);i+=2){
            if(n%i==0) return false;
            
        }
        return true;
    }
}