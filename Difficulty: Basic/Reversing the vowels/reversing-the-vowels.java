// User function Template for Java

class Solution {
    String modify(String s) {
        // your code here
        String vowels = "aeiouAEIOU";
        char[] arr = s.toCharArray();
        int left =0;
        int right = s.length()-1;
        while(left<=right){
            if(vowels.indexOf(arr[left])==-1){
                left++;
                continue;
            }
            if(vowels.indexOf(arr[right])==-1){
                right--;
                continue;
            }
            char temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return new String(arr);
    }
}