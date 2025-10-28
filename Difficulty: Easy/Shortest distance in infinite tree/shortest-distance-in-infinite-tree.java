// User function Template for Java

class Solution {
    public int distance(int x, int y) {

        // code here
        int distance =0;
        while(x!=y){
            if(x>y){
                x/=2;
            }else{
                y/=2;
            }
            distance++;
        }
        return distance;
    }
}