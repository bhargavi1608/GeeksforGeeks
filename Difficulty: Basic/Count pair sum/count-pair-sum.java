// User function Template for Java

class Solution {

    // function to count all pairs
    // from both the sorted arrays
    // whose sum is equal to a given
    // value
    static int countPairs(int arr1[], int arr2[], int x) {
        // code here.
        int count =0;
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0;i<arr2.length;i++){
            l.add(arr2[i]);
        }
        for(int i =0;i<arr1.length;i++){
            int complement = x-arr1[i];
            if(l.contains(complement)){
                count++;
            }
        }
        return count;
    }
}