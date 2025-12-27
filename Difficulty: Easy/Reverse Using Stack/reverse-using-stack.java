class Solution {
    public String reverse(String S) {
        // code here
        Stack<Character> stack = new Stack<>();
        String rev ="";
        for(char c:S.toCharArray()){
            stack.push(c);
        }
        while(!stack.isEmpty()){
            rev+=stack.pop();
        }
        return rev;
    }
}