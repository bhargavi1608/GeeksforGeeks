/*Complete the function below*/
class Solution {
    public int findExtra(int a[], int b[]) {
        // add code here.
        int left =0;
        int right = b.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(a[mid]==b[mid]){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return left;
    }
}