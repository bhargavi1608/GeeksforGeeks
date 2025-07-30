class Complete {
    public static ArrayList<Integer> array(int a[][], int b[], int n) {
        // Complete the function
        ArrayList<Integer> result = new ArrayList<>();
        int leftdignonal =0;
        for(int i=0;i<n;i++){
            leftdignonal+=a[i][i];
        }
        int max = b[0];
        for(int i=1;i<n;i++){
            if(b[i]>max){
                max=b[i];
            }
        }
        result.add(leftdignonal);
        result.add(max);
       
        return result;
        
       
    }
}
