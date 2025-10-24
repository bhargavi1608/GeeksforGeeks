class Solution {

    public static boolean isPanagram(String str) {
        // Your code here
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       str= str.toUpperCase();
        for(int i=0;i<s.length();i++){
            if(str.indexOf(s.charAt(i))==-1){
                return false;
            }
        }
        return true;
        
    }
}