class Solution {
    void leftRotate(int arr[], int k) {
        int[] temp = new int[arr.length];
        int n = arr.length;
        k=k%n;
        int x =0;
        for(int i=k;i<n;i++){
            temp[x]=arr[i];
            x++;
        }
        for(int i=0;i<k;i++){
            temp[x]=arr[i];
            x++;
            
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
    }
}
