/*
class Node {
    int data;
    Node next, arb;

    Node(int d) 
    { 
        data = d;
        next = arb = null; 
        
    }
}*/

class Clone {
    //Function to clone a linked list with next and random pointer.
    Node copyList(Node head) {
        // your code here
        if(head==null)
            return null;
            
        Node temp=head;
        while(temp!=null){
            Node newNode=new Node(temp.data);
            newNode.next=temp.next;
            temp.next=newNode;
            temp=newNode.next;
        }
        
        temp=head;
        while(temp!=null){
            Node copy=temp.next;
            copy.arb=temp.arb==null ? null : temp.arb.next;
            temp=copy.next;
        }
        
        temp=head;
        Node dummy=new Node(-1);
        Node copy=dummy;
        while(temp != null){
            copy.next=temp.next;
            temp.next=temp.next.next;
            copy=copy.next;
            temp=temp.next;
        }
        return dummy.next;
    }
}
