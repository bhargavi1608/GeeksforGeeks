
class Solution {
    public String longest(List<String> arr) {
        // code here
        int[] len = new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            len[i]=arr.get(i).length();
            
        }
        int max =Integer.MIN_VALUE;
        int idx =-1;
        for(int i=0;i<len.length;i++){
            if(len[i]>max){
                max = len[i];
                idx=i;
            }
        }
        return arr.get(idx);
    
    }
}
