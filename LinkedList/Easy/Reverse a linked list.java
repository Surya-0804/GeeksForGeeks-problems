class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        // code here 
        Node prev=null;
        Node ptr=head;
        Node next=null;
        while(ptr!=null){
            next=ptr.next;
            ptr.next=prev;
            prev=ptr;
            ptr=next;
        }
        head=prev;
        return head;
    }
}
