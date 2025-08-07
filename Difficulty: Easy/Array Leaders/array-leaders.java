class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        int n= arr.length;
        int maxFromRight= arr[n-1];
        res.add(maxFromRight);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=maxFromRight){
                maxFromRight=arr[i];
                res.add(maxFromRight);
            }
        }
        Collections.reverse(res);
        return res;
    }
}
