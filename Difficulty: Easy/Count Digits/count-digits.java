// User function Template for Java

class Solution {
    static int evenlyDivides(int n) {
        // code here
      return helper(n,n);
    }
    private static int helper(int curr_num, int original_num){
        if(curr_num==0) return 0;
        
        int digit = curr_num%10;
        int count=0;
        if(digit!=0 && original_num%digit==0){
            count=1;
        }
        return count+ helper(curr_num/10, original_num);
    }
}