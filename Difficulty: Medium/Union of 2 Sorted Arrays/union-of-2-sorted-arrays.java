class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
      HashSet<Integer> set1 = new HashSet<>();
      HashSet<Integer> set2 = new HashSet<>();
      for(int num:a){
          set1.add(num);
      }
      for(int num:b){
          
          set2.add(num);
      }
      ArrayList<Integer> res= new ArrayList<>();
      for(int num:set1){
          res.add(num);
      }
      for(int num:set2){
          if(!set1.contains(num)){
              res.add(num);
          }
      }
      Collections.sort(res);
      return res;
     
    }
}
