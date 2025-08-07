// User function Template for Java

class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int num:arr){
            if(num>=0){ 
                pos.add(num);
                
            }else{
                neg.add(num);
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        int m = Math.min(pos.size(),neg.size());
        for(int i=0;i<m;i++){
            res.add(pos.get(i));
            res.add(neg.get(i));
        }
        if(pos.size()>neg.size()){
            for(int i=neg.size();i<pos.size();i++){
                res.add(pos.get(i));
            }
        }
        else if(pos.size()<neg.size()){
            for(int i=pos.size();i<neg.size();i++){
                res.add(neg.get(i));
            }
        }
       for (int i = 0; i < arr.size(); i++) {
         arr.set(i, res.get(i));
        }
    }
}