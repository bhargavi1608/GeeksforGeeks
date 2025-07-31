class Solution {
    public int lastDigit(int n) {
        // Code here
        n=Math.abs(n);
        return n%10;
    }
}