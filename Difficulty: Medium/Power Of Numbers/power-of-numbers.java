class Solution {
    public int reverseExponentiation(int n) {
        // code here
        int reverse = rev(n);
        return power(n,reverse);
        
    }
    private int rev(int n){
        int rev =0;
        while(n>0){
            rev=rev*10+(n%10);
            n/=10;
        }
        return rev;
    }
    private int power(int n, int r){
        if(r==0) return 1;
        
        return n*power(n,r-1);
    }
}
