// User function Template for Java
class Solution {
    static ArrayList<Integer> getSum(int N) {
        // code here
        ArrayList<Integer> Sum = new ArrayList<>();
   
        int Esum=0;
        int Osum=0;
        for(int i=0;i<=N;i++){
            if(i%2==0){
                
                Esum+=i;
            }else{
                Osum+=i;
            }
        }
        Sum.add(Esum);
        Sum.add(Osum);
        return Sum;
    }
}