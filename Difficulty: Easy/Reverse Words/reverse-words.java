class Solution {
    public String reverseWords(String s) {
        // Code here
        String[] arr = s.split("\\.");
        int left=0;
        int right=arr.length-1;
        while(left<right){
            String temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        StringBuilder sb = new StringBuilder();
        for(String word:arr){
            if(!word.isEmpty()){
            if(sb.length()>0 ) sb.append(".");
            sb.append(word);
            }
        }
        return sb.toString();
    }
}
