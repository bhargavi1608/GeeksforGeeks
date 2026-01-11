class Solution {
    public String minWindow(String s1, String s2) {
        // code here
        int n = s1.length();
        int m = s2.length();

        int minLen = Integer.MAX_VALUE;
        int startIndex = -1;

        int i = 0; // pointer for s1

        while (i < n) {
            int j = 0; // pointer for s2

            // ---------- Forward scan ----------
            while (i < n) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    j++;
                    if (j == m) break;
                }
                i++;
            }

            if (j < m) break; // no more subsequence possible

            int end = i; // window ends here

            // ---------- Backward shrink ----------
            j = m - 1;
            while (j >= 0) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    j--;
                }
                i--;
            }

            i++; // correct overshoot
            int len = end - i + 1;

            // ---------- Update answer ----------
            if (len < minLen) {
                minLen = len;
                startIndex = i;
            }

            // Move forward to look for next window
            i = i + 1;
        }

        return startIndex == -1 ? "" : s1.substring(startIndex, startIndex + minLen);
    }
}
