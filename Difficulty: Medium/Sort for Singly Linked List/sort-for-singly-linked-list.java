// User function Template for Java

/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    */
class Solution {
    public static Node insertionSort(Node head_ref) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        while(head_ref!=null){
            list.add(head_ref.data);
            head_ref=head_ref.next;
        }
        Collections.sort(list);
        Node head = new Node(list.get(0));
        Node temp=head;
        for(int i=1;i<list.size();i++){
            Node newNode = new Node(list.get(i));
            temp.next=newNode;
            temp=temp.next;
        }
        return head;
    }
}