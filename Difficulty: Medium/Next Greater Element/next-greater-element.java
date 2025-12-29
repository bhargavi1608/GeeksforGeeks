class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        // code here
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        for(int i=0;i<n;i++){
            res.add(-1);
        }
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<=arr[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                res.set(i,stack.peek());
            }
            stack.push(arr[i]);
        }
        return res;
        
    }
}