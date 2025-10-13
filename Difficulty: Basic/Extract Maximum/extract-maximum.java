// User function Template for Java

class Solution {
    static int extractMaximum(String S) {
        // code here
       int max = -1;
       String num="";
       for(int i=0;i<S.length();i++){
           char c = S.charAt(i);
           if(Character.isDigit(c)){
               num+=c;
           }else{
               if(!num.isEmpty()){
                   max=Math.max(max,Integer.parseInt(num));
                   num="";
               }
           }
       }
       if(!num.isEmpty()){
           max = Math.max(max,Integer.parseInt(num));
       }
       return max;
        
    }
}
