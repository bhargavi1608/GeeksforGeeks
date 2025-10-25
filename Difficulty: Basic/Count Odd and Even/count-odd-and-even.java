class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        
        int OddCount = 0;
        int EvenCount = 0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                OddCount++;
            }else{
                EvenCount++;
            }
        }
        return new int[]{OddCount,EvenCount};
    }
}