// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        // code here
        char[] arr = s.toCharArray();
        reverse(arr,0,arr.length-1);
        return new String(arr);
    }
   static char[] reverse(char[] arr, int start,int end){
        if(start>=end) return arr;
        char temp = arr[start];
        arr[start] = arr[end];
        arr[end]=temp;
        return reverse(arr,start+1,end-1);
    }
}