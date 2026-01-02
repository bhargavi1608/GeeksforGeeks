
class Solution {
    static int removeConsecutiveSame(String[] arr) {
        // Your code goes here
        Stack<String> st = new Stack<>();
        
        for(String s:arr){
            if(!st.isEmpty() && st.peek().equals(s)){
                st.pop();
            }else{
                st.push(s);
            }
           
        }
        return st.size();
    }
}