class Solution {
    // Function to remove duplicates from the given array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
      
        ArrayList<Integer> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        result.addAll(set);
        Collections.sort(result);
        return result;
    }
}
