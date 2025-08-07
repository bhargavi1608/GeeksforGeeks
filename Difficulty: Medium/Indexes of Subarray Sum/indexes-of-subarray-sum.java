
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
      ArrayList<Integer> res = new ArrayList<>();
      int start=0;
      int end=0;
      int sum=0;
      for(int i=0;i<arr.length;i++){
          if(sum<target){
              sum+=arr[i];
              end=i;
              
          }if(sum>target){
              while(sum>target){
                sum-=arr[start];
                start++;
              }
          }else if(sum==target){
              break;
          }
         
    }
    if(sum==target){
        res.add(start+1);
        res.add(end+1);
    }else{
        res.add(-1);
    }
    return res;
    }
}
