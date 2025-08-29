class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
        Map<String, ArrayList<String>> map = new HashMap<>();
        for(String s : arr){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = new String(c);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
