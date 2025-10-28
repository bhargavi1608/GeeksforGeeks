
class Solution {
    public void swapKth(List<Integer> arr, int k) {
        // code here
        if (k <= 0 || k > arr.size()) return;
        int first = k-1;
        int end = arr.size()-k;
        int temp = arr.get(first);
        arr.set(first,arr.get(end));
        arr.set(end,temp);
    }
}
