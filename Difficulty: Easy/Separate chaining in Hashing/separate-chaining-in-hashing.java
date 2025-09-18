class Solution {
    public ArrayList<ArrayList<Integer>> separateChaining(int hashSize, int[] arr) {
        // code here
        ArrayList<ArrayList<Integer>> table = new ArrayList<>();
        for(int i=0;i<hashSize;i++){
            table.add(new ArrayList<>());
        }
        for(int i=0;i<arr.length;i++){
            insert(arr[i],hashSize,table);
        }
        return table;
    }
    void insert(int key,int hashSize,ArrayList<ArrayList<Integer>> table){
        int i=key%hashSize;
        table.get(i).add(key);
    }
}