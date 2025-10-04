class Solution {
    boolean isPalindrome(String s) {
        // code here
        return checkpalin(s,0,s.length()-1);
    }
    boolean checkpalin(String s,int start, int end){
        if(start>=end) return true;
        if(s.charAt(start)!=s.charAt(end)) return false;
        return checkpalin(s,start+1,end-1);
    }
    
}