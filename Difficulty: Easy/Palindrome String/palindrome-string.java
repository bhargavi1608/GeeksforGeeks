class Solution {
    boolean isPalindrome(String s) {
        // code here
        
        char[] st=s.toCharArray();
        int left=0;
        int right=st.length-1;
        while(left<=right){
            if(st[left]!=st[right]){
                return false;
                
            }
            left++;
            right--;
        }
        return true;
    }
}