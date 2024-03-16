/*
class Node
{
	int data ;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}
*/

//Function to delete a node without any reference to head pointer.
class Solution
{
    void deleteNode(Node del_node)
    {
         // Your code here
         del_node.data=del_node.next.data;
         del_node.next=del_node.next.next;
    }
}
