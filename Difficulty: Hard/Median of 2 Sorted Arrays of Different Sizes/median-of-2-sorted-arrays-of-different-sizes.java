class Solution {
    public double medianOf2(int a[], int b[]) {
        // Code Here
        int i=a.length-1;
        int j=b.length-1;
        int k=a.length+b.length-1;
        int[] res = new int[k+1];
        while(i>=0 && j>=0){
            if(a[i]>=b[j]){
                res[k--]=a[i--];
            }else{
                res[k--]=b[j--];
            }
        }
        while(i>=0){
            res[k--]=a[i--];
        }
        while(j>=0){
            res[k--]=b[j--];
        }
        
        int len = res.length;
        if(len%2==0){
            return (res[len/2-1]+res[len/2])/2.0;
        }else{
            return res[len/2];
        }
    }
}