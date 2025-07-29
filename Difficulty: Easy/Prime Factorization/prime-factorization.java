class Solution {
    public static void printPrimeFactorization(int n) {
        // code here
        int i=2;
        while(i<=n){
            if(n%i==0){
                System.out.print(i+" ");
                 n/=i;
            }
         
            else{
            i++;
        }
        }
        
    }
}
