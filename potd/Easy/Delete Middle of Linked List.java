/*
class Node {
    int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    Node deleteMid(Node head) {
        // This is method only submission.
        // You only need to complete the method.
        Node current=head;
        int len=0;
        while(current!=null){
            len++;
            current=current.next;
        }
        Node prev=null;
        current=head;
        for(int i=0;i<len/2;i++){
            prev=current;
            current=current.next;
        }
        prev.next=current.next;
        return head;
    }
}
