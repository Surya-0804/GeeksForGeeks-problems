/* The structure of linked list is the following
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d; 
        next = null;
    }
}
*/

class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
         // Your code here
        HashSet<Integer> set=new HashSet<>();
        Node prev=null;
        Node current=head;
        while(current!=null){
            if(set.contains(current.data)){
                prev.next=current.next;
            }
            else{
                set.add(current.data);
                prev=current;
            }
            current=current.next;
        }
        return head;
    }
}
