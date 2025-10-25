/*Complete the Function below*/
class Solution {
    public static boolean isPalinArray(int[] arr) {
        // add code here.
        for(int i=0;i<arr.length;i++){
            if(!checkPalindrone(arr[i])){
                return false;
            }
            
        }
        return true;
        
    }
    private static boolean checkPalindrone(int num){
        int original = num;
        int reverse =0;
        while(num!=0){
            int digit = num%10;
            reverse = reverse*10+digit;
            num=num/10;
        }
        if(original==reverse){
            return true;
        }
        return false;
        
    }
}