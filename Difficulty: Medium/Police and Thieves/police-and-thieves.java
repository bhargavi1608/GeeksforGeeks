class Solution {
    public int catchThieves(char[] arr, int k) {
        // code here
        ArrayList<Integer> policeIdx= new ArrayList<>();
        ArrayList<Integer> thievesIdx = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='P'){
                policeIdx.add(i);
            }else{
                thievesIdx.add(i);
            }
        }
        
        int i=0;
        int j=0;
        int maxCount=0;
        while(i<policeIdx.size() && j<thievesIdx.size()){
            int dist = Math.abs(policeIdx.get(i)-thievesIdx.get(j));
            if(dist<=k){
                maxCount++;
                i++;
                j++;
            }else if(policeIdx.get(i) < thievesIdx.get(j)){
                i++;
            }else{
                j++;
            }
            
            
        }
        return maxCount;
    }
}