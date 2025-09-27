class Solution {
    public Node removeAllDuplicates(Node head) {
        // code here
        if(head==null || head.next==null) return head;
        Node dummy = new Node(0);
        dummy.next=head;
        Node prev=dummy;
        while(head!=null){
            if(head.next!=null && head.data==head.next.data){
                int dupVal = head.data;
                while(head!=null && head.data==dupVal){
                    head=head.next;
                }
                prev.next=head;
            }else{
                prev=prev.next;
                head=head.next;
            }
        }
        return dummy.next;
    }
}