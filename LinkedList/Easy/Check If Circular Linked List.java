class GfG
{
    boolean isCircular(Node head)
    {
	// Your code here
	    Node current=head;
	    while(current!=null){
	        current=current.next;
	        if(current==head){
	            return true;
	        }
	    }
	    return false;
    }
}
