class Solution {
    public int josephus(int n, int k) {
        // code here
        
        int survivor = 0; 

        for (int i = 1; i <= n; i++) {
            survivor = (survivor + k) % i;
        }

        return survivor + 1; 
    }
}