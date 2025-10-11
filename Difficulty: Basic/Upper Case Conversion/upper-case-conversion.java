// User function Template for Java

class Solution {
    public String convert(String s) {
        // code here
        String[] arr = s.split(" ");
        for(int i=0;i<arr.length;i++){
          arr[i] = Character.toUpperCase(arr[i].charAt(0))+arr[i].substring(1);
        }
        return String.join(" ",arr);
    }
}