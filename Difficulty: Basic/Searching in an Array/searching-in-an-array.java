// User function Template for Java
class Solution {
    public int search(int k, ArrayList<Integer> arr) {
        // code here
        int index = -1;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)==k){
                index = i+1;
                return index;
            }
        }
        return index;
    }
}