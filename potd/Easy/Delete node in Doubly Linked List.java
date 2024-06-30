/*

Definition for doubly Link List Node
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node deleteNode(Node head, int x) {
        if(x==1){
            head=head.next;
            head.prev=null;
            return head;
        }
        
        Node current=head;
        for(int i=1; i<x && current!=null; i++){
            current=current.next;
        }
        if(current==null)
            return head;
            
        if(current.next!=null)
            current.next.prev=current.prev;
            
        if(current.prev!=null)
            current.prev.next=current.next;
            
        return head;
    }
}
