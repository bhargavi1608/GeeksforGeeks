//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Sorting {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().inversionCount(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int mergeSort(int[] arr, int[] temp, int low, int high){
         
        int count=0;
        if(low<high){
            int mid = (low+high)/2;
            count+=mergeSort(arr,temp,low,mid);
            count+=mergeSort(arr,temp,mid+1,high);
            count+=merge(arr,temp,low,mid,high);
        }
        return count;
    }
    public static int merge(int[] arr, int[] temp, int low, int mid, int high){
        int i=low;
        int j=mid+1;
        int k=low;
        int count=0;
        while(i<=mid && j<=high){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                i++;
                k++;
            }
            else{
                temp[k]=arr[j];
                j++;
                k++;
                count+=(mid-i+1);
            }
        }
        while(i<=mid){
            temp[k]=arr[i];
            i++;
            k++;
        }
        while(j<=high){
            temp[k]=arr[j];
            j++;
            k++;
        }
        for(int x=low;x<=high;x++){
            arr[x]=temp[x];
        }
        return count;
        
    }
    
    // Function to count inversions in the array.
    static int inversionCount(int arr[]) {
        // Your Code Here
        int[] temp = new int[arr.length];
        return mergeSort(arr,temp,0,arr.length-1);
        
    }
}