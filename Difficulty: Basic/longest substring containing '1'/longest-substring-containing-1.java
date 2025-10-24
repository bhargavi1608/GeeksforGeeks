/*Complete the function below*/
class GfG {
    public int count(String s) {
        // add code here.
        int maxCount =0;
        int count =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count++;
                 maxCount=Math.max(count,maxCount);
            }else{
                count=0;
            }
           
        }
        return maxCount;
    }
}