class Solution {
    public int countSubstr(String s, int k) {
        //  code here
        return substr(s,k)-substr(s,k-1);
    }
    public int substr(String s,int k){
        HashMap<Character,Integer> map = new HashMap<>();
        int left=0;
        int count=0;
        for(int right=0;right<s.length();right++){
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
            while(map.size()>k){
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                if(map.get(s.charAt(left))==0){
                    map.remove(s.charAt(left));
                }
                left++;
            }
            count+=(right-left)+1;
        }
        return count;
    }
}