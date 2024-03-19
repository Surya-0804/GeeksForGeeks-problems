/* Linklist node structure
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/
/*You are required to complete below method*/
class GfG
{
    Node deleteNode(Node head, int x)
    {
	    // Your code here
	    if(x==1 && head.next!=null){
	        return head.next;
	    }
	    Node prev=null;
	    Node current=head;
	    while(current!=null && x!=1){
	        prev=current;
	        current=current.next;
	        x--;
	    }
	    if(current!=null){
	        prev.next=current.next;
	    }
	    return head;
    }
}
