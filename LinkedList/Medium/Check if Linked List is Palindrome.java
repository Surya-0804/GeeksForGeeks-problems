/* Structure of class Node is
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

class Solution
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        //Your code here
        Node tail=head;
        int len=0;
        while(tail.next!=null){
            tail=tail.next;
            len++;
        }
        tail=head;
        for(int i=0;i<(int)len/2;i++){
            tail=tail.next;
        }
        Node prev=null;
        Node current=tail;
        Node nextNode;
        while(current!=null){
            nextNode=current.next;
            current.next=prev;
            prev=current;
            current=nextNode;
        }
        tail=prev;
        current=head;
        while(current!=null && tail!=null){
            if(current.data!=tail.data){
                return false;
            }
            current=current.next;
            tail=tail.next;
        }
        return true;
    }    
}
