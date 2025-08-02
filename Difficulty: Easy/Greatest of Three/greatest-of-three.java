// User function Template for Java
class Solution {

    public static int find_greatest_number(int a, int b, int c) {
        // Write your code here..
        int max=0;
        if(a>=b && a>=c){
            max=a;
        }else if(b>=a && b>=c){
            max=b;
        }else{
            max=c;
        }
        return max;
    }
}