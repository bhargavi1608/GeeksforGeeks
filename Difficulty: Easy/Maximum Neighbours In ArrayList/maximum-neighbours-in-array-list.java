// User function Template for Java
class Solution {

    public static ArrayList<Integer> maxNeighbour(ArrayList<Integer> arr) {
        // Your code here
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<arr.size()-1;i++){
            res.add(Math.max(arr.get(i),arr.get(i+1)));
        }
        return res;
    }
}