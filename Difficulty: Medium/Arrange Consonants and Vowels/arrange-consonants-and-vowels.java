/*
Structure of node class is:
class Node {
    char data;
    Node next;

    public Node(char data){
        this.data = data;
        next = null;
    }
}
*/
class Solution {

    public Node arrangeCV(Node head) {
        // write code here and return the head of changed linked list
        Node ConsoDummy = new Node('0');
        Node conso = ConsoDummy;
        Node VowelDummy = new Node('0');
        Node Vowel = VowelDummy;
        
        while(head!=null){
            if(head.data=='a'||head.data=='e'||head.data=='i'||head.data=='o'||head.data=='u'){
                Vowel.next=head;
                Vowel=Vowel.next;
            }else{
                conso.next=head;
                conso=conso.next;
            }
            head=head.next;
        }
        Vowel.next=ConsoDummy.next;
        conso.next=null;
        return VowelDummy.next;
        
    }
}