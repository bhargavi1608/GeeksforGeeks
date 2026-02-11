// User function Template for Java

class Solution {
    public int maxInstance(String s) {
        // Code here
        Map<Character,Integer> map = new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        
        int  b = map.getOrDefault('b',0);
        int  a = map.getOrDefault('a',0);
        int  l = map.getOrDefault('l',0)/2;
        int  o = map.getOrDefault('o',0)/2;
        int  n = map.getOrDefault('n',0);
        
        int c = Math.min(b,
                    Math.min(a,
                    Math.min(l,
                    Math.min(o,n))));
        return c;
    }
}