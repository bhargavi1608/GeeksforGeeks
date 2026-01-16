class Solution {
    public int minMen(int arr[]) {
        // code here
           int n = arr.length;
        List<int[]> intervals = new ArrayList<>();

        // Build intervals
        for (int i = 0; i < n; i++) {
            if (arr[i] != -1) {
                int start = Math.max(0, i - arr[i]);
                int end = Math.min(n - 1, i + arr[i]);
                intervals.add(new int[]{start, end});
            }
        }

        if (intervals.isEmpty()) return -1;

        // Sort intervals
        intervals.sort((a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0];
            return b[1] - a[1];
        });

        int currEnd = 0;
        int count = 0;
        int i = 0;

        while (currEnd <= n - 1) {
            int maxReach = -1;

            // Try extending coverage
            while (i < intervals.size() && intervals.get(i)[0] <= currEnd) {
                maxReach = Math.max(maxReach, intervals.get(i)[1]);
                i++;
            }

        
            if (maxReach < currEnd) {
                return -1;
            }

            count++;
            currEnd = maxReach + 1;
        }

        return count;
    }
}