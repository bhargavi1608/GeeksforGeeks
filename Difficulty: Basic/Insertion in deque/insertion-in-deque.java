class Solution {
    public Deque<Integer> dqInsertion(List<Integer> arr) {
        // code here
        Deque<Integer> deq = new ArrayDeque<>();
        for(int num:arr){
            deq.addLast(num);
        }
        return deq;
    }
}