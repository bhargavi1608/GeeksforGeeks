class Solution {
    // Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> s) {
        // code here
    
        int size = s.size();
        int middle = (size-1)/2;
        s.remove(middle);
        
    }
}