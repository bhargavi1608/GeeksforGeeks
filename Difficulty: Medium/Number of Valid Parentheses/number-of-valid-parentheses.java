class Solution {
    int findWays(int n) {
        // code here
        if (n % 2 != 0) return 0;  // odd length not possible

        int k = n / 2;
        long[] dp = new long[k + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= k; i++) {
            dp[i] = 0;
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }
        return (int)dp[k];
    }
}
