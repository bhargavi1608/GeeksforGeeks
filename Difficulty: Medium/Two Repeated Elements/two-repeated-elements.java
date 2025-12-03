class Solution {
    public int[] twoRepeated(int[] arr) {
        // code here
       Set<Integer> seen = new HashSet<>();
       int[] arr1 = new int[2];
       int idx=0;
       for(int num:arr){
           if(seen.contains(num)){
               arr1[idx++]=num;
               if(idx==2) break;
           }
           seen.add(num);
       }
       return arr1;
    }
}