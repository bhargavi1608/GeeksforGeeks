class Solution {
    public int minParentheses(String s) {
        // code here
        int open =0;
        int close=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                open++;
            }else if(c==')'){
                if(open>0){
                    open--;
                }else{
                    close++;
                }
            }
        }
        return open+close;
    }
}
