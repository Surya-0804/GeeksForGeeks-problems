/*
class Node {
   int data;
   Node next;

  Node(int data) {
      this.data = data;
  }
}
*/
class Solution
{
    Node compute(Node head)
    {
        // your code here
        Node prev=null;
        Node current=head;
        Node nextNode=null;
        while(current!=null){
            nextNode=current.next;
            current.next=prev;
            prev=current;
            current=nextNode;
            
        }
        head=prev;
        
        Node temp;
        current = head;
        nextNode=head;
        while (current != null && current.next != null) {
            if (current.next.data < nextNode.data) {
                temp=current.next;
                current.next=temp.next;
            } else {
                current = current.next;
                nextNode=current;
            }
        }
        
        current=head;
        prev=null;
        while(current!=null){
            nextNode=current.next;
            current.next=prev;
            prev=current;
            current=nextNode;
        }
        head=prev;
        return head;
    }
}
