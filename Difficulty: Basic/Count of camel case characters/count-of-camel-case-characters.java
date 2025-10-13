// User function Template for Java

class Sol {
    int countCamelCase(String s) {
        // your code here
        String m = s.toUpperCase();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==m.charAt(i)){
                count++;
            }
        }
        return count;
    }
}