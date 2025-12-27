class Solution {
    public String reverseWords(String s) {
        // Code here
        s=s.trim();
        String[] arr = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(String str:arr){
            String word = str;
            for(char c:word.toCharArray()){
                stack.push(c);
            }
            while(!stack.isEmpty()){
                sb.append(stack.pop());
            }
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
      
        return sb.toString();
    }
}
