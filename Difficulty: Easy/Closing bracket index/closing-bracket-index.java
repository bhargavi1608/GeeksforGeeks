// User function Template for Java

class Sol {
    int closing(String s, int pos) {
        // your code here
        Stack<Character> st = new Stack<>();
        int idx=0;
        for(int i=pos;i<s.length();i++){
          if(s.charAt(i)=='['){
              st.push('[');
          }else if(s.charAt(i)==']'){
              st.pop();
              if(st.isEmpty()){
                  return i;
              }
          }
        }
        return -1;
    }
}