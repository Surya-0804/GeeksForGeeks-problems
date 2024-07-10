/*
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}
*/

class Solution {
    public void deleteAlt(Node head) {
        // Code Here
        if(head == null || head.next==null){
            return;
        }
        Node current=head;
        while(current != null && current.next != null){
            current.next=current.next.next;
            current=current.next;
        }
        
    }
}
