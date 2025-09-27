// User function Template for Java

class Solution {
    static int countTriplets(Node head, int x) {
        // code here.
        ArrayList<Integer> list = new ArrayList<>();
        Node temp= head;
        while(temp!=null){
            list.add(temp.data);
            temp=temp.next;
        }
        Collections.sort(list);
        int n = list.size();
        int count=0;
        for(int i=0;i<n-2;i++){
            int j=i+1;
            int k= n-1;
            while(j<k){
                int sum = list.get(i) + list.get(j) + list.get(k);
                if(sum==x){
                    count++;
                    j++;
                    k--;
                }else if(sum<x){
                    j++;
                }else{
                    k--;
                }
            }
        }
        return count;
    }
}