
class Solution {
    public static int maxProduct(int[] arr) {
        // code here
        int first_Max=Integer.MIN_VALUE;
        int second_Max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>first_Max){
                second_Max=first_Max;
                first_Max=arr[i];
                
            }else if(arr[i]>second_Max){
                second_Max=arr[i];
            }
        }
        return first_Max*second_Max;
    }
}
