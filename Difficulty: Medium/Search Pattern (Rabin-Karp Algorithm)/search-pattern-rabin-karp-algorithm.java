class Solution {
    
    
     private int[] computelps(String pat){
         int n = pat.length();
         int[] lps = new int[n];
         int i=1;
         int len =0;
         while(i<n){
             if(pat.charAt(i)==pat.charAt(len)){
                 len++;
                 lps[i]=len;
                 i++;
             }
             else{
                 if(len!=0){
                     len=lps[len-1];
                     i++;
                 }
                 else{
                     i++;
                 }
             }
             
         }
         return lps;
         
     }
  
    ArrayList<Integer> search(String pat, String txt) {
        // Code here
        ArrayList<Integer> result = new ArrayList<>();
        int n= txt.length();
        int m = pat.length();
        int[] lps = computelps(pat);
        int i=0;
        int j=0;
        while(i<n){
            if(txt.charAt(i)==pat.charAt(j)){
                i++;
                j++;
            }
            if(j==m){
                result.add(i-j+1);
                j=lps[j-1];
            }
            else if(i<n && txt.charAt(i)!=pat.charAt(j)){
                if(j!=0){
                    j= lps[j-1];
                }
                else{
                    i++;
                }
            }
        }
        return result;
      
    }
}