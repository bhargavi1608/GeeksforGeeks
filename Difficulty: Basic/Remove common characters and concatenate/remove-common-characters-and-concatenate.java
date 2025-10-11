class Solution {
    public static String concatenatedString(String s1, String s2) {
        // code here
        StringBuilder sb = new StringBuilder();
        Set<Character> set1 = new HashSet<>();
        for(char c : s1.toCharArray()){
            set1.add(c);
        }
        Set<Character> set2 = new HashSet<>();
        for(char c:s2.toCharArray()){
            set2.add(c);
        }
        set1.retainAll(set2);
        Set<Character> common = new HashSet<>(set1);
        
        for(char c:s1.toCharArray()){
            if(!common.contains(c)){
                sb.append(c);
            }
        }
        for(char c:s2.toCharArray()){
            if(!common.contains(c)){
                sb.append(c);
            }
        }
        if(sb.length()==0){
            return "-1";
        }
        return sb.toString();
        
    }
}
