class Solution {
    public int evaluatePostfix(String[] arr) {
        // code here
        Stack<Integer> s = new Stack<>();
        for(String num:arr){
            if(isOperator(num)){
                if(!s.isEmpty()){
                    int op2 = s.pop();
                    int op1 = s.pop();
                    s.push(cal(op1,op2,num));
                }
            }else{
                s.push(Integer.parseInt(num));
            }
            
        }
        return s.pop();
        
    }
    public boolean isOperator(String op){
        return op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/") || op.equals("^");
    }
    
    public int cal(int a,int b, String op){
        switch(op){
            case "+":
                return a+b;
            case "-":
                return a-b;
            case "*":
                return a*b;
            case "/":
                return (int)Math.floorDiv(a,b);
            case "^":
                return (int)Math.pow(a,b);
            default:
                return -1;
        }
    }
}