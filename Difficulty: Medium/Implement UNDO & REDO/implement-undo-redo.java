class Solution {
    StringBuilder document = new StringBuilder();
    Stack<Character> undo = new Stack<>();
    Stack<Character> redo = new Stack<>();
    
    public void append(char x) {
        // append x into document
        document.append(x);
        undo.push(x);
        redo.clear();
        
    }

    public void undo() {
        // undo last change
        if(!undo.isEmpty()){
            char last = undo.pop();
            document.deleteCharAt(document.length()-1);
            redo.push(last);
        }
    }

    public void redo() {
        // redo changes
        if(!redo.isEmpty()){
            char ch = redo.pop();
            document.append(ch);
            undo.push(ch);
        }
    }

    public String read() {
        // read the document
         return document.toString();
    }
}
