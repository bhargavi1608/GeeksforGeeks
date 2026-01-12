class Solution {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        
         Deque<Integer> dq = new ArrayDeque<>(); // stores indices

        for (int i = 0; i < arr.length; i++) {

            // 1 Remove elements out of this window
            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // 2 Remove smaller elements (they are useless)
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) {
                dq.pollLast();
            }

            // 3 Add current index
            dq.offerLast(i);

            // 4 Window formed → add maximum
            if (i >= k - 1) {
                result.add(arr[dq.peekFirst()]);
            }
        }

        return result;
    }
}