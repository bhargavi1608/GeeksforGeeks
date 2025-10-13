class Sol {
    int isPossible(String S) {
        // your code here
       Map<Character,Integer> map = new HashMap<>();
       for(char c:S.toCharArray()){
           map.put(c,map.getOrDefault(c,0)+1);
       }
       int oddCount=0;
       for(int value:map.values()){
           if(value%2!=0) oddCount++;
       }
       if(S.length()%2==0 && oddCount==0)  return 1;
       if(S.length()%2!=0 && oddCount==1) return 1;
       return 0;
       
        
    }
}