class Solution {
    int minDist(int arr[], int x, int y) {
        // code here
        int lastX = -1;
        int lastY =-1;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                lastX=i;
                if(lastY!=-1){
                    min=Math.min(min,Math.abs(lastX-lastY));
                }
            }
            if(arr[i]==y){
                lastY=i;
                if(lastX!=-1){
                    min=Math.min(min,Math.abs(lastX-lastY));
                }
            }
        }
        if(lastX==-1 || lastY==-1) return -1;
        return min;
    }
}