// User function Template for Java

class Solution {
    int findSum(int arr[]) {
        // code here
        Set<Integer> set = new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        int sum=0;
        for(int num:set){
            sum+=num;
        }
        return sum;
    }
}