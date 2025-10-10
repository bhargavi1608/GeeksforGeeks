// User function Template for Java

class Solution {
    String uncommonChars(String s1, String s2) {
        // code here
        Set<Character> set1 = new HashSet<>();
        for(char c: s1.toCharArray()){
            set1.add(c);
        }
        Set<Character> set2 = new HashSet<>();
        for(char c: s2.toCharArray()){
            set2.add(c);
        }
        Set<Character> uncommon = new HashSet<>(set1);
        uncommon.removeAll(set2);
        Set<Character> temp = new HashSet<>(set2);
        temp.removeAll(set1);
        uncommon.addAll(temp);
        ArrayList<Character> list = new ArrayList<>();
        for(char c:uncommon){
            list.add(c);
        }
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for(char c : list){
            sb.append(c);
        }
        return sb.toString();
        
    }
}