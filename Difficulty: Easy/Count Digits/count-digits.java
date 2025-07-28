class Solution {
    public int countDigits(int n) {
        // code here
        int count=0;
        if(n==0) count=1;
        else{
        while(n!=0){
           n/=10;
           count++;
        }
        }
        return count;
    }
}
