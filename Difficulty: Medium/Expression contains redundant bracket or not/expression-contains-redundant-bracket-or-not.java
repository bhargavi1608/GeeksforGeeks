class Solution {
    public static boolean checkRedundancy(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        for(char c:s.toCharArray()){
            if(c!=')'){
               st.push(c);
            }
            else{
                boolean hasop = false;
                while(!st.isEmpty() && st.peek()!='('){
                    char top = st.pop();
                    if(top=='+' || top=='-' || top=='*' || top=='/'){
                        hasop=true;
                    }
                }
                st.pop();
                if(!hasop){
                    return true;
                }
            }
            
            
        }
        return false;
    }
}
