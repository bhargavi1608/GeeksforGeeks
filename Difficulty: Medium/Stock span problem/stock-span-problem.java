class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        ArrayList<Integer> span = new ArrayList<>();
       
        
        Stack<Integer> s = new Stack<>();
        
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
           if (s.isEmpty()) {
                span.add(i + 1);
            } else {
                span.add(i - s.peek());
            }
            s.push(i);
        }
        return span;
    }
}