
class Solution {
    public int longestCommonSum(int[] a1, int[] a2) {
        // Code here
          int n = a1.length;
        int[] diff = new int[n];

        // Step 1: Create a difference array
        for (int i = 0; i < n; i++) {
            diff[i] = a1[i] - a2[i];
        }

        // Step 2: Use HashMap to store prefix sum and first index where it occurred
        Map<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        int prefixSum = 0;

        for (int i = 0; i < n; i++) {
            prefixSum += diff[i];

            if (prefixSum == 0) {
                // If sum is zero till index i
                maxLen = i + 1;
            }

            if (map.containsKey(prefixSum)) {
                // Found a subarray with same prefix sum earlier
                int prevIndex = map.get(prefixSum);
                maxLen = Math.max(maxLen, i - prevIndex);
            } else {
                // Store first occurrence of this prefix sum
                map.put(prefixSum, i);
            }
        }

        return maxLen;
    }
}