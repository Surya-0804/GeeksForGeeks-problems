/* node of linked list:

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

*/

class Solution{
    //Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        // add code here
        Node current=head;
        for(int i=1;i<k;i++){
            current=current.next;
        }
        Node tail=current;
        while(tail.next!=null){
            tail=tail.next;
        }
        tail.next=head;
        head=current.next;
        current.next=null;
        return head;
    }
}
