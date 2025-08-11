class twoStacks {
    Stack<Integer> s1;
    Stack<Integer> s2;
    twoStacks() {
    s1 = new Stack<>();
    s2 = new Stack<>();
    }
    // Function to push an integer into the stack1.
    void push1(int x) {
        // code here
        s1.push(x);
    }

    // Function to push an integer into the stack2.
    void push2(int x) {
        s2.push(x);
        // code here
    }

    // Function to remove an element from top of the stack1.
        
    int pop1() {
        // code heres2
         if (s1.isEmpty()) {
            return -1;
        }
      int top =  s1.pop();
      return top;
        
    }

        
    // Function to remove an element from top of the stack2.
    int pop2() {
        // code here
         if (s2.isEmpty()) {
            return -1;
        }
        int top = s2.pop();
        return top;
    }
}