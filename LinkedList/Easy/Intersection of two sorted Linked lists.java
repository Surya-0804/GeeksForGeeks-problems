/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution
{
   public static Node findIntersection(Node head1, Node head2)
    {
        // code here.
        
        Node newList=new Node(0);
        Node current=newList;
        while(head1!=null && head2!=null){
            if(head1.data==head2.data){
                current.next=new Node(head1.data);
                current=current.next;
                head1=head1.next;
                head2=head2.next;
            }
            else if(head1.data<head2.data){
                head1=head1.next;
            }
            else{
                head2=head2.next;
            }
        }
        return newList.next;
    }
