class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int m = a.length;
        int n = b.length;
        int[] temp = new int[m+n];
        int i=0,j=0,l=0;
        while(i<m && j<n){
            if(a[i]<b[j]){
                temp[l]=a[i++];
            }else{
                temp[l]=b[j++];
            }
            l++;
            
        }
        while(i<m){
            temp[l++]=a[i++];
        }
        while(j<n){
            temp[l++]=b[j++];
        }
        return temp[k-1];
    }
}