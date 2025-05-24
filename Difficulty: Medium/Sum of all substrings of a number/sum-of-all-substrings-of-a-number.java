class Solution {
    public static int sumSubstrings(String s) {
        // code here
        int n = s.length();
        int prev =0;
        int total =0;
        int mod = (int)1e9+7;
        for(int i=0;i<n;i++){
            int num = s.charAt(i)-'0';
            prev = prev*10+num*(i+1);
            total+=prev;
        }
        return total;
    }
}