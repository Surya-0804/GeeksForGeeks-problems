/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }*/

// sortedInsert method should return the head of the modified linked list.
class Solution {
    Node sortedInsert(Node head1, int key) {
        // Add your code here.
        Node newNode=new Node(key);
        if(head1==null || head1.data>=key){
            newNode.next=head1;
            return newNode;
        }
        Node current=head1;
        Node prev=null;
        while(current!=null && current.data<key){
            prev=current;
            current=current.next;
        }
        prev.next=newNode;
        newNode.next=current;
        return head1;
    }
}
