class Solution {
    // Function to return a list of BST elements in a given range.
    public static ArrayList<Integer> printNearNodes(Node root, int low, int high) {
        // code here.
        ArrayList<Integer> res = new ArrayList<>();
        inorder(root,low,high,res);
        return res;
    }
    static void inorder(Node root,int low,int high,ArrayList<Integer> res){
        if(root==null) return;
        if(root.data>low){
            inorder(root.left,low,high,res);
        }
        if(root.data>=low && root.data<=high){
            res.add(root.data);
        }
        if(root.data<high){
            inorder(root.right,low,high,res);
        }
    }
}