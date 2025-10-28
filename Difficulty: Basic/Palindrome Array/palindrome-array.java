
class Solution {
    public static boolean isPerfect(int[] arr) {
        // code here
        int first = 0;
        int last = arr.length-1;
        while(first<last){
            if(arr[first]!=arr[last]){
                return false;
            }
            first++;
            last--;
        }
        return true;
    }
}
