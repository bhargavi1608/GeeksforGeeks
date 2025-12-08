// User function Template for Java

class GFG {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        int start=-1;
        int end=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                if(start==-1) start=i;
                end=i;
            }
        }
        res.add(start);
        res.add(end);
        return res;
        
    }
}
