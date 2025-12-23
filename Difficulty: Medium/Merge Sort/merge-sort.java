class Solution {

    void mergeSort(int arr[], int l, int r) {
        // code here
        if(l>=r) 
            return;
        int m = (l+r)/2;
        mergeSort(arr,l,m);
        mergeSort(arr,m+1,r);
        merge(arr,l,m,r);
    }
    void merge(int arr[],int l, int m, int r){
        int[] temp = new int[r-l+1];
        //temp array used to store the merged elements
        int i=l,j=m+1, k=0;
        while(i<=m && j<=r){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i++];
            }else{
                temp[k]=arr[j++];
            }
            k++;
        }
        while(i<=m){
            temp[k++]=arr[i++];
        }
        while(j<=r){
            temp[k++]=arr[j++];
        }
        //copy the sorted elements back to original array;
        for(int x=0;x<temp.length;x++){
            arr[l+x]=temp[x];
        }
        
    }
   
}