// User function template for Java
class Solution {
    static int areAnagram(String S1, String S2) {
        // code here
        if(S1.length()!=S2.length()){
            return 0;
        }
        char[] charS1 = S1.toCharArray();
        char[] charS2 = S2.toCharArray();
        Arrays.sort(charS1);
        Arrays.sort(charS2);
        if(Arrays.equals(charS1,charS2)){
            return 1;
        }else{
            return 0;
        }
    }
}