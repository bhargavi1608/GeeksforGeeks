// User function Template for Java
class Solution {
    public static int nextPrime(int n) {

        // code here to find next prime number
        // return next prime number
        
        int next = n+1;
        while(true){
            if(isPrime(next)){
                
               return next;
            }
            next++;
        }
        
        
    }
        static boolean isPrime(int num){
            if(num<=1) return false;
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    return false;
                }
            }
            return true;
        }
     
    
}