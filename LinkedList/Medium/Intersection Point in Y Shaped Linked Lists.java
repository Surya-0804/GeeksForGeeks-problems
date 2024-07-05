/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
 Linked List class
class LinkedList
{
    Node head;  // head of list
}*/

class Intersect
{
    //Function to find intersection point in Y shaped Linked Lists.
	int intersectPoint(Node head1, Node head2)
	{
         // code here
         Node ptr1 = head1;
         Node ptr2 = head2;
         
         while(ptr1 != ptr2){
             ptr1 = ptr1==null ? head2 : ptr1.next;
             ptr2 = ptr2==null ? head1 : ptr2.next;
         }
         return ptr1==null ? -1 : ptr1.data;
	}
}
