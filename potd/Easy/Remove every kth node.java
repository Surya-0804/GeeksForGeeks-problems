/* Link list Node
class Node
{
	Node next;
	int data;
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/
class Solution
{
    /*You are required to complete this method*/
    Node delete(Node head, int k)
    {
	    // Your code here	
	    if(k==1)
	        return null;
	    int index=1;
	    Node current=head;
	    Node prev=null;
	    while(current!=null){
	        if(index%k==0){
	            prev.next=current.next;
	        }
	        else{
	            prev=current;
	        }
	        current=current.next;
	        index++;
	    }
	    return head;
    }
}
