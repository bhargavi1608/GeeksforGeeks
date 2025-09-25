class Solution {
    public ArrayList<String> generateBinary(int n) {
        // code here
        ArrayList<String> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            String Bin = Integer.toBinaryString(i);
            list.add(Bin);
        }
        return list;
    }
}
