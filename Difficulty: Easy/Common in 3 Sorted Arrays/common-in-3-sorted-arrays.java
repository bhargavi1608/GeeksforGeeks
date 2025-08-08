// User function Template for Java

class Solution {
    // Function to find common elements in three arrays.
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
                                        List<Integer> arr3) {
        // Code Here
        HashSet<Integer> set1 = new HashSet<>(arr1);
        HashSet<Integer> set2 = new HashSet<>();
        for(int num:arr2){
            if(set1.contains(num)){
                set2.add(num);
            }
        }
        HashSet<Integer> set3 = new HashSet<>();
        for(int num:arr3){
            if(set2.contains(num)){
                set3.add(num);
            }
        }
        ArrayList<Integer> res = new ArrayList<>(set3);
        Collections.sort(res);
        return res;
        
    }
}