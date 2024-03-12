/* Structure of node

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class Solution
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	// Your code here
    	Node ptr=head;
    	int len=0;
    	while(ptr!=null){
    	    ptr=ptr.next;
    	    len++;
    	}
    	if(n>len){
    	    return -1;
    	}
    	ptr=head;
    	for(int i=1;i<=len-n;i++){
    	    ptr=ptr.next;
    	}
    	return ptr.data;
    }
}
