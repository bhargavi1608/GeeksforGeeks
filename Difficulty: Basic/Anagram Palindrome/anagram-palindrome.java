class Sol {
    int isPossible(String S) {
        // your code here
        Map<Character,Integer> map = new HashMap<>();
        for(char c:S.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        
        int f1 = 0;
        int odf =0;
        for(Map.Entry<Character,Integer> e: map.entrySet()){
            if(e.getValue() ==1){
                f1++;
                
            }
            if(e.getValue()%2!=0){
                odf++;
            }
            
            
        }
        
        if(f1>1 || odf >1){
            return 0;
        }
        return 1;
    }
}