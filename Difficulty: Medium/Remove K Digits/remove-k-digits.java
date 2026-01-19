class Solution {
    public String removeKdig(String s, int k) {
        // code here
        Stack<Character> st = new Stack<>();
       
        for(char c:s.toCharArray()){
            while(!st.isEmpty() && k>0 && st.peek()>c){
                st.pop();
                k--;
            }
            st.push(c);
        }
        while(k>0){
            st.pop();
            k--;
            
        }
        StringBuilder sb = new StringBuilder();
        boolean leadingZero=true;
        for(char c:st){
            if(leadingZero && c=='0'){
                continue;
            }
            leadingZero=false;
            sb.append(c);
        }
        return (sb.length()==0) ? "0" : sb.toString();
    }
}