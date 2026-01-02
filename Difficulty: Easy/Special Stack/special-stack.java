/*Complete the function(s) below*/
class GfG {
    public void push(int a, Stack<Integer> s) {
        // add code here.
        s.push(a);
    }

    public int pop(Stack<Integer> s) {
        // add code here.
        if(s.isEmpty()){
            return -1;
        }
        return s.pop();
    }

    public int min(Stack<Integer> s) {
        // add code here.
        if(s.isEmpty()){
            return -1;
        }
        Stack<Integer> temp = new Stack<>();
        int min = Integer.MAX_VALUE;
        while(!s.isEmpty()){
            int ele = s.pop();
            min=Math.min(ele,min);
            temp.push(ele);
        }
        while(!temp.isEmpty()){
            s.push(temp.pop());
        }
        return min;
    }

    public boolean isFull(Stack<Integer> s, int n) {
        // add code here.
        return s.size()==n;
    }

    public boolean isEmpty(Stack<Integer> s) {
        // add code here.
        return s.size()==0;
    }
}