// User function Template for Java

class Solution {
    static String postToPre(String post_exp) {
        // code here
       Stack<String> stack = new Stack<>();
       for(char c:post_exp.toCharArray()){
           if(Character.isLetterOrDigit(c)){
               stack.push(c+"");
           }else{
               String op2 = stack.pop();
               String op1 = stack.pop();
               stack.push(c+op1+op2);
           }
       }
       return stack.pop();
        
        
    }
    public boolean isOperator(char c){
        return c=='+'||c=='-'||c=='*'||c=='/';
    }
}
