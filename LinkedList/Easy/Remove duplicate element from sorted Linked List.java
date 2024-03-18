/*
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
	// Your code here
	    HashSet<Integer> set=new HashSet<>();
	    Node prev=null;
	    Node current=head;
	    Node nextNode=null;
	    while(current!=null){
	        nextNode=current.next;
	        if(set.contains(current.data)){
	            prev.next=nextNode;
	        }
	        else{
	            set.add(current.data);
    	        prev=current;

	        }
	        current=nextNode;
	    }
	    return head;
	    
    }
}
